package udemyjavadsa.recursion;

public class Gcd {

    public int calculate( int a, int b ) {

        if ( b == 0 && a > 0 )
            return a;
        return calculate(b, a%b);

    }
}
