package udemyjms;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FirstQueue {

    public static void main(String[] args) {
        InitialContext initialContext = null;
        Connection connection = null;
        try {
            // Create initial JNDI context (jndi.properties)
            initialContext = new InitialContext();
            // look up the ConnectionFactory in JDNI registry (jndi.properties)
            ConnectionFactory connectionFactory = (ConnectionFactory) initialContext.lookup("ConnectionFactory");
            connection = connectionFactory.createConnection();
            Session session = connection.createSession();
            //Queue queue = session.createQueue("queue/myQueue");// from jndi.properties
            Queue queue = (Queue) initialContext.lookup("queue/myQueue");
            MessageProducer messageProducer = session.createProducer(queue);
            TextMessage textMessage = session.createTextMessage("I am the creator of my destiny");
            messageProducer.send(textMessage);
            System.out.println("Message sent: " + textMessage.getText());

            MessageConsumer consumer = session.createConsumer(queue);
            connection.start();
            TextMessage messageReceived = (TextMessage) consumer.receive();
            System.out.println(messageReceived.getText());

        } catch (NamingException | JMSException e) {
            throw new RuntimeException(e);
        } finally {
            if (initialContext!=null){
                try {
                    initialContext.close();
                } catch (NamingException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
