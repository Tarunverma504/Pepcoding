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
    You are given N number of books. Every ith book has Ai number of pages. 
You have to allocate contiguous books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is the minimum of those in all the other permutations and print this minimum value.

Each book will be allocated to exactly one student. Each student has to be allocated at least one book.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).

 

Example 1:

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:113
Explanation:Allocation can be done in 
following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90} Maximum Pages =113.
Therefore, the minimum of these cases is 113,
which is selected as the output.

Example 2:

Input:
N = 3
A[] = {15,17,20}
M = 2
Output:32
Explanation: Allocation is done as
{15,17} and {20}
Your Task:
You don't need to read input or print anything. Your task is to complete the function findPages() which takes 2 Integers N, and m and an array A[] of length N as input and returns the expected answer.


Expected Time Complexity: O(NlogN)
Expected Auxilliary Space: O(1)
*/
public class Allocate_minimum_number_of_pages_GFG {
    public static void  main(String[] arg){
        /*
            https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
        */
    }
    static class Solution 
    {
        //Function to find minimum number of pages.
        public static int findPages(int[]arr,int N,int M)
        {
            if(arr.length<M)
                return -1;
            //Your code here
            int l=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                l=Math.max(l, arr[i]);
                sum += arr[i];
            }
            int r= sum;
            int ans=-1;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(isValid(arr, mid, M)){
                    ans=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return ans;
        }

        public static boolean isValid(int[] arr, int x, int target){
            int count=1;
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum += arr[i];
                if( sum > x ){
                    count++;
                    sum = arr[i];
                }
            }
            return count<=target;
        }
    }
}
