/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code;

/**
 *
 * @author Mind_Coder
 */
/*
Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.


Example 1:

Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
Explanation: Since you can't use any 
extra space, modify the given arrays
to form 
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}

Example 2:

Input:
N = 2, M = 3
arr1[] = {10, 12}
arr2[] = {5, 18, 20}
Output: 5 10 12 18 20
Explanation: Since you can't use any
extra space, modify the given arrays
to form 
arr1[] = {5, 10}
arr2[] = {12, 18, 20}
 

Your Task:
You don't need to read input or print anything. Complete the function merge() which takes the two arrays arr1[], arr2[] and their sizes n and m, as input parameters. The function does not return anything. Use the given arrays to sort and merge arr1[] and arr2[] in-place. 
Note: The generated output will print all the elements of arr1[] followed by all the elements of arr2[].


Expected Time Complexity: O((n+m)*log(n+m))
Expected Auxiliary Space: O(1)


Constraints:
1 <= N, M <= 5*104
0 <= arr1i, arr2i <= 106
*/
import java.util.*;
public class Merge_Without_Extra_Space__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1#
        */
    }
    class Solution {
        public void merge(int arr1[], int arr2[], int n, int m) {
            // code here
            int gap=(int)Math.ceil((n+m)/2);
            int j,i;
            while(gap>=1){
                for(i=0;i+gap<n;i++){
                    if(arr1[i]>arr1[i+gap]){
                        int temp=arr1[i];
                        arr1[i]=arr1[i+gap];
                        arr1[i+gap]=temp;
                    }
                }
                for (j = gap > n ? gap - n : 0;i < n && j < m;i++, j++)
                {
                    if(arr1[i]>arr2[j]){
                        int temp=arr1[i];
                        arr1[i]=arr2[j];
                        arr2[j]=temp;
                    }
                }
                if(j<m){
                    for(j=0;j+gap<m;j++){
                        if(arr2[j]>arr2[j+gap]){
                            int temp=arr2[j];
                            arr2[j]=arr2[j+gap];
                            arr2[j+gap]=temp;
                        }
                    }
                }
                gap=gap<=1?0:(gap / 2) + (gap % 2);
            }
        }
    }
}
