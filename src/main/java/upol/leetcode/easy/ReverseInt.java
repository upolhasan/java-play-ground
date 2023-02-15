package upol.leetcode.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseInt {

  public Integer get( Integer x ){

    Integer input = x;
    Double reverse = 0.0;
    Integer decimalPlace = 0;

    List<Integer> digits = new ArrayList<>();

    while ( (input /10) > 0 ){
      digits.add(input % 10);
      decimalPlace++;
      input = input/10;
    }

    if (input < 10 )
      digits.add(input);

    final Iterator<Integer> iterator = digits.iterator();

    while(iterator.hasNext()){
      reverse += iterator.next() * Math.pow(10,decimalPlace);
      decimalPlace--;
    }

    return reverse.intValue();

  }

  public static void main(String[] args) {
    System.out.println("reverse of 1 is " + new ReverseInt().get(214748364));
  }

}
