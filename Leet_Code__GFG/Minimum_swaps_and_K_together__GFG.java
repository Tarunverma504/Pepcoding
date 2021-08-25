/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.

Example 1:

Input : arr[ ] = {2, 1, 5, 6, 3} and K = 3
Output : 1
Explanation:
To bring elements 2, 1, 3 together, swap element '5' with '3'
such that final array will be- arr[] = {2, 1, 3, 6, 5}

Example 2:

Input : arr[ ] = {2, 7, 9, 5, 8, 7, 4} and K = 6 
Output :  2 
 

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function minSwap() that takes an array (arr), sizeOfArray (n), an integer K, and return the minimum swaps required. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
import java.util.*;
public class Minimum_swaps_and_K_together__GFG {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1
        */
    }
    static class Complete{
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int good=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k)
                good++;
        }
        int bad=0;
        for(int i=0;i<good;i++)
        {
            if(arr[i]>k)
                bad++;
        }
        int i=0,j=good,ans=bad;
        while(j<n){
            if(arr[i]>k){
                bad--;
            }
            if(arr[j]>k)
                bad++;
            ans=Math.min(ans,bad);
            i++;j++;
        }
        return ans;
        
    }
    
    
}
}
