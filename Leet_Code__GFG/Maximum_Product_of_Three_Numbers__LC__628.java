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
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 

Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
*/
import searching_and_sorting__GFG__LC.*;
import java.util.*;
public class Maximum_Product_of_Three_Numbers__LC__628 {
    public static void mian(String[] arg){
       /*
        https://leetcode.com/problems/maximum-product-of-three-numbers/
        */ 
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int sum1=nums[i]*nums[i-1]*nums[i-2];
        int sum2=nums[i]*nums[0]*nums[1];
        return Math.max(sum1,sum2);
    }
}
