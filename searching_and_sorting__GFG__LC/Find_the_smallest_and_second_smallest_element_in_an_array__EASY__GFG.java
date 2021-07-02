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
Given an array of integers, your task is to find the smallest and second smallest element in the array. If smallest and second smallest do not exist, print -1.

Example 1:

Input :
5
2 4 3 5 6
Output :
2 3 
Explanation: 
2 and 3 are respectively the smallest 
and second smallest elements in the array.

Example 2:

Input :
6
1 2 1 3 6 7
Output :
1 2 
Explanation: 
1 and 2 are respectively the smallest 
and second smallest elements in the array.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function minAnd2ndMin() which takes the array A[] and its size N as inputs and returns a vector containing the smallest and second smallest element if possible, else return {-1,-1}.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1<=N<=105
1<=A[i]<=105

*/
import java.util.*;
public class Find_the_smallest_and_second_smallest_element_in_an_array__EASY__GFG {
    public static void main(String []arg){
        /*
        https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
        */
    }
    
    public long[] minAnd2ndMin(long a[], long n)  
    {
         int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        long b[]=new long[2];
        for(int i=0;i<a.length;i++){
            if(a[i]<first){
                second=first;
                first=(int)a[i];
            }else if(a[i]<second && a[i]!=first){
                second=(int)a[i];
            }
        }
        if(second==Integer.MAX_VALUE){
            b[0]=-1;
            b[1]=-1;
        }else{
            b[0]=first;
            b[1]=second;
        }
        return b;
    }
    
}
