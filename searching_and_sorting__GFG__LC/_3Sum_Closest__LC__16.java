/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching_and_sorting__GFG__LC;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

*/
import java.util.*;
public class _3Sum_Closest__LC__16 {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int min=Integer.MAX_VALUE;
            int ans=0;
            for(int i=0;i<nums.length;i++){
                int l=i+1;
                int r=nums.length-1;
                while(l<r){
                    int sum=nums[i]+nums[l]+nums[r];
                    int diff=Math.abs(target-sum)+1;
                    if(diff<min){
                        min=diff;
                        ans=sum;
                    }
                    if(sum==target) return sum;
                    else if(sum<target) l++;
                    else
                        r--;
                }
            }
            return ans;
        }
    }
    public static void main(String[] agr){
        //  "https://leetcode.com/problems/3sum-closest/"
    }
}
