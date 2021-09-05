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
You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

Example 1:

Input: N = 4
Output: 5
Explanation:
For numbers from 1 to 4.
For 1: 0 0 1 = 1 set bits
For 2: 0 1 0 = 1 set bits
For 3: 0 1 1 = 2 set bits
For 4: 1 0 0 = 1 set bits
Therefore, the total set bits is 5.
Example 2:

Input: N = 17
Output: 35
Explanation: From numbers 1 to 17(both inclusive), 
the total number of set bits is 35.

Your Task: The task is to complete the function countSetBits() that takes n as a parameter and returns the count of all bits.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 108
*/
import java.util.*;
public class Count_total_set_bits__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1#
        */
    }
    static class Solution{
        //Function to return sum of count of set bits in the integers from 1 to n.
        public static int countSetBits(int n){

            // Your code here
            return solution(n);

        }
        // (2^(x-1)*x) + (n - 2^x+1) + solve(n-2^x);
        public static int solution(int n){
            if(n==0)
                return 0;
            int x=largestpowerof2inrange(n);
            int btill2x=x*(1<<(x-1));   // 2^(x-1)*x give sthe total number of set bit till 2^x (greatest power of 2 smaller or equl to n)
            int msb2xton= n-(1<<x)+1;   // total extra msb bit of n-2^x
            int rest=n-(1<<(x));        
            int ans=btill2x+msb2xton+solution(rest);   //recursive funtion for n-2^x bits
            return ans;
        }
        public static int largestpowerof2inrange(int n){
            int x=0;
            while((1<<x)<=n){
                x++;
            }
            return x-1;
        }
    }
}
