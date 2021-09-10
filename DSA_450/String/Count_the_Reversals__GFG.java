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
Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to convert the string into a balanced expression.
A reversal means changing '{' to '}' or vice-versa.

Example 1:

Input:
S = "}{{}}{{{"
Output: 3
Explanation: One way to balance is:
"{{{}}{}}". There is no balanced sequence
that can be formed in lesser reversals.
â€‹Example 2:

Input: 
S = "{{}{{{}{{}}{{"
Output: -1
Explanation: There's no way we can balance
this sequence of braces.
Your Task:
You don't need to read input or print anything. Your task is to complete the function countRev() which takes the string S as input parameter and returns the minimum number of reversals required to balance the bracket sequence. If balancing is not possible, return -1. 

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ |S| ≤ 105
*/

import java.util.*;
public class Count_the_Reversals__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1#
        */
    }
    static class Sol
    {
        int countRev (String s)
        {
            // your code here 
            if(s.length()%2!=0)
                return -1;
            Stack<Character> stack=new Stack<Character>();
            int c1=0;   //counter of { bracket
            int c2=0;   // counter of } bracket
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='{'){
                    stack.push('{');
                    c1++;
                }
                else if(!stack.isEmpty() && s.charAt(i)=='}' && stack.peek()=='{'){
                    stack.pop();
                    c1--;
                }
                else
                    c2++;

            }

            c1=c1/2+c1%2;
            c2=c2/2+c2%2;
            //System.out.println(c1+" "+c2);
            return c1+c2;
        }
    }
}
