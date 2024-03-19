package upol.leetcode.warmup;

public class BiNumber {

    /*
    * https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/quiz/5941500#questions
    * */
    private int number1;
    private int number2;

    /**
     * Constructor that initializes the two numbers.
     * @param number1: The first number.
     * @param number2: The second number.
     */
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Getter for the first number.
     * @return the first number.
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Getter for the second number.
     * @return the second number.
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * The least common multiple (LCM) of two integers a and b is the smallest positive integer that is divisible by both a and b.
     * In other words, the LCM of a and b is the smallest number that is a multiple of a and b.
     *
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateLCM() {
        // 15, 20
        int max = Math.max(number1, number2); // 40
        int min = Math.min(number1, number2);
        int res = max;
        boolean found = false;
        // 15, 20
        if ( min == 0 ){
            
            return 0;
        } else if ( min < 0 ){
            
            return -1;
        }
        
        for ( int i = 2; found == false; i++ ){
            
            if ( res % number1 == 0 && res % number2 == 0 ) {
                found = true;
            } else {
                res = max * i; 
            }
        }

        return res;
    }

    /**
     * The GCD of two numbers is the largest number that divides both of them without leaving a remainder.
     *
     * Calculates and returns the greatest common divisor (GCD) of the two numbers.
     * Edge case: If either number is negative, returns 1 as the GCD for negative numbers is 1.
     * Edge case: If either number is zero, returns 0 as the GCD of 0 and any other number is 0.
     * Edge case: If two numbers are equal, returns the number as the GCD of two equal numbers is the number itself.
     * @return GCD of the two numbers, or 1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateGCD() {
        // 48, 18
        int gcd = 0; // 1, 2, 3, 6
        int minNum = Math.min(number1, number2);

        for ( int i = 1; i <= minNum; i++ ){

            if ( number1 % i == 0 && number2 % i == 0 ){
                gcd = Math.max(gcd, i);
            }
        }

        return gcd;
    }
}