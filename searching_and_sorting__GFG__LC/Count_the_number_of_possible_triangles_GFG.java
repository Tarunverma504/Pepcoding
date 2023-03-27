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
    Given an unsorted array arr[] of n positive integers. Find the number of triangles that can be formed with three different array elements as lengths of three sides of triangles. 

Example 1:

Input: 
n = 3
arr[] = {3, 5, 4}
Output: 
1
Explanation: 
A triangle is possible 
with all the elements 5, 3 and 4.
Example 2:

Input: 
n = 5
arr[] = {6, 4, 9, 7, 8}
Output: 
10
Explanation: 
There are 10 triangles
possible  with the given elements like
(6,4,9), (6,7,8),...
 

Your Task: 
This is a function problem. You only need to complete the function findNumberOfTriangles() that takes arr[] and n as input parameters and returns the count of total possible triangles.

Expected Time Complexity: O(n2).
Expected Space Complexity: O(1).
*/
import java.util.*;

public class Count_the_number_of_possible_triangles_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1
        */
    }
    static class Solution
    {
        //Function to count the number of possible triangles.
        static int findNumberOfTriangles(int arr[], int n)
        {
            Arrays.sort(arr);
            // code here
            int count=0;
            for(int i=arr.length-1;i>=2;i--){
                int l=0;
                int r =  i-1;
                while(l<r){
                    if(arr[l]+arr[r]>arr[i]){
                        count +=(r-l);
                        r--;
                    }
                    else
                        l++;
                }
            }
            return count;
        }
    }
}
