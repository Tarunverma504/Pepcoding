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
import java.util.*;
/*
Write a code to get the depth of the deepest odd level leaf node in a binary tree. Consider that level starts with 1. Depth of a leaf node is number of nodes on the path from root to leaf (including both leaf and root).
For example, consider the following tree. The deepest odd level node is the node with value 9 and depth of this node is 5. 
 
*/
public class Find_depth_of_the_deepest_odd_level_leaf_node__GFG {
    static Node root;
    public static void main(String args[])
    {
        /*
        https://www.geeksforgeeks.org/find-depth-of-the-deepest-odd-level-node/
        */
        int k = 45;

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.left.right.left = new Node(9);
        root.right.right.right.right = new Node(10);
        root.right.right.right.right.left = new Node(11);
        System.out.println(depthOfOddLeaf(root) +" is the required depth");
    }
    static int depth;
    static int depthOfOddLeaf(Node root){
        depth=0;
        getDepth(root,1);
        return depth;
    }
    static void getDepth(Node node,int level){
        if(node==null)
             return;
        if(node.left==null && node.right==null && (level%2!=0) && (level>depth))
            depth=level;
        getDepth(node.left,level+1);
        getDepth(node.right,level+1);
    }
    
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    
}
