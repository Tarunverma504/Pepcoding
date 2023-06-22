/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.BinaryTree;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array A[] which represents a Complete Binary Tree i.e, if index i is the parent, index 2*i + 1 is the left child and index 2*i + 2 is the right child.
The task is to find the minimum number of swaps required to convert it into a Binary Search Tree. 

Example 1:

Input:
A[] = { 5, 6, 7, 8, 9, 10, 11 }
Output: 3
Explanation: 
Binary tree of the given array:

Swap 1: Swap node 8 with node 5.
Swap 2: Swap node 9 with node 10.
Swap 3: Swap node 10 with node 7.

So, minimum 3 swaps are required.
Example 2:

Input: 
A[] = {1, 2, 3}
Output: 1
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function minSwaps() which takes an array A[] and returns an integer as output.

Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(N)
*/
import java.util.*;
public class Minimum_swap_required_to_convert_binary_tree_to_binary_search_tree_GFG {
    static class Solution {
        public static int minSwaps(int n, int[] A) {
            // code here
            ArrayList<Integer> al = new ArrayList<Integer>();
            inorder(al, A, 0);
            int count=0;
            int arr[] = new int[al.size()];
            int brr[] = new int[al.size()];
            for(int i=0; i<al.size(); i++){
                arr[i]=al.get(i);
                brr[i]=al.get(i);
            } 


            Arrays.sort(brr);

            for(int i=0;i<arr.length;i++){
                if(arr[i]!=brr[i]){
                    count++;
                    for(int j=i; j<arr.length;j++){
                        if(arr[j]==brr[i]){
                            int temp = arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            break;
                        }
                    }
                }
            }
            return count;
        }

        public static void inorder(ArrayList<Integer> al, int[] arr, int idx){
            if(idx>=arr.length)
                return ;
            inorder(al, arr, 2*idx+1);
            al.add(arr[idx]);
            inorder(al, arr, 2*idx+2);
        }
    }
}
