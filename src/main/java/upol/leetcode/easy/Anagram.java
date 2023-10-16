package upol.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/valid-anagram/
* Problem # 242
*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*
* */
public class Anagram {

    public boolean isAnagram(String s, String t){

        if ( s.length() != t.length() ){
            return false;
        }

        Map<Character, Integer> trackerS = new HashMap<>();
        Map<Character, Integer> trackerT = new HashMap<>();

        for (char c: s.toCharArray()){
            trackerS.putIfAbsent(c, 1);
            trackerS.put(c, trackerS.get(c)+1);
        }

        for (char c: t.toCharArray()){
            trackerT.putIfAbsent(c, 1);
            trackerT.put(c, trackerT.get(c)+1);
        }

//        trackerS.forEach((key, value)->{
//            if (trackerT.get(key)!=value)
//                isAnagram = false;
//        });

        long mismatchCount = trackerS.entrySet().stream().filter(entry -> {
            return entry.getValue() != trackerT.get(entry.getKey());
        }).count();

        if (mismatchCount < 1 )
            return true;

        return false;
    }

    // Not usable for Unocide or case sensitivity
    public boolean isAnagram1( String s, String t ){

        if ( s.length() != t.length() ){
            return false;
        }
       return Arrays.equals( s.chars().sorted().toArray(),  t.chars().sorted().toArray() );

    }

    public boolean isAnagram2( String s, String t ){


        if ( s.length() != t.length() ){
            return false;
        }

        int[] chars = new int[26];

        for (char c: s.toLowerCase().toCharArray() ){
            chars[c-'a']++;
        }
        for (char c: t.toLowerCase().toCharArray()){
            chars[c-'a']--;
        }
        for (int c: chars) {
            if ( c != 0) {
                return false;
            }
        }

        return true;
    }
}
