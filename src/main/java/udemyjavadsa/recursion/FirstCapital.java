package udemyjavadsa.recursion;

public class FirstCapital {
    public char first(String str) {
        if ( str != null && str.length() > 0) {
            String firstChar = Character.toString(str.charAt(0));
            if (firstChar.equals(firstChar.toUpperCase())) {
                return firstChar.charAt(0);
            } else if (str.length() > 1) {
                return first(str.substring(1));
            }
        }
        return '\0';
    }
}