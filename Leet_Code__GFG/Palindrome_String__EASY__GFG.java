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
Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
 

Your Task:  
You don't need to read input or print anything. Complete the function isPlaindrome() which accepts string S and returns a boolean value


Expected Time Complexity: O(Length of S) 
Expected Auxiliary Space: O(1) 


Constraints:
1 <= Length of S <= 105
*/
public class Palindrome_String__EASY__GFG {
    public static void main(String[] arg){
        /*
        Question:- "https://practice.geeksforgeeks.org/problems/palindrome-string0817/1/?category[]=Strings&category[]=Strings&page=1&query=category[]Stringspage1category[]Strings"
        */
    }
    int isPlaindrome(String S) {
        // code here
        int l=0,r=S.length()-1;
        while(l<r){
            if(S.charAt(l)==S.charAt(r)){
                l++;
                r--;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
