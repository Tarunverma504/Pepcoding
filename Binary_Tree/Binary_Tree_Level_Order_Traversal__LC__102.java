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
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
Accepted
987,138
Submissions
1,674,442
Seen this question in a real interview before?
*/
import java.util.*;
public class Binary_Tree_Level_Order_Traversal__LC__102 {
    
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    static class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> result= new ArrayList<>();
         if(root==null)
             return result;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.peek();
                q.remove();
                temp.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
}
