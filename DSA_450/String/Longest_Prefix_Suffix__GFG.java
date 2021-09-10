/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.String;

/**
 *
 * @author Mind_Coder
 */
/*
Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

Example 1:

Input: s = "abab"
Output: 2
Explanation: "ab" is the longest proper 
prefix and suffix. 
Example 2:

Input: s = "aaaa"
Output: 3
Explanation: "aaa" is the longest proper 
prefix and suffix. 
Your task:
You do not need to read any input or print anything. The task is to complete the function lps(), which takes a string as input and returns an integer.

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(|s|)

Constraints:
1 ≤ |s| ≤ 105
s contains lower case English alphabets
*/
import java.util.*;
public class Longest_Prefix_Suffix__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1#
        */
    }
    static class Solution {
        int lps(String s) {
            // code here
            int lps[]=new int[s.length()];
            int len=0;
            int i=1;
            lps[0]=0;
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
            return lps[s.length()-1];
        }
    }
}
