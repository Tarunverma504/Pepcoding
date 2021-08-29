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
You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.


Example 1:

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are 
[0], [0], [0], [0], [0,0], and [0,0].

Example 2:

Input:
n = 10
arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]

Your Task:
You don't need to read input or print anything. Complete the function findSubarray() that takes the array arr and its size n as input parameters and returns the total number of sub-arrays with 0 sum. 
 

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)
 

Constraints:    
1<= n <= 107
-1010 <= arri <= 1010
*/
import java.util.*;
public class Zero_Sum_Subarrays__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1#
        */
    }
    static class Solution{
    //Function to count subarrays with sum equal to 0.
        public static long findSubarray(long[] arr ,int n) 
        {
            //Your code here
            HashMap<Long,Integer> h=new HashMap<Long,Integer>();
            h.put((long)0,1);
            long sum=0;
            long count=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(h.containsKey(sum)){
                    count+=h.get(sum);
                    h.put(sum,h.get(sum)+1);
                }
                else
                    h.put(sum,1);
            }
            return count;
        }
    }
    
}
