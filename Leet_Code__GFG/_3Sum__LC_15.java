/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
Accepted
1,360,212
Submissions
4,724,557
*/
import searching_and_sorting__GFG__LC.*;
import java.util.*;
public class _3Sum__LC_15 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/3sum/
        */
    }
     List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                twoSum(i+1,nums.length-1,nums,0-nums[i]);
            }   
        }
        return res;
    }
    void twoSum(int i,int j,int[] nums,int target){
        int a=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target)
                j--;
            else if(nums[i]+nums[j]<target)
                i++;
            else{
                List<Integer> l=new ArrayList();
                l.add(a);l.add(nums[i]);l.add(nums[j]);
                res.add(l);
                //dublicate of b
                while(i<j && nums[j]==nums[j-1])j--;
                //duplicate of a
                while(i<j && nums[i]==nums[i+1])i++;
                i++;
                j--;
            }
        }
    } 
}
