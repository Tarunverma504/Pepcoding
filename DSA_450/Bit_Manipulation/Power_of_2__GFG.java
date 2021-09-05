/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Bit_Manipulation;

/**
 *
 * @author Mind_Coder
 */
/*
Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.
 

Example 1:

Input: N = 1
Output: true
Explanation:
1 is equal to 2 raised to 0 (20 = 1).
Example 2:

Input: N = 98
Output: false
Explanation: 
98 cannot be obtained by any power of 2.

Your Task: Your task is to complete the function isPowerofTwo() which takes n as a parameter and returns true or false by checking is given number can be represented as a power of two or not.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
0 ≤ N ≤ 1018
*/
import java.util.*;
public class Power_of_2__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1
        */
    }
    static class Solution{
    // Function to check if given number n is a power of two.
        public static boolean isPowerofTwo(long n){

            // Your code here
            if(n==0)
                return false;
            long val=n&(n-1);
            if(val==0)
                return true;
            else 
                return false;
        }

    }
}
