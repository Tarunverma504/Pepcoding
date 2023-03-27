package searching_and_sorting__GFG__LC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
    Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9. 
*/
public class Split_Array_Largest_Sum_LC_410 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/split-array-largest-sum/description/
        */
    }
    static class Solution {
        public int splitArray(int[] nums, int k) {
            if(nums.length<k)
                return -1;
            int l = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                l = Math.max(l, nums[i]);
                sum += nums[i];
            }
            int r = sum;
            int ans = -1;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(isValid(nums, mid, k)){
                    ans = mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return ans;
        }

        public static boolean isValid(int[] arr, int x, int k){
            int sum=0;
            int count=1;
            for(int i=0; i<arr.length; i++){
                sum += arr[i];
                if(sum>x){
                    count++;
                    sum=arr[i];
                }

            }
            return count<=k;
        }
    } 
}
