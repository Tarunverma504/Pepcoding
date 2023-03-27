/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching_and_sorting__GFG__LC;

/**
 *
 * @author Mind_Coder
 */
/*
    Win Prize worth ₹6000 with Ease. Register for the Easiest Coding Challenge!  

Given a N X N binary Square Matrix where each row and column of the matrix is sorted in ascending order. Find the total number of zeros present in the matrix.

Example 1:

Input:
N = 3
A = {{0, 0, 0},
     {0, 0, 1},
     {0, 1, 1}}
Output: 6
Explanation: 
The first, second and third row contains 3, 2 and 1
zeroes respectively.
Example 2:

Input:
N = 2
A = {{1, 1},
     {1, 1}}
Output: 0
Explanation:
There are no zeroes in any of the rows.
Your Task:
You don't need to read input or print anything. Your task is to complete the function countZeros() which takes a 2D matrix as input and returns the number occurring only once.

Expected Time Complexity: O(N ).
Expected Auxiliary Space: O(1).
*/
public class Count_zeros_in_a_sorted_matrix_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1
        */
    }
    static class GfG
    {
        /*you are required to complete this method*/
        int countZeros(int arr[][], int N)
        {
            // Your code here
            int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=arr[0].length-1; j>=0;j--){
                    if(arr[i][j]==0){
                        count +=j+1;
                        break;
                    }
                }
            }
            return count;
        }
    }
}
