/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

import searching_and_sorting__GFG__LC.*;

/**
 *
 * @author Mind_Coder
 */

/*
Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

It is guaranteed that there will be an answer.

 

Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
Example 3:

Input: nums = [21212,10101,12121], threshold = 1000000
Output: 1
Example 4:

Input: nums = [2,3,5,7,11], threshold = 11
Output: 3
 

Constraints:

1 <= nums.length <= 5 * 104
1 <= nums[i] <= 106
nums.length <= threshold <= 106

*/
public class Find_the_Smallest_Divisor_Given_a_Threshold__LC__1283 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
        */
    }
    class Solution {
        public int smallestDivisor(int[] nums, int threshold) {
            int max=nums[0];
            for(int i=1;i<nums.length;i++)
                max=(int) Math.max(max,nums[i]);
            if(threshold==nums.length)
                return max;
            int l=1,r=max,ans=0;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(divisor(nums,mid,threshold)){
                    ans=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return ans;
        }
        public boolean divisor(int []nums,int mid,int threshold){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(int) Math.ceil(nums[i]*1.0/mid);
            }
            return sum<=threshold;

        }
    }
}
