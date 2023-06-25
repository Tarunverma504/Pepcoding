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

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
*/
import java.util.*;
public class Reorganize_String_LC_767 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/top-k-frequent-elements/?envType=list&envId=e9sr11es
        */
    }
    class Solution {
        class Pair{
            int key;
            int freq;
            Pair(int key, int freq){
                this.key = key;
                this.freq = freq;
            } 
        }
        public int[] topKFrequent(int[] nums, int k) {
            int[] ans = new int[k];
            HashMap<Integer, Integer> hm = new HashMap<>();
            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
                    public int compare(Pair p1, Pair p2){
                        return p2.freq-p1.freq;
                    }
                });
            for(int i=0; i<nums.length; i++){
                hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            }

            for(Map.Entry<Integer, Integer> map: hm.entrySet()){
                pq.add(new Pair(map.getKey(), map.getValue()));
            }

            for(int i=0;i<k;i++){
                ans[i] = pq.remove().key;
            }
            return ans;

        }
    }
}
