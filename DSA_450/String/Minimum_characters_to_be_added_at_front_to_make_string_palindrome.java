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
    Given string str of length N. The task is to find the minimum characters to be added at the front to make string palindrome.
Note: A palindrome is a word which reads the same backward as forward. Example: "madam".

Example 1:

Input:
S = "abc"
Output: 2
Explanation: 
Add 'b' and 'c' at front of above string to make it
palindrome : "cbabc"
Example 2:

Input:
S = "aacecaaa"
Output: 1
Explanation: Add 'a' at front of above string
to make it palindrome : "aaacecaaa"
Your Task: 
You don't need to read input or print anything. Your task is to complete the function minChar() which takes a string S and returns an integer as output.
*/
public class Minimum_characters_to_be_added_at_front_to_make_string_palindrome {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/minimum-characters-to-be-added-at-front-to-make-string-palindrome/1
        */
    }
    static class Solution {
        public static int minChar(String str) {
           //Write your code here
           for(int j=str.length()-1;j>=0;j--){
               if(isPalidrome(str, j)){
                   return str.length()-j-1;
               }
           }
           return 0;
        }

        public static boolean isPalidrome(String str, int r){
            int l=0;
            while(l<=r){
                if(str.charAt(l)==str.charAt(r)){
                    r--;
                    l++;
                }
                else{
                    return false;
                }
            }
            return true;
        }
    }
}
