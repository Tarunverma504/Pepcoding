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

import java.util.*;
public class Balanced_Binary_Tree__LC__110 {
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
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return isResult(root)!=-1;
        }
 //-----------------------Best approach-----------------------------------------
        public int isResult(TreeNode root){
            if(root==null)
                return 0;
            int left=isResult(root.left);
            if(left==-1)
                return -1;
            int right = isResult(root.right);
            if(right==-1)
                return -1;
            if(Math.abs(left-right)>1)
                return -1;
            return Math.max(left,right)+1;
        }
    }
    
//--------------------------Native Approach-------------------------------------
    /*
    class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int leftH = height(root.left);
        int rightH = height(root.right);
        if(Math.abs(leftH-rightH)>1)
            return false;
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        if(!left || !right)
                return false;
        return true;
    }
    
    public int height(TreeNode root){
        if(root==null)
            return -1;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
}
    */
}
