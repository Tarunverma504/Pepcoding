/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

import searching_and_sorting__GFG__LC.*;

/**
 *
 * @author Mind_Coder
 */

/*

Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {1,2,3,4,5,6,7,8,10}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106

*/
public class Missing_number_in_array__EASY__GFG {
    public static void main(String[] arg){
        /*
            Hint:- sum of n elements = n*(n+1)/2;
        Question :- "https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#"
        */
    }
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<array.length;i++){
            sum2+=array[i];
        }
        return sum-sum2;
    }
}
