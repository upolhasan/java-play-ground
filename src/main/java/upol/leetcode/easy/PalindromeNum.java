package upol.leetcode.easy;

public class PalindromeNum {

  public boolean isPalindrome(int x) {

    if ( x < 0 ) return false;
    int current = x;
    long reverse = 0;

    // 145
    // r: 5  c:14
    // r: 5*10 + 4   c: 1
    // r: 54*10 + 1

    while ( current > 0 ) {

      reverse = reverse * 10 + ( current % 10 );
       current = current / 10;
    }

    return x == reverse;

  }

}
