/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_and_StringBuilders;

/**
 *
 * @author Mind_Coder
 */

/*

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

Your Task:
You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.' 


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)


Constraints:
1 <= |S| <= 2000
*/
import java.util.*;
public class Reverse_words_in_a_given_string__EASY__GFG {
    public static void main(String[] arg){
        /*
            https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1/?category[]=Strings&category[]=Strings&difficulty[]=0&page=1&sortBy=submissions&query=category[]Stringsdifficulty[]0page1sortBysubmissionscategory[]Strings
        */
    }
    String reverseWords(String S)
    {
        // code here
        String[] a=S.split("\\.");
        S="";
        for(int i=a.length-1;i>0;i--){
            S=S+a[i]+".";
        }
        S=S+a[0];
        return S;
    }
    
}
