/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Array;

/**
 *
 * @author Mind_Coder
 */

/*
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.

A slight modification of the problem can be found here.


Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{6, 12, 9, 13, 17}. The difference between 
the largest and the smallest is 17-6 = 11. 

Your Task:
You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n and k as input parameters and returns an integer denoting the minimum difference.


Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)

Constraints
1 ≤ K ≤ 104
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 105
*/
import Leet_Code__GFG.*;
import java.util.*;
public class Minimize_the_Heights_2__GFG {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#
        */
    }
    class Solution {
        int getMinDiff(int[] arr, int n, int k) {
            // code here
            if(n==1)
            return 0;
            int max, min;

            Arrays.sort(arr);
            
            // arrays is sort 
            int diff=arr[n-1]-arr[0];
            /*
                sort the arrays if we add k at first index and substract k
                    at last index then diff of last and first gives minimize hight but there is also the possiblity 
                    that elemnet in between the middle also gives the minimum height
                    
                for that we created 2 variables max and min
                max:- for this we iterate and add K to every element to check whether we got any number on adding k greater
                       than arr[last]-k
                min:-  for this we iterate and subtract K to every element to check whether we got any number on subtracting k smaller
                       than arr[first]+k
            */
            for(int i=1;i<n;i++){
                max = Math.max(arr[i-1]+k, arr[n-1]-k);
                min = Math.min(arr[0]+k, arr[i]-k);
                if(min<0)
                    continue;
                diff = Math.min(max-min, diff);
            }
            return diff;
        }
    }
}
