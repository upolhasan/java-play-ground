package upol.leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<String, Integer> valueMapping = new HashMap<>();
        valueMapping.put("I", 1);
        valueMapping.put("V", 5);
        valueMapping.put("X", 10);
        valueMapping.put("L", 50);
        valueMapping.put("C", 100);
        valueMapping.put("D", 500);
        valueMapping.put("M", 1000);
        valueMapping.put("IV", 4);
        valueMapping.put("IX", 9);
        valueMapping.put("XL", 40);
        valueMapping.put("XC", 90);
        valueMapping.put("CD", 400);
        valueMapping.put("CM", 900);

        String subStr = null;
        Integer intVal = 0;
        Character ch = null;

        for( int i = 0; i < s.length(); i++ ){
            ch = s.charAt(i);

            if ( ch.equals('I') ||  ch.equals('X') ||  ch.equals('C') ){

                if( s.length() - i > 1){

                    subStr = s.substring(i, i+2);

                    if (valueMapping.get(subStr) != null ){
                        intVal = intVal + valueMapping.get(subStr);
                        i++;
                        continue;
                    }
                }
            }
            intVal = intVal + valueMapping.get(String.valueOf(ch));
        }
        return intVal;
    }
}
