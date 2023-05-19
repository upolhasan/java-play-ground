package upol.corejava;

public class RandomNumber {

    public static void main( String args[] ) {
      int min = 1000;
      int max = 9999;

      //Generate random int value from 1000 to 10000
      System.out.println("Random value in int from "+min+" to "+max+ ":");
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      System.out.println(random_int);
    }


}
