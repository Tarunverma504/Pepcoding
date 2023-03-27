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
    Given a sorted array of size N. Count the number of distinct absolute values present in the array.
 

Example 1:

Input:
N = 6
Arr[] = {-3, -2, 0, 3, 4, 5}
Output: 5
Explanation: There are 5 distinct absolute 
values i.e. 0, 2, 3, 4 and 5.

Example 2:

Input:
N = 9
Arr[] = {-1, -1, -1, -1, 0, 1, 1, 1, 1}
Output: 2
Explanation: There are 2 distinct absolute values 
among the elements of this array, i.e. 0 and 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function distinctCount() which takes the array of integers arr[] and its size n as input parameters and returns an integer denoting the answer.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
import java.util.*;
public class Distinct_absolute_array_elements_GFG {
    public static void main(String arg){
        /*
            https://practice.geeksforgeeks.org/problems/distinct-absolute-array-elements4529/1
        */
    }
    static class Solution {
    int distinctCount(int[] arr, int n) {
            // code here
            Set<Integer> s = new HashSet<Integer>();
            for(int i=0;i<arr.length; i++){
                s.add(Math.abs(arr[i]));
            }
            return s.size();
        }
    }
}
