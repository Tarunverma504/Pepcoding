package DSA_450.Heap;

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
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

You must solve it in O(n) time complexity.

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
*/
import java.util.*;
public class Kth_Largest_Element_in_an_Array_LC_215 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/kth-largest-element-in-an-array/description/
        */
    }
    class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        if(nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; ++i){
             pq.add(nums[i]);
             if(pq.size() > k){
                 pq.poll();
             }
        }
        return pq.poll();
    }
}
}
