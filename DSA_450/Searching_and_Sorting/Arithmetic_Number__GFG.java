/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Searching_and_Sorting;

/**
 *
 * @author Mind_Coder
 */
/*
Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not.

Example 1:

Input: A = 1, B = 3, C = 2
Output: 1
Explaination: 3 is the second term of the 
sequence starting with 1 and having a common 
difference 2.
Example 2:

Input: A = 1, B = 2, C = 3
Output: 0
Explaination: 2 is not present in the sequence.
Your Task:
You do not need to read input or print anything. Your task is to complete the function inSequence() which takes A, B and C and returns 1 if B is present in the sequence. Otherwise, returns 0.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
-109 ≤ A, B, C ≤ 109  

Company Tags
*/
import java.util.*;
public class Arithmetic_Number__GFG {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/arithmetic-number2815/1#
        */
    }
    static class Solution{
        static int inSequence(int a, int b, int c){
            // code here
            if(c==0){
                if(a==b)
                    return 1;
                else
                    return 0;
            }
            else{
                if((b-a)/c<0)
                    return 0;
                else{
                    if((b-a)%c==0)
                        return 1;
                    else 
                    return 0;
                }
            }
        }
    }
}
