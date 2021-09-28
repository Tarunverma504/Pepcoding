/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
import java.util.*; 
public class Kth_Largest_Element_in_an_Array__LC__215 {
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
