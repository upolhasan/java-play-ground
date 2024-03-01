package udemyjms;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FirstTopic {
    public static void main(String[] args) {

        InitialContext initialContext = null;
        Connection connection = null;

        try {
            initialContext = new InitialContext();
            ConnectionFactory connectionFactory = (ConnectionFactory) initialContext.lookup("ConnectionFactory");
            Topic topic = (Topic) initialContext.lookup("topic/myTopic");

            connection = connectionFactory.createConnection();
            Session session = connection.createSession();
            MessageProducer producer = session.createProducer(topic);

            MessageConsumer consumer1 = session.createConsumer(topic);
            MessageConsumer consumer2 = session.createConsumer(topic);

            TextMessage textMessage = session.createTextMessage("Broadcasting Message");

            producer.send(textMessage);
            System.out.println("Produce sending the message: " + textMessage.getText());

            connection.start();

            TextMessage message1 = (TextMessage) consumer1.receive();
            System.out.println("1st received message: " + message1.getText());
            TextMessage message2 = (TextMessage) consumer2.receive();
            System.out.println("2nd received message: " + message2.getText());

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
