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
Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

 

Example 1:

Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Example 2:

Input: nums = [4,2,3,4]
Output: 4
 

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 1000
*/
import searching_and_sorting__GFG__LC.*;
import java.util.*;
public class Valid_Triangle_Number {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/valid-triangle-number/
        */
    }
    class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            int l=0;
            int r=i-1;
            while(l < r){
                if(nums[l]+nums[r] > nums[i]){
                    count=count+(r-l);
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return count;
    }
}
}
