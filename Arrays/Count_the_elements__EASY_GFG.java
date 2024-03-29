/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mind_Coder
 */
/*

Given two arrays a and b. Given q queries each having a positive integer i denoting an index of the array a. For each query, your task is to find all the elements less than or equal to qi in the array b.

Example 1:

Input:
N=6
a[] = {1, 2, 3, 4, 7, 9}
b[] = {0, 1, 2, 1, 1, 4} 
Query 1 -> 5
Query 2 -> 4
Output : 6
         6
Explanation: For 1st query, the given index is 5,
             A[5] is 9 and in B all the elements 
             are smaller than 9.
             For 2nd query, the given index is 4, 
             A[4] is 7 and in B all the elements 
             are smaller than 7.   
Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array a , array b, array q as parameters and returns an array that contains the answer to the corresponding queries. 

 

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

 

Constraints:
1 ≤ n ≤ 107

*/
import java.util.*;
public class Count_the_elements__EASY_GFG {
    public static void main(String[] arg){
        /*
            https://practice.geeksforgeeks.org/problems/count-the-elements1529/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=0&page=1&sortBy=newest&query=category[]ArraysproblemStatusunsolveddifficulty[]0page1sortBynewestcategory[]Arrays#
        */
    }
    
    public static int[] find(int a[],int b[],int q[])
    {
        int []arr=new int[q.length];
        Arrays.sort(b);
        for(int i=0;i<q.length;i++){
            int n=a[q[i]];
            int l=0,h=b.length-1;
            while(l<=h){
                 int m=(l+h)/2;
                if(b[m]<=n){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
            arr[i]=h+1;
        }
        return arr;
        
    }
}
