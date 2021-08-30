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
Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.


Example 1:

Input:
nums = {2, 8, 5, 4}
Output:
1
Explaination:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explaination:
swap 10 with 3 and swap 19 with 5.

Your Task:
You do not need to read input or print anything. Your task is to complete the function minSwaps() which takes the nums as input parameter and returns an integer denoting the minimum number of swaps required to sort the array. If the array is already sorted, return 0. 


Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(n)


*/

import java.util.*;
public class Minimum_Swaps_to_Sort__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/minimum-swaps/1#
        */
    }
    static class Solution
    {
        //Function to find the minimum number of swaps required to sort the array.
        public int minSwaps(int nums[])
        {
            // Code here
            HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();

            int arr[]=new int[nums.length];

            for(int i=0;i<nums.length;i++)
                arr[i]=nums[i];

            Arrays.sort(arr);

            for(int i=0;i<nums.length;i++){
                h.put(nums[i],i);
            }
            int ans=0;
            for(int i=0;i<nums.length;i++){
                if(arr[i]!=nums[i]){
                    ans++;
                    int init=nums[i];
                    swap(nums, i, h.get(arr[i]));
                    h.put(init,h.get(arr[i]));
                    h.put(arr[i],i);
                }
            }
            return ans;
        }
        public void swap(int[] nums, int i, int j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
