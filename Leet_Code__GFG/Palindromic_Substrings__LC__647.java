/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */
/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.
*/
import java.util.*;
public class Palindromic_Substrings__LC__647 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/palindromic-substrings/
        */
    }
    class Solution {
        public int countSubstrings(String s) {
            boolean arr[][]=new boolean[s.length()][s.length()];
            int count=0;
            for(int g=0;g<s.length();g++){
                for(int i=0,j=g;j<s.length();i++,j++){
                    if(g==0)
                        arr[i][j]=true;
                    else if(g==1)
                        arr[i][j]=s.charAt(i)==s.charAt(j);
                    else{
                        if(s.charAt(i)==s.charAt(j) && arr[i+1][j-1]==true)
                            arr[i][j]=true;
                        else
                            arr[i][j]=false;
                    }
                    if(arr[i][j])
                        count++;
                }
            }
            return count;
        }
    }
}
