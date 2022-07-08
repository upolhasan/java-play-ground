package udemyjavadsa.recursion;

public class Palindrome {

    public  boolean isPalindrome(String s)
    {
      if (s.length() == 1 || (s.charAt(0) == (s.charAt(s.length() - 1)) && s.length() == 2)) {
        return true;
      }
      if (s.charAt(0) == (s.charAt(s.length() - 1)) && s.length() > 2) {
        return isPalindrome(s.substring(1, s.length() - 1));
      }

       return false;
    }

}