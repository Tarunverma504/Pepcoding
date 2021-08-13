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
Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from that element. Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
Note: Return -1 if you can't reach the end of the array.


Example 1:

Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
Explanation: 
First jump from 1st element to 2nd 
element with value 3. Now, from here 
we jump to 5th element with value 9, 
and from here we will jump to last. 
Example 2:

Input :
N = 6
arr = {1, 4, 3, 2, 6, 7}
Output: 2 
Explanation: 
First we jump from the 1st to 2nd element 
and then jump to the last element.

Your task:
You don't need to read input or print anything. Your task is to complete function minJumps() which takes the array arr and it's size N as input parameters and returns the minimum number of jumps. If not possible returns -1.


Expected Time Complexity: O(N)
Expected Space Complexity: O(1)


Constraints:
1 ≤ N ≤ 107
0 ≤ arri ≤ 107
*/
import java.util.*;
public class Minimum_number_of_jumps__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
        */
    }
    static class Solution{
        static int minJumps(int[] arr){
            // your code here
            int n=arr.length;
            int maxr=arr[0];  //maxrange
            int step=arr[0]; //steps
            int jump=1;
            if(n==1)
               return 0;
            else if(arr[0]==0)
                return -1;
            else{
                for(int i=1;i<n;i++){
                    if(i==n-1)
                        return jump;
                    maxr=Math.max(maxr,i+arr[i]);
                    step--;
                    if(step==0){
                        jump++;
                        if(i>=maxr)
                            return -1;

                        step=maxr-i;
                    }
                }
                return -1;
            }
        }
    }
}
