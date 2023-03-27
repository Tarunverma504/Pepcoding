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
    Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 
Example 1:

Input: 
N = 4 
arr[] = {1, 5, 3, 2}
Output: 2 
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5

Example 2:

Input: 
N = 3
arr[] = {2, 3, 4}
Output: 0
Explanation: No such triplet exits
Your Task:  
You don't need to read input or print anything. Your task is to complete the function countTriplet() which takes the array arr[] and N as inputs and returns the triplet count

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)
*/
import java.util.*;
public class Count_the_triplets_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1
        */
    }
    static class Solution {
        int countTriplet(int arr[], int n) {
            // code here\
            int count=0;
            Arrays.sort(arr);
            for(int i=arr.length-1;i>=2;i--){
                int l=0;
                int r=i-1;
                while(l<r){
                    if(arr[l]+arr[r]==arr[i]){
                        count++;
                        r--;
                    }
                    else if(arr[l]+arr[r]<arr[i]){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
            return count;
        }
    }
}
