/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */

/*
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 

Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.
Example 2:

Input:
N = 7
a[] = {1,9,3,10,4,20,2}
Output:
4
Explanation:
1, 2, 3, 4 is the longest
consecutive subsequence.

Your Task:
You don't need to read input or print anything. Your task is to complete the function findLongestConseqSubseq() which takes the array arr[] and the size of the array as inputs and returns the length of the longest subsequence of consecutive integers. 


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).


Constraints:
1 <= N <= 105
0 <= a[i] <= 105


*/
import java.util.*;
public class Longest_consecutive_subsequence__GFG__Medium {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1#
        */
    }
    static class Solution
    {   
        // arr[] : the input array
        // N : size of the array arr[]

        //Function to return length of longest subsequence of consecutive integers.
            static int findLongestConseqSubseq(int arr[], int N)
            {
               // add your code here
               HashMap<Integer,Boolean> h = new HashMap<Integer,Boolean>();
               for(int i=0;i<arr.length;i++){
                   h.put(arr[i],true);
               }
               for(int i=0;i<arr.length;i++){
                   if(h.containsKey(arr[i]-1)){
                       h.put(arr[i],false);
                   }
               }
               int ans=1;
               for(int i=0;i<arr.length;i++){
                   if(h.get(arr[i])==true){
                       int tl=1;
                       int tsp=arr[i];
                       while(h.containsKey(tsp+tl)){
                           tl++;
                       }
                       if(tl>ans)
                        ans=tl;
                   }
               }
               return ans;
            }
    }
}
