/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_and_Queue;

/**
 *
 * @author Mind_Coder
 */
/*
Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have the same width and the width is 1 unit, there will be N bars height of each bar will be given by the array arr.

Example 1:

Input:
N = 7
arr[] = {6,2,5,4,5,1,6}
Output: 12
Explanation: 


Example 2:

Input:
N = 8
arr[] = {7 2 8 9 1 3 6 5}
Output: 16
Explanation: Maximum size of the histogram 
will be 8  and there will be 2 consecutive 
histogram. And hence the area of the 
histogram will be 8x2 = 16.
Your Task:
The task is to complete the function getMaxArea() which takes the array arr[] and its size N as inputs and finds the largest rectangular area possible and returns the answer.

Expected Time Complxity : O(N)
Expected Auxilliary Space : O(N)

Constraints:
1 ≤ N ≤ 106
1 ≤ arr[i] ≤ 1012
*/
import DSA_450.Stack_and_Queue.*;
import java.util.*;
public class Maximum_Rectangular_Area_in_a_Histogram__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1#
        */
    }
    static class Solution
    {
        //Function to find largest rectangular area possible in a given histogram.
        public static long getMaxArea(long arr[], long n) 
        {
            // your code here
            Stack<Integer> s1 = new Stack<Integer>();
            long left[]=new long[arr.length]; // stores next smaller element on the left side of element if any else -1
            left[0]=-1;
            s1.push(0);
            for(int i=1;i<arr.length;i++){
                while(!s1.isEmpty() && arr[i]<=arr[s1.peek()]){
                    s1.pop();
                }
                if(s1.isEmpty())
                    left[i]=-1;
                else
                    left[i]=s1.peek();
                s1.push(i);
            }

            Stack<Integer> s2=new Stack<Integer>();
            long right[]=new long[arr.length]; //stores next smaller element on rigth side of element if any else arr.length
            right[arr.length-1]=arr.length;
            s2.push(arr.length-1);
            for(int i=arr.length-2;i>=0;i--){
                while(!s2.isEmpty() && arr[i]<=arr[s2.peek()]){
                    s2.pop();
                }
                if(s2.isEmpty())
                    right[i]=arr.length;
                else
                    right[i]=s2.peek();
                s2.push(i);
            }
            long ans=0;
            for(int i=0;i<arr.length;i++){
                long width=right[i]-left[i]-1;
                long area=width*arr[i];
                if(area>=ans)
                    ans=area;
            }
            return ans;
        }

    }
}
