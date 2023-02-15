package upol.leetcode.easy;

/*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
* */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuffer commonPrefix = new StringBuffer();
        String toCompare = null;

        for(String str:strs){
            //toCompare = str.charAt()
        }

        return toCompare;
    }
}
