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
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters (lower-case and/or upper-case),
*/
public class Longest_Palindromic_Substring__LC__5 {
    public static void main(String[] agr){
        /*
        https://leetcode.com/problems/longest-palindromic-substring/
        */
    }
    class Solution {
        public String longestPalindrome(String s) {

            boolean arr[][]=new boolean[s.length()][s.length()];
            String str;
            int start=0,end=0,len=0;
            for(int g=0;g<s.length();g++){
                for(int i=0,j=g;j<s.length();j++,i++){
                    if(g==0)
                        arr[i][j]=true;
                    else if(g==1)
                        arr[i][j]=s.charAt(i)==s.charAt(j);
                    else{
                        if(arr[i][j]=s.charAt(i)==s.charAt(j) && arr[i+1][j-1]==true)
                            arr[i][j]=true;
                        else
                            arr[i][j]=false;
                    }
                    if(arr[i][j]==true && len<g+1){
                        len=g+1;
                        start=i;
                        end=j+1;
                    }
                }
            }
            return s.substring(start,end);
        }
    }
}
