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
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104
 

Follow up: This problem is similar to Search in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?
*/
public class Search_in_Rotated_Sorted_Array_II__Medium__LC__81 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
        */
    }
    public boolean search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target || nums[l]==target){
                return true;
            }
            else if(nums[l]<nums[mid]){
                //left side is sorted;
                if(nums[l]<=target && nums[mid]>=target){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if(nums[h]>nums[mid]){
                if(nums[h]>=target && nums[mid]<=target){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                    
                }
            }
            else{
                System.out.println(nums[l]);
                l++;
            }
        }
        return false;
    }
}
