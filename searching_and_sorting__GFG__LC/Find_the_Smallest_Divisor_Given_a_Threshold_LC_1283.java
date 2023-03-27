package searching_and_sorting__GFG__LC;

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
    Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.

 

Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
 

Constraints:

1 <= nums.length <= 5 * 104
1 <= nums[i] <= 106
nums.length <= threshold <= 106
*/
public class Find_the_Smallest_Divisor_Given_a_Threshold_LC_1283 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
        */
    }
    static class Solution {
        public int smallestDivisor(int[] nums, int th) {
            int max = nums[0];
            for(int i=0;i<nums.length;i++){
                max = Math.max(max, nums[i]);
            }

            if(th==nums.length)
                return max;
            else{
                int l=1;
                int r= max;
                int ans=0;
                while(l<=r){
                    int mid = l + (r-l)/2;
                    if(isPossible(nums, mid, th)){
                        ans = mid;
                        r=mid-1;
                    }
                    else
                        l=mid+1;
                }
                return ans;
            }
        }

        public static boolean isPossible(int[] nums, int mid, int th){
            int time=0;
            for(int i=0;i<nums.length; i++)
            {
                time += nums[i]/mid;
                if(nums[i]%mid>0)
                    time+=1;
            }

            if(time<0)
                return false;
            return time<=th;
        }
    }
}
