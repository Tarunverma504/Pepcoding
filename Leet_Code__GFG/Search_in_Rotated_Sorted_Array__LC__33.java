package Leet_Code__GFG;

import DSA_450.Searching_and_Sorting.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
public class Search_in_Rotated_Sorted_Array__LC__33 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/search-in-rotated-sorted-array/
        */
    }
    class Solution {
        public int search(int[] nums, int target) {
            int l=0;
            int h=nums.length-1;

            while(l<=h){
                //int mid=(l+h)/2;
                int mid=l+(h-l)/2;

                if(nums[mid]==target)
                    return mid;
                else if(nums[l]<=nums[mid]){    //check if part from low to mid is sorted or not
                    if(nums[l]<=target && nums[mid]>target){
                        h=mid-1;
                    }
                    else
                        l=mid+1;
                }
                else if(nums[mid]<=nums[h]){  //check if part from mid to high is sorted or not
                     if(nums[mid]<target && nums[h]>=target){
                         l=mid+1;
                     }
                    else
                        h=mid-1;
                }
            }
            return -1;
        }
    }
}
