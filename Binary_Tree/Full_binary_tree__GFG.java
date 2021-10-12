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
Given a Binary Tree. Check whether the Binary tree is a full binary tree or not.

Example 1:

Input:
          1
       /    \
      2      3
    /   \
   4     5
Output: 1
Explanation: Every node except leaf node
has two children so it is a full tree.
Example 2:

Input:
          1
       /    \
      2      3
    /   
   4     
Output: 0
Explanation: Node 2 has only one child
so this is not a full tree.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function isFullTree() which takes the root node of the tree as input and returns True if the given Binary Tree is full. Else, it returns False. (The driver code will print 1 if the returned value is true, otherwise 0).

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1<=Number of nodes<=1000
*/
import java.util.*; 
public class Full_binary_tree__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/full-binary-tree/1#
        */
    }
    class Node 
    {
        int data;
        Node left, right;

        Node(int item) 
        {
            data = item;
            left = right = null;
        }
    }
    static class GfG
    {
        // Return True if the given Binary Tree is a Full Binary Tree. Else return False
            boolean isFullTree(Node node)
        {
            //add code here.
            if(node==null)
                return true;
            if(node.left==null&& node.right==null)
                return true;
            if(node.left!=null && node.right!=null){
                return( isFullTree(node.left) && isFullTree(node.right) );
            }
            return false;
        }
    }
}
