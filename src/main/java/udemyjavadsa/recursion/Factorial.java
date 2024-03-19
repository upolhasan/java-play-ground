package udemyjavadsa.recursion;

public class Factorial {

    public int calculate(int n){

        if ( n < 0 ){
            return -1;
        }

        if ( n == 0 ){
            return 1;
        }
        return n * calculate( n-1 );
    }

}
