package upol.functional;

public class RunLengthOfString {

    public static void main( String args[]){

        LengthOfStringInterface lengthOfStringInterface = (str)-> str.length();
        System.out.println(lengthOfStringInterface.length("CheckStringLength"));

    }
}
