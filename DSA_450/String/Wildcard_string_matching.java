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
import java.util.*;
/*
    Given two strings wild and pattern where wild string may contain wild card characters and pattern string is a normal string. Determine if the two strings match. The following are the allowed wild card characters in first string :-

* --> This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string.
? --> This character in string wild can be replaced by any one character.
Example 1:

Input: wild = ge*ks
       pattern = geeks
Output: Yes
Explanation: Replace the '*' in wild string 
with 'e' to obtain pattern "geeks".
Example 2:

Input: wild = ge?ks*
       pattern = geeksforgeeks
Output: Yes
Explanation: Replace '?' and '*' in wild string with
'e' and 'forgeeks' respectively to obtain pattern 
"geeksforgeeks"

Your Task:
You don't need to read input or print anything. Your task is to complete the function match() which takes the string wild and pattern as input parameters and returns true if the string wild can be made equal to the string pattern, otherwise, returns false.
*/
public class Wildcard_string_matching {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/wildcard-string-matching1126/1
        */
    }
    static class Solution{
        static boolean match(String wild, String pattern)
        {
            // code here
            int[][] dp = new int[pattern.length()+1][wild.length()+1];
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    dp[i][j]=-1;
                }
            }
            if(sol(pattern, wild, pattern.length(), wild.length(),dp)==1)
                return true;
            return false;
        }

        public static int sol(String s, String p, int i, int j, int[][] dp){
            if(i==0){
                if(j==0)
                    return 1;
                else if(p.charAt(j-1)!='*')
                    return 0;
                else
                   return sol(s,p, i,j-1, dp);
            }
            if(j==0)
                return 0;
            if(dp[i][j]!=-1)
                return dp[i][j];
            if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                dp[i][j] = sol(s, p, i-1, j-1, dp);
                return dp[i][j];
            }
            else if(p.charAt(j-1)=='*'){
                int c1 = sol(s, p, i, j-1, dp);
                int c2 = sol(s, p, i-1, j, dp);
                dp[i][j]= Math.max(c1, c2);
                return dp[i][j];
            }
            else
                return 0;


        }
    }
}
