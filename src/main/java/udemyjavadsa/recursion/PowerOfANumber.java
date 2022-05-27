package udemyjavadsa.recursion;

public class PowerOfANumber {

    public int calculate( int base, int exp ){

        if ( exp == 0 )
            return 1;

        return base * calculate( base, exp - 1 );
    }
}
