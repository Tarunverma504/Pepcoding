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
Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index).


Example 1:

Input:
S = "aaaabbaa"
Output: aabbaa
Explanation: The longest Palindromic
substring is "aabbaa".
Example 2:

Input: 
S = "abc"
Output: a
Explanation: "a", "b" and "c" are the 
longest palindromes with same length.
The result is the one with the least
starting index.

Your Task:
You don't need to read input or print anything. Your task is to complete the function longestPalin() which takes the string S as input and returns the longest palindromic substring of S.


Expected Time Complexity: O(|S|2).
Expected Auxiliary Space: O(1).


*/
import java.util.*;
public class Longest_Palindrome_in_a_String__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1#
        */
    }
    static class Solution{
        static String longestPalin(String s){
            // code here
            boolean dp[][]=new boolean[s.length()][s.length()];
            int start=0,end=0,len=0;
            for(int g=0;g<s.length();g++){
                for(int i=0,j=g;j<dp.length;i++,j++){
                    if(g==0)
                        dp[i][j]=true;
                    else if(g==1){
                        if(s.charAt(i)==s.charAt(j)){
                            dp[i][j]=true;
                        }
                        else
                        dp[i][j]=false;
                    }
                    else{
                        if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true)
                            dp[i][j]=true;
                        else
                            dp[i][j]=false;
                    }
                    if(dp[i][j]==true && len<g+1){
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
