package upol.leetcode.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringMagic {

    public boolean areAnagrams(String str1, String str2) {
    
       return getSortedCharString(str1).equals(getSortedCharString(str2)) ? true : false;
        
    }
    
    private String getSortedCharString( String str ) {
        
        if ( str == null || str.length() < 1 ) {
            return "";
        }

        List<Character> chars = new ArrayList<>();

        for ( Character ch: str.toLowerCase().toCharArray() ) {
            chars.add(ch);
        }

        Collections.sort(chars);
        StringBuffer buf = new StringBuffer();
        
        for( Character ch: chars ) {
            buf.append(ch);
        }
        
        return buf.toString();
        
    }
}