/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mind_Coder
 */

/*
Given an array nums, partition it into two (contiguous) subarrays left and right so that:

Every element in left is less than or equal to every element in right.
left and right are non-empty.
left has the smallest possible size.
Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.

 

Example 1:

Input: nums = [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
Example 2:

Input: nums = [1,1,1,0,6,12]
Output: 4
Explanation: left = [1,1,1,0], right = [6,12]
 

Note:

2 <= nums.length <= 30000
0 <= nums[i] <= 106
It is guaranteed there is at least one way to partition nums as described.
 
*/

import java.util.*;
public class Partition_Array_into_Disjoint_Intervals__LC__915 {
    public static void main(String[] arg){
        /*
        "https://leetcode.com/problems/partition-array-into-disjoint-intervals/"
        */
    }
    class Solution {
        public int partitionDisjoint(int[] nums) {
            int lmax[]=new int[nums.length];
            int rmin[]=new int[nums.length];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i]);
                lmax[i]=max;
            }

            int min=Integer.MAX_VALUE;

            for(int i=nums.length-1;i>=0;i--){
                min=Math.min(min,nums[i]);
                rmin[i]=min;
            }

            for(int i=1;i<nums.length;i++){
                if(lmax[i-1]<=rmin[i])
                    return i;
            }
            return nums.length;
        }
    }
}
