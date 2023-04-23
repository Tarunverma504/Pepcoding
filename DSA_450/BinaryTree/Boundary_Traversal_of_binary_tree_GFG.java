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
import java.util.*;
/*
    Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

A height balanced tree
        1
     /     \
   10      39
  /
5

An unbalanced tree
        1
     /    
   10   
  /
5

Example 1:

Input:
      1
    /
   2
    \
     3 
Output: 0
Explanation: The max difference in height
of left subtree and right subtree is 2,
which is greater than 1. Hence unbalanced
Example 2:

Input:
       10
     /   \
    20   30 
  /   \
 40   60
Output: 1
Explanation: The max difference in height
of left subtree and right subtree is 1.
Hence balanced. 
*/
public class Boundary_Traversal_of_binary_tree_GFG {
    class Node  
    { 
        int data; 
         Node left, right; 
   
     public Node(int d)  
     { 
         data = d; 
         left = right = null; 
     } 
 }
    static class Solution
    {
            ArrayList <Integer> boundary(Node node)
            {
                 ArrayList<Integer> ans= new ArrayList<Integer>();
                 if(node.left==null && node.right==null){
                     ans.add(node.data);
                     return ans;
                 }

                 ans.add(node.data);
                 leftBoundary(node.left, ans);
                 leafNodes(node, ans);
                 rightBoundary(node.right, ans);
                 return ans;
            }

            public static void leftBoundary(Node node, ArrayList<Integer> ans){
                if(node==null)
                    return ;
               if(node.left!=null){
                   ans.add(node.data);
                   leftBoundary(node.left, ans);
               }
               else if(node.right!=null){
                   ans.add(node.data);
                   leftBoundary(node.right, ans);
               }
            }

            public static void leafNodes(Node node, ArrayList<Integer> ans){
               if(node==null)
                return;
               leafNodes(node.left, ans);
               if(node.left==null && node.right==null)
                ans.add(node.data);
               leafNodes(node.right, ans);
            }

            public static void rightBoundary(Node node, ArrayList<Integer> ans){
                if(node==null)
                    return ;

               if(node.right!=null){

                   rightBoundary(node.right, ans);
                   ans.add(node.data);
               }
               else if(node.left!=null){

                   rightBoundary(node.left, ans);
                   ans.add(node.data);
               }
            }
    }
}
