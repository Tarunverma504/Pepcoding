/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Searching_and_Sorting;

/**
 *
 * @author Mind_Coder
 */
/*
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the k’th position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
Example 2:
Input:
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
Output:
256
Explanation:
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function kthElement() which takes the arrays arr1[], arr2[], its size N and M respectively and an integer K as inputs and returns the element at the Kth position.


Expected Time Complexity: O(Log(N) + Log(M))
Expected Auxiliary Space: O(Log (N))


Constraints:
1 <= N, M <= 106
1 <= arr1i, arr2i <= 106
1 <= K <= N+M
*/
import java.util.*;
public class Kth_element_of_two_sorted_Arrays__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1#
        */
    }
    class Solution {
        public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
            int i=0,j=0;
            while(i<n && j<m){
                if(arr1[i]<arr2[j]){
                    k--;
                    if(k==0)
                        return arr1[i];
                    i++;
                }
                else{
                    k--;
                    if(k==0)
                        return arr2[j];
                    j++;
                }
            }

            while(i<n){
                k--;
                if(k==0)
                    return arr1[i];
                i++;
            }
            while(j<m){
                k--;
                if(k==0)
                    return arr2[j];
                j++;
            }
            return -1;
        }
    }
}
