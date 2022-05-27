package upol.functional;

public class RunFunInterface {

    public static void main( String args[]){

        MyFunInterface myFunInterface = () -> System.out.println("Upol");
        myFunInterface.myName();

    }
}
