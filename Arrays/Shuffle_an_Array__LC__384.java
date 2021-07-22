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
Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

Implement the Solution class:

Solution(int[] nums) Initializes the object with the integer array nums.
int[] reset() Resets the array to its original configuration and returns it.
int[] shuffle() Returns a random shuffling of the array.
 

Example 1:

Input
["Solution", "shuffle", "reset", "shuffle"]
[[[1, 2, 3]], [], [], []]
Output
[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]

Explanation
Solution solution = new Solution([1, 2, 3]);
solution.shuffle();    // Shuffle the array [1,2,3] and return its result.
                       // Any permutation of [1,2,3] must be equally likely to be returned.
                       // Example: return [3, 1, 2]
solution.reset();      // Resets the array back to its original configuration [1,2,3]. Return [1, 2, 3]
solution.shuffle();    // Returns the random shuffling of array [1,2,3]. Example: return [1, 3, 2]

 

Constraints:

1 <= nums.length <= 200
-106 <= nums[i] <= 106
All the elements of nums are unique.
At most 5 * 104 calls in total will be made to reset and shuffle.
*/
import java.util.*;
public class Shuffle_an_Array__LC__384 {
    
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/shuffle-an-array/
        */
    }
    class Solution {
        private int nums[];
        private Random random;

        public Solution(int[] nums) {
            this.nums=nums;
            this.random =new Random();
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;

        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int arr[]=new int [nums.length];
            for(int i=0;i<nums.length;i++)
                arr[i]=nums[i];
            for(int i=nums.length-1;i>=0;i--){
                int j=random.nextInt(i+1);
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            return arr;

        }
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
}
