package Binary_Tree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
Given the root of a complete binary tree, return the number of the nodes in the tree.

According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

Design an algorithm that runs in less than O(n) time complexity.

 

Example 1:


Input: root = [1,2,3,4,5,6]
Output: 6
Example 2:

Input: root = []
Output: 0
Example 3:

Input: root = [1]
Output: 1
 

Constraints:

The number of nodes in the tree is in the range [0, 5 * 104].
0 <= Node.val <= 5 * 104
The tree is guaranteed to be complete.
*/

import java.util.*;
public class Count_Complete_Tree_Nodes__LC_222 {
    /*
        https://leetcode.com/problems/count-complete-tree-nodes/
    */
    
     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //-----------------------Recursive Solution---------------------------------
    class Solution {
        public int countNodes(TreeNode root) {
            if(root==null)
                return 0;
            int left=countNodes(root.left);
            int right=countNodes(root.right);
            return left+right+1;
        }
    }
    
    /*
    -----------------------------------Iterative Solution-----------------------
    class Solution {
        public int countNodes(TreeNode root) {
            if(root==null)
                return 0;
            Queue<TreeNode> q= new LinkedList<>();
            q.add(root);
            int num=0;
            while(!q.isEmpty()){
                int n=q.size();
                num+=n;
                while(n-- > 0){
                    TreeNode temp=q.poll();
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                }
            }
            return num;
        }
    }
    */
    
}
