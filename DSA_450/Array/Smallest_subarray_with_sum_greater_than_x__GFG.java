/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Array;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value.

Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of a[i] (from 1 to N).

Example 1:

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}

Example 2:
Input:
A[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Explanation:
Minimum length subarray is {10}
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function sb() which takes the array A[], its size N and an integer X as inputs and returns the required ouput.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N, x ≤ 105
1 ≤ A[] ≤ 104
*/
import java.util.*;
public class Smallest_subarray_with_sum_greater_than_x__GFG {
     public static void main(String[] arg){
        /*
         https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1
        */
    }
    static class Solution {

    public static int sb(int a[], int n, int x) {
        // Your code goes here 
        int i=0,j=0;
        int s=0;
        int ans=Integer.MAX_VALUE;
        while(i<=j && j<n){
            while(s<=x && j<n){
                s+=a[j++];
            }
            while(s>x && i<j){
                ans=Math.min(ans,j-i);
                s-=a[i++];
            }
        }
        return ans;
    }
}
}
