
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
Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index ).


Example 1:

Input:
S = "aaaabbaa"
Output:
aabbaa
Explanation:
The longest palindrome string present in
the given string is "aabbaa".

Your Task:  
You don't need to read input or print anything. Your task is to complete the function longestPalindrome() which takes string S as input parameters and returns longest pallindrome present in string.


Expected Time Complexity: O(|S|2)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ |S| ≤ 104
*/
import java.util.*;
public class Longest_Palindromic_Substring__MEDIUM__GFG {
    public static void main(String[] arg){
        /*
        Question:- "https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string1956/1/?category[]=Strings&category[]=Strings&difficulty[]=1&page=1&query=category[]Stringsdifficulty[]1page1category[]Strings#"
        */
    }
    int start=0,end=0,len=0;
    String longestPalindrome(String S){
        // code here
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<=S.length();j++){
                if(isPalidrom(S.substring(i,j),i,j)){
                    if(j-i>len){
                       len=j-i;
                       start=i;
                       end=j;
                    }
                    
                }
            }
        }
        return S.substring(start,end);
    }
    public static boolean isPalidrom(String str,int start,int end){
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
