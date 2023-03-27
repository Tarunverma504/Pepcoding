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
    Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

Example 1:

Input:
m = 6, n = 6
arr1[] = {1,2,3,4,7,9}
arr2[] = {0,1,2,1,1,4}
Output: 4 5 5 6 6 6
Explanation: Number of elements less than
or equal to 1, 2, 3, 4, 7, and 9 in the
second array are respectively 4,5,5,6,6,6
Example 2:

Input:
m = 5, n = 7
arr1[] = {4,8,7,5,1}
arr2[] = {4,48,3,0,1,1,5}
Output: 5 6 6 6 3
Explanation: Number of elements less than
or equal to 4, 8, 7, 5, and 1 in the
second array are respectively 5,6,6,6,3
Your Task :
Complete the function countEleLessThanOrEqual() that takes two array arr1[], arr2[],  m, and n as input and returns an array containing the required results(the count of elements less than or equal to it in arr2 for each element in arr1 where ith output represents the count for ith element in arr1.)

Expected Time Complexity: O((m + n) * log n).
Expected Auxiliary Space: O(m).

Constraints:
1<=m,n<=10^5
0<=arr1[i],arr2[j]<=10^5
*/
import java.util.*;
public class Counting_elements_in_two_arrays_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1
        */
    }
    static class Solution
    {
        public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
        {
           // add your code here
           Arrays.sort(arr2);
           ArrayList<Integer> al = new ArrayList<Integer>();
           for(int i=0; i<arr1.length; i++){
               al.add(binarySearch(arr1[i], arr2));
           }
           return al;
        }

        public static int binarySearch(int val, int arr[]){
            int l = 0;
            int r = arr.length-1;
            while(l<=r){
                int mid = (l+r)/2;
                if(arr[mid]<=val)
                    l=mid+1;
                else
                    r=mid-1;
            }
            return l;
        }
    }
}
