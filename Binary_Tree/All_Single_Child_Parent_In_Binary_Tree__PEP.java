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
1. Given a Binary Tree, return list of all single child parent of binary tree
2. For more Information watch given video link below.
Input Format
Input is managed for you.
Output Format
Output is managed for you. 
Question Video

  COMMENTConstraints
0 <= Number of Nodes <= 10^5
-1000 <= value of Node data <= 1000
Sample Input
15
4
2
1
-1
-1
3
-1
-1
6
5
-1
-1
7
-1
-1


*/
import java.util.*;
public class All_Single_Child_Parent_In_Binary_Tree__PEP {
    
    public static void main(String arg[]){
        /*
            https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/trees/all-single-child-parent-in-binary-tree/ojquestion
        */
    }
    
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
          this.val = val;
        }
      }
  
  
  static ArrayList<Integer> ans ;
  public static ArrayList<Integer> exactlyOneChild(TreeNode root) {
      ans = new ArrayList<>();
      sol(root);
    return ans;
  }
  
  public static void sol(TreeNode root){
      if(root==null)
        return;
      if(root.left==null && root.right!=null)
          ans.add(root.val);
      if(root.right==null && root.left!=null)
        ans.add(root.val);
      sol(root.left);
      sol(root.right);
  }
}
