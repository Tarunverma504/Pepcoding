/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Matrix;

import Leet_Code__GFG.*;

/**
 *
 * @author Mind_Coder
 */

/*
Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).

Example 2:

Input: 
N = 2, M = 2
Arr[][] = {{0, 0}, {1, 1}}
Output: 1
Explanation: Row 1 contains 2 1's (0-based
indexing).

Your Task:  
You don't need to read input or print anything. Your task is to complete the function rowWithMax1s() which takes the array of booleans arr[][], n and m as input parameters and returns the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.
 

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)


*/
public class Row_with_max_1s__GFG {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1#
        */
    }
    class Solution {
        int rowWithMax1s(int arr[][], int n, int m) {
            // code here
            int max=0;
            int row=-1;
            for(int i=0;i<arr.length;i++){
                int count=binary(arr,i);
                    if(count>max){
                    max=count;
                    row=i;
                }
            }
            return row;
        }

        int binary(int arr[][],int r){
            int l=0;
            int h=arr[0].length-1;
            int first=arr[0].length;
            while(l<=h){
                int mid=(l+h)/2;
                if(arr[r][mid]==1){
                    first=mid;
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            int count=arr[0].length-first;
            return count;
        }
    }
}
