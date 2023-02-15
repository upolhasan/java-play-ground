package upol.leetcode.easy;

public class PalindromeWithStr {

  public boolean isPalindrome( int x ){

    StringBuffer str = new StringBuffer(Integer.toString(x));

    return str.toString().equals(str.reverse().toString());
  }

  public static void main(String[] args) {
    PalindromeWithStr palTest = new PalindromeWithStr();
    System.out.println("If Palindrome -121 " + palTest.isPalindrome(-121));
  }

}
