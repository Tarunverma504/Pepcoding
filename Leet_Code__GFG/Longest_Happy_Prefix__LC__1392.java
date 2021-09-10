package Leet_Code__GFG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
A string is called a happy prefix if is a non-empty prefix which is also a suffix (excluding itself).

Given a string s, return the longest happy prefix of s. Return an empty string "" if no such prefix exists.

 

Example 1:

Input: s = "level"
Output: "l"
Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".
Example 2:

Input: s = "ababab"
Output: "abab"
Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.
Example 3:

Input: s = "leetcodeleet"
Output: "leet"
Example 4:

Input: s = "a"
Output: ""
 

Constraints:

1 <= s.length <= 105
s contains only lowercase English letters.
*/
public class Longest_Happy_Prefix__LC__1392 {
    public static void main(String arg[]){
        /*
        HINT:- USE KMP ALGO
        */
        /*
        https://leetcode.com/problems/longest-happy-prefix/
        */
    }
    static class Solution {
        public String longestPrefix(String s) {
            if(s.length()==1)
                return "";
            int lps[]=new int[s.length()];
            lps[0]=0;
            int i=1;
            int len=0;
            while(i<s.length()){
                if(s.charAt(i)==s.charAt(len)){
                    len++;
                    lps[i]=len;
                    i++;
                }
                else{
                    if(len!=0){
                        len=lps[len-1];
                    }
                    else{
                        lps[i]=len;
                        i++;
                    }
                }
            }
            return s.substring(0,len);
        }
    }
}
