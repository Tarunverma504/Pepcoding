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
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 

Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106
*/
import java.util.*;
public class Majority_Element__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1#
        */
    }
    static class Solution
    {
        static int majorityElement(int a[], int size)
        {
            // your code here
            HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
            for(int i=0;i<a.length;i++){
                int freq=h.get(a[i])==null?1:h.get(a[i])+1;
                h.put(a[i],freq);
            }
            int k=size/2;
            for(Map.Entry<Integer,Integer> r: h.entrySet()){
                if(r.getValue()>k){
                    return r.getKey();
                }
            }
            return -1;
        }
    }
}
