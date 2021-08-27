/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Array;

/**
 *
 * @author Mind_Coder
 */
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 


*/
import Leet_Code__GFG.*;
import java.util.*;
public class Trapping_Rain_Water__LC__42 {
    public static void main(String []arg){
        /*
        https://leetcode.com/problems/trapping-rain-water/
        */
    }
    class Solution {
        public int trap(int[] height) {
            int n=height.length;
            if(n<2){
                return 0;
            }

            int left[]=new int[n];
            int right[]=new int[n];
            left[0]=height[0];
            right[n-1]=height[n-1];
            for(int i=1;i<n;i++){
                left[i]=Math.max(left[i-1],height[i]);
            }
            for(int i=height.length-2;i>=0;i--){
                right[i]=Math.max(right[i+1],height[i]);
            }
            int traping=0;
            for(int i=0;i<n;i++){
                traping+=Math.min(left[i],right[i])-height[i];
            }
            return traping;

        }
    }
    
}
