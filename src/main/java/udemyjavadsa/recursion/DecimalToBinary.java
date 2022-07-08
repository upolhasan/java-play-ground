package udemyjavadsa.recursion;

public class DecimalToBinary {

  public String convert( int decimal ) {
    if ( decimal / 2 == 0  )
      return "1";
    if ( decimal < 0 )
      return "-1";
      return convert(decimal / 2) + decimal % 2;

  }

  public int convertAsNumber ( int decimal ){
    if ( decimal == 0 ) {
      return  0;
    }
    if (decimal < 0){
      return -1;
    }
    return  (decimal % 2)  + convertAsNumber( decimal / 2) * 10 ;
  }

}
