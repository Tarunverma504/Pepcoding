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
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:

Input:
N = 4, X = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getPairsCount() which takes arr[], n and k as input parameters and returns the number of pairs that have sum K.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 105
1 <= K <= 108
1 <= Arr[i] <= 106
*/
import java.util.*;
public class Count_pairs_with_given_sum__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
        */
    }
    static class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            int diff=k-arr[i];
            if(h.get(diff)!=null)
                count+=h.get(diff);
            int freq=h.get(arr[i])==null?1:h.get(arr[i])+1;
            h.put(arr[i],freq);
        }
        return count;
    }
}
}
