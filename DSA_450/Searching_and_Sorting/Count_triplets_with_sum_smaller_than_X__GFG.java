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
Given an array arr[] of distinct integers of size N and a sum value X, the task is to find count of triplets with the sum smaller than the given sum value X.


Example 1:

Input: N = 4, X = 2
arr[] = {-2, 0, 1, 3}
Output:  2
Explanation: Below are triplets with 
sum less than 2 (-2, 0, 1) and (-2, 0, 3). 
Example 2:

Input: N = 5, X = 12
arr[] = {5, 1, 3, 4, 7}
Output: 4
Explanation: Below are triplets with 
sum less than 12 (1, 3, 4), (1, 3, 5), 
(1, 3, 7) and (1, 4, 5).

Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function countTriplets() that take array arr[], integer N  and integer X as parameters and returns the count of triplets.


Expected Time Complexity: O(N2).
Expected Auxiliary Space: O(1).


*/
import java.util.*;
public class Count_triplets_with_sum_smaller_than_X__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1#
        */
    }
    static class Solution
    {
        long countTriplets(long arr[], int n,int sum)
        {
            Arrays.sort(arr);
            long count=0;
            for(int i=0;i<n-2;i++){
                int l=i+1;

                int r=arr.length-1;
                while(l<r){
                    if(arr[i]+arr[l]+arr[r]<sum){
                        count+=(r-l);
                        l++;
                    }
                    else
                        r--;

                }
            }
            return count;
        }
    }
}
