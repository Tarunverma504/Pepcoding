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
Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A.

Example 1:

Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
Output:
5
Explanation: 10 is found at index 5.
Example 2:

Input:
N = 4
A[] = {3, 5, 1, 2}
key = 6
Output:
-1
Explanation: There is no element that has value 6.
Your Task:
Complete the function search() which takes an array arr[] and start, end index of the array and the K as input parameters, and returns the answer.

Can you solve it in expected time complexity?

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).
*/
public class Search_in_a_Rotated_Array__EASY__GFGF {
    public static void main(String []arg){
        /*
            https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1#
        */
    }
    int search(int A[], int l, int h, int key)
    {
        // Complete this function
       while(l<=h){
           int m=(l+h)/2;
           if(A[m] == key){
               return m;
           }
           else if(A[l]<=A[m]){
               // lo to mid is sorted
               if(A[l]<=key && A[m]>key){
                   h=m-1;
               }else{
                   l=m+1;
               }
           }
           else if(A[h]>=A[m]){
               //hi is sorted
               if(A[m]<key && A[h]>=key){
                   l=m+1;
               }
               else{
                   h=m-1;
               }
           }
       }
        return -1;
    }
    
}
