package udemyjavadsa.recursion;

public class SumOfDigits {

    public int calculate(int number){

        if ( number <= 0 ){
            return 0;
        }
        return number%10 + calculate(number/10);
    }
}
