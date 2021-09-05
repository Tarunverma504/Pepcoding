/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Bit_Manipulation;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers.


Example 1:

Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.
Example 2:

Input:
N = 1
arr[] = {2, 1, 3, 2}
Output:
1 3
Explanation:
1 3 occur exactly once.

Your Task:
You do not need to read or print anything. Your task is to complete the function singleNumber() which takes the array as input parameter and returns a list of two numbers which occur exactly once in the array. The list must be in ascending order.


Expected Time Complexity: O(N)
Expected Space Complexity: O(1)


Constraints:
1 <= length of array <= 106 
1 <= Elements in array <= 5 * 106
*/
public class Non_Repeating_Numbers__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1#
        */
    }
    static class Solution
    {
        public int[] singleNumber(int[] nums)
        {
            // Code here
            int xxory=0;
            for(int i=0;i<nums.length;i++)
                xxory=xxory^nums[i];
            int rsbm=xxory & -xxory;
            int x=0;
            int y=0;
            for(int i=0;i<nums.length;i++){
                if((nums[i] & rsbm)==0  )
                    x=x^nums[i];
                else
                    y=y^nums[i];
            }
            int arr[]=new int[2];
            if(x<y){
                arr[0]=x;
                arr[1]=y;
            }
            else
            {
                arr[0]=y;
                arr[1]=x;
            }
            return arr;
        }
    }
}
