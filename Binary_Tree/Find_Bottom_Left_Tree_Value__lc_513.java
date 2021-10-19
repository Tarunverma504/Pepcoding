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
Given the root of a binary tree, return the leftmost value in the last row of the tree.

 

Example 1:


Input: root = [2,1,3]
Output: 1
Example 2:


Input: root = [1,2,3,4,null,5,6,null,null,7]
Output: 7
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
Accepted
149,135
Submissions
233,097
*/
import java.util.*;
public class Find_Bottom_Left_Tree_Value__lc_513 {
    /*
    https://leetcode.com/problems/find-bottom-left-tree-value/
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
    static class Solution {
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                root=q.poll();
                if(root.right!=null)
                    q.add(root.right);
                if(root.left!=null)
                    q.add(root.left);
            }
            return root.val;
        }
    }
    
}
