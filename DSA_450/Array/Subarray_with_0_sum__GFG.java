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
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Example 1:

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.
Example 2:

Input:
5
4 2 0 1 6

Output: 
Yes

Explanation: 
0 is one of the element 
in the array so there exist a 
subarray with sum 0.
Your Task:
You only need to complete the function subArrayExists() that takes array and n as parameters and returns true or false depending upon whether there is a subarray present with 0-sum or not. Printing will be taken care by the drivers code.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 104
-105 <= a[i] <= 105

 

Company Tags
*/
import java.util.*;
public class Subarray_with_0_sum__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
        */
    }
    static class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> set=new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(set.contains(sum) || sum==0 || arr[i]==0 )
                return true;
            set.add(sum);
        }
        return false;
    }
}
}
