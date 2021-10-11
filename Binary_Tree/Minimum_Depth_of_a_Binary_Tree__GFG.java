/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Tree;

/**
 *
 * @author Mind_Coder
 */
/*
Given a binary tree, find its minimum depth.

Example 1:

Input:
            1
          /   \
         3     2
        /
       4           

Output: 2

Explanation:
Minimum depth is between nodes 1 and 2 since
minimum depth is defined as  the number of 
nodes along the shortest path from the root 
node down to the nearest leaf node.

Example 2:

Input:
             10
          /     \
        20       30
          \        \   
          40        60 
                   /
                  2 

Output: 3

Explanation:
Minimum depth is between nodes 10,20 and 40.

Your Task:  
You don't need to read input or print anything. Complete the function minDepth() which takes the root node as an input parameter and returns the minimum depth.
 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of the tree)
*/
import java.util.*;
public class Minimum_Depth_of_a_Binary_Tree__GFG {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static class Solution
    {
            int minDepth(Node root)
            {
                //code here
                if(root==null){
                    return 0;
                }
                int left=minDepth(root.left);
                int right=minDepth(root.right);
                if(left==0 || right==0){    //this is for if the tree is one sided
                    return Math.max(left,right)+1;
                }
                return Math.min(left,right)+1;
            }
    }
}
