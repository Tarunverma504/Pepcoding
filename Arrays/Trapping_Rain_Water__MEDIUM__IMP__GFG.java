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

Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 

Example 2:

Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.
Example 3:

Input:
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.

Your Task:
You don'y need to read input or print anything. The task is to complete the function trappingWater() which takes arr and N as input parameters and returns the total amount of water that can be trapped.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
3 <= N <= 107
0 <= Ai <= 108

*/
import java.util.*;
public class Trapping_Rain_Water__MEDIUM__IMP__GFG {
    public static void main(String []arg){
        /*
        Question:--  "https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1/?category[]=Arrays&category[]=Arrays&difficulty[]=1&page=1&query=category[]Arraysdifficulty[]1page1category[]Arrays#"
        */
        /*
        Hint:
            1. find the left side highest bar for each bar 
            2. find the right side highest bar for each bar
            3 now traverse the hole array and apply the formula
                        trapped=trapped+(Math.min(left[i]-right[i])-arr[i]);
        */
    }
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        if(n<=2){
            return 0;
        }
        else{
            int li[]=new int[n];
            int ri[]=new int[n];
            li[0]=arr[0];
            for(int i=1;i<n;i++){
                li[i]=Math.max(li[i-1],arr[i]);
                //System.out.println(li[i]);
            }
            ri[n-1]=arr[n-1];
            for(int i=n-2;i>=0;i--){
                ri[i]=Math.max(ri[i+1],arr[i]);
            }
            int trapped=0;
            for(int i=0;i<n;i++){
                trapped+=Math.min(li[i],ri[i])-arr[i];
            }
            return trapped;
        }
        
        
    } 
}
