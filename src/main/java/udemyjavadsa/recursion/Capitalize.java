package udemyjavadsa.recursion;

public class Capitalize {
  public static String capitalizeWord(String str){

    // input: i love java
    // output: I love Java
      if (str.length()==1){
        return str.toUpperCase();
      }
      if (str.length() <= 1){
        return str;
      }
      int idOfSpace = str.lastIndexOf(" ");

      if ( idOfSpace > 0 ){

           return capitalizeWord(str.substring(0, idOfSpace))
                   + String.valueOf(str.charAt(idOfSpace + 1)).toUpperCase() + str.substring(idOfSpace);
      }

      return String.valueOf(str.charAt(0)) + str.substring(0);
  }  

}