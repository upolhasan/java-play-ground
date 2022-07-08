package udemyjavadsa.recursion;

public class Capitalize {
  public static String capitalizeWord(String str){

    // input: i love java
    // output: I love Java
    if ( str != null  ){

      if (str.length()==1){
        return str.toUpperCase();
      }

      if ( str.length() > 0 ){
        if ( str.charAt(str.length()) == ' ' ){

        }
        return capitalizeWord(str.substring(0, str.length()-1));
      }

    }

    return str;
  }  

}