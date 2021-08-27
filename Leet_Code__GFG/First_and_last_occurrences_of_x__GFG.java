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
Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last
             occurrence of 5 is at index 5. 
 

Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6 

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.
Note: If the number x is not found in the array just return both index as -1.

 

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

 

Constraints:
1 ≤ N ≤ 107

 
*/

import java.util.*;
public class First_and_last_occurrences_of_x__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
        */
    }
    static class GFG
    {
        public static ArrayList<Long> find(long arr[], int n, int x)
        {
            // code here
            ArrayList<Long> a=new ArrayList<Long>();
            int l=0;
            int r=arr.length-1;
            boolean flag1=false;
            boolean flag2=false;
            long start=-1,end=-1;
            while(l<=r){
                if(flag1==true && flag2==true){
                    a.add(start);
                    a.add(end);
                    return a;
                }
                if(arr[l]==(long)x){
                    start=l;
                    flag1=true;
                }
                if(arr[r]==(long)x){
                    end=r;
                    flag2=true;
                }

                if(flag1==false)
                    l++;
                if(flag2==false)
                    r--;
            }

            a.add(start);
            a.add(end);
            return a;
        }
    }
}
