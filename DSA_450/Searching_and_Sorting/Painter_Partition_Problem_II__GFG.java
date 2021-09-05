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
Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board. 

The problem is to find the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered {2,3,4} or only board {1} or nothing but not boards {2,4,5}.


Example 1:

Input:
n = 5
k = 3
arr[] = {5,10,30,20,15}
Output: 35
Explanation: The most optimal way will be:
Painter 1 allocation : {5,10}
Painter 2 allocation : {30}
Painter 3 allocation : {20,15}
Job will be done when all painters finish
i.e. at time = max(5+10, 30, 20+15) = 35
Example 2:

Input:
n = 4
k = 2
arr[] = {10,20,30,40}
Output: 60
Explanation: The most optimal way to paint:
Painter 1 allocation : {10,20,30}
Painter 2 allocation : {40}
Job will be complete at time = 60

Your task:
Your task is to complete the function minTime() which takes the integers n and k and the array arr[] as input and returns the minimum time required to paint all partitions.


Expected Time Complexity: O(n log m) , m = sum of all boards' length
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ n ≤ 105
1 ≤ k ≤ 105
1 ≤ arr[i] ≤ 105
*/
import java.util.*;
public class Painter_Partition_Problem_II__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/the-painters-partition-problem1535/1#
        */
    }
    static class Solution{
        static boolean isValid(int []arr,int n,int k,long mid){
             int painter=1;
             long sum=0;
             for(int i=0;i<n;i++){
                 sum=sum+arr[i];
                    if (sum > mid)
                    {
                            painter++;
                            if(painter>k)
                                return false;
                            sum = arr[i];
                    }

             }
             return true;
         }
        static long minTime(int[] arr,int n,int k){
            //code here
            long max=0,sum=0;
            for(int i=0;i<n;i++){
                max=Math.max(max,arr[i]);
                sum+=arr[i];
            }
            long ans=-1;
            long l=max;
            long r=sum;
            while(l<=r){
                long mid=(l+r)/2;
                if(isValid(arr,n,k,mid)){
                    ans=mid;
                    r=mid-1;
                }
                else
                    l=mid+1;
            }
            return ans;
        }
    }

}
