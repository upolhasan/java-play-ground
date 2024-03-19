package udemyjavadsa.recursion;

public class Fibonacci {

    // Calculates nth Fibonacci number
    //  n ->  0, 1, 2, 3, 4, 5, 6, 7, 8
    // Fib -> 0, 1, 1, 2, 3, 5, 8, 13, 21

    public int calculate( int n ) {

        if ( n < 0 ){
            return -1;
        }
        if ( n == 0 || n == 1 ){
            return n;
        }
        return calculate( n - 1 ) + calculate( n - 2);
    }

    public int fibMemoized( int n ) {
        return fibMemoized(n, new int[n+1]);
    }

    private int fibMemoized(int n, int[] memo) {

        if ( n == 0 ) {
            return 0;
        }
        if ( n == 1 ) {
            return 1;
        }

        if ( memo[n] == 0 ) {
            memo[n] = fibMemoized(n-1, memo ) + fibMemoized( n - 2, memo );
        }

        return memo[n];
    }

    public int fibIterative( int n ) {
         int a = 0, b = 1;
         int fib = 0;

         if ( n == 0 ){
             return 0;
         }

         if ( n == 1) {
             return 1;
         }

         for ( int i = 2; i <= n; i++ ) {
             fib = a + b;
             a = b;
             b = fib;
         }

         return fib;
    }
}
