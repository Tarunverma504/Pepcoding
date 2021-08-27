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
Given an array Arr that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is 6, -3, -10 which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is 2, 3, 4, 5 which gives product as 120.
Your Task:
You don't need to read input or print anything. Your task is to complete the function maxProduct() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
Note: Use 64-bit integer data type to avoid overflow.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 500
-102 ≤ Arri ≤ 102
*/
import java.util.*;
public class Maximum_Product_Subarray__GFG {
    public static void main(String arg[]){
        // https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1
    }
    class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long result=arr[0];
        long MAX=arr[0];
        long MIN=arr[0];
        for(int i=1;i<n;i++){
            long temp=MAX;
            MAX= Math.max (Math.max ( arr[i],arr[i]*MAX) , arr[i]*MIN);
            MIN= Math.min (Math.min ( arr[i],arr[i]*temp) , arr[i]*MIN);
            result=Math.max(result,MAX);
        }
        return result;
    }
}
}
