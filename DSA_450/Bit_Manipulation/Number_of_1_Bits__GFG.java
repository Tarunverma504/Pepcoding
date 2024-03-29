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
Given a positive integer N, print count of set bits in it. 

Example 1:

Input:
N = 6
Output:
2
Explanation:
Binary representation is '110' 
So the count of the set bit is 2.
Example 2:

Input:
8
Output:
1
Explanation:
Binary representation is '1000' 
So the count of the set bit is 1.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function setBits() which takes an Integer N and returns the count of number of set bits.

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 109
*/
public class Number_of_1_Bits__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/set-bits0143/1
        */
    }
    static class Solution {
        static int setBits(int N) {
            // code here
            int count=0;
            while(N>0){
                if((N & 1)>0)
                    count++;
                N=N>>1;
            }
            return count;
        }
    }
}
