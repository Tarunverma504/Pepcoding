/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Heap;

/**
 *
 * @author Mind_Coder
 */
/*
Given K sorted arrays arranged in the form of a matrix of size K*K. The task is to merge them into one sorted array.
Example 1:

Input:
K = 3
arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
Output: 1 2 3 4 5 6 7 8 9
Explanation:Above test case has 3 sorted
arrays of size 3, 3, 3
arr[][] = [[1, 2, 3],[4, 5, 6], 
[7, 8, 9]]
The merged list will be 
[1, 2, 3, 4, 5, 6, 7, 8, 9].
Example 2:

Input:
K = 4
arr[][]={{1,2,3,4},{2,2,3,4},
         {5,5,6,6},{7,8,9,9}}
Output:
1 2 2 2 3 3 4 4 5 5 6 6 7 8 9 9 
Explanation: Above test case has 4 sorted
arrays of size 4, 4, 4, 4
arr[][] = [[1, 2, 2, 2], [3, 3, 4, 4],
[5, 5, 6, 6], [7, 8, 9, 9 ]]
The merged list will be 
[1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 
6, 6, 7, 8, 9, 9].
Your Task:
You do not need to read input or print anything. Your task is to complete mergeKArrays() function which takes 2 arguments, an arr[K][K] 2D Matrix containing K sorted arrays and an integer K denoting the number of sorted arrays, as input and returns the merged sorted array ( as a pointer to the merged sorted arrays in cpp, as an ArrayList in java, and list in python)

Expected Time Complexity: O(K2*Log(K))
Expected Auxiliary Space: O(K2)

Constraints:
1 <= K <= 100
*/
import java.util.*;
public class Merge_k_Sorted_Arrays_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
        */
    }
    static class Solution
    {
        //Function to merge k sorted arrays.
        public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
        {
            // Write your code here.
            ArrayList<Integer> ans = new ArrayList<Integer>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++){
                    pq.add(arr[i][j]);
                }
            }

            while(!pq.isEmpty()){
                ans.add(pq.poll());
            }

            return ans;
        }
    }
}
