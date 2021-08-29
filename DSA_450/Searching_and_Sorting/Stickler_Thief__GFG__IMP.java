/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Searching_and_Sorting;

/**
 *
 * @author Mind_Coder
 */

/*
Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.

Example 1:

Input:
n = 6
a[] = {5,5,10,100,10,5}
Output: 110
Explanation: 5+100+5=110
Example 2:

Input:
n = 3
a[] = {1,2,3}
Output: 4
Explanation: 1+3=4
Your Task:
Complete the function FindMaxSum() which takes an array arr[] and n as input which returns the maximum money he can get following the rules

Expected Time Complexity: O(N).
Expected Space Complexity: O(N).

Constraints:
1 ≤ n ≤ 104
1 ≤ a[i] ≤ 104
*/

/*
Algorithm: 
Loop for all elements in arr[] and maintain two sums incl and excl where incl = Max sum including the previous element and excl = Max sum excluding the previous element.
Max sum excluding the current element will be max(incl, excl) and max sum including the current element will be excl + current element (Note that only excl is considered because elements cannot be adjacent).
At the end of the loop return max of incl and excl.
*/
import java.util.*;
public class Stickler_Thief__GFG__IMP {
    
   static class Solution
    {
        //Function to find the maximum money the thief can get.
        public int FindMaxSum(int arr[], int n)
        {
            // Your code here
            int inc=arr[0];
            int excl=0;
            int excl_new=0;
            for(int i=1;i<n;i++){
                // current max excluding i
                excl_new=Math.max(excl,inc);

                //currient max including i
                inc=excl+arr[i];
                excl=excl_new;
                //System.out.println(prev+" "+inc+" "+excl);
            }
            return Math.max(excl,inc);
        }
    }
}
