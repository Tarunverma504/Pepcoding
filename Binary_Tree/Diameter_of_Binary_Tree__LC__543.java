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
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

 

Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100
*/
public class Diameter_of_Binary_Tree__LC__543 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/diameter-of-binary-tree/
        */
    }
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
    //-----------------------------Best Approach----------------------------------
    
    class Solution {
        int max=0;
        public int diameterOfBinaryTree(TreeNode root) {
            maxDepth(root);
            return max;
        }
        public  int maxDepth(TreeNode root){
            if(root==null)
                return 0;
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            max=Math.max(max,left+right);
            return Math.max(left,right)+1;
        }
    }
    
    //-----------------------------worst Approach----------------------------------
    /*class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            if(root==null)
                return 0;
            int lp = diameterOfBinaryTree(root.left);
            int rp = diameterOfBinaryTree(root.right);
            int f = height(root.left)+height(root.right)+2;
            int dia = Math.max(f, Math.max(lp,rp));
            return dia;
        }
        public int height(TreeNode node){
            if(node==null)
                return -1;
            int left=height(node.left);
            int right = height(node.right);
            return Math.max(left,right)+1;
        }
    }
    */
}
