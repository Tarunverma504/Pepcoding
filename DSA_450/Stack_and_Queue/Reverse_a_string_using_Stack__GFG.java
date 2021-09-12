/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Stack_and_Queue;

/**
 *
 * @author Mind_Coder
 */
/*
You are given a string S, the task is to reverse the string using stack.

 

Example 1:


Input: S="GeeksforGeeks"
Output: skeeGrofskeeG
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function reverse() which takes the string S as an input parameter and returns the reversed string.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

 

Constraints:
1 ≤ length of the string ≤ 100
*/
import java.util.*;
public class Reverse_a_string_using_Stack__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1#
        */
    }
    static class Solution {
        public String reverse(String S){
            //code here
            Stack<Character> stack=new Stack<Character>();
            for(int i=0;i<S.length();i++)
                stack.push(S.charAt(i));
            S="";
            while(!stack.isEmpty()){
                S=S+stack.pop();

            }
            return S;
        }

    }
}
