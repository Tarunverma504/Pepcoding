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
Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

Example 2:

Input:

Output: 10 20 40
Your Task:
You just have to complete the function leftView() that prints the left view. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
0 <= Number of nodes <= 100
1 <= Data of a node <= 1000
*/

import java.util.*;
public class Left_View_of_Binary_Tree__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#
        */
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
    static class Tree
    {
        //Function to return list containing elements of left view of binary tree.
        ArrayList<Integer> leftView(Node root)
        {
          // Your code here
          ArrayList<Integer> ans = new ArrayList<Integer>();
          if(root==null)
            return ans;
          Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            while(!q.isEmpty()){
                int n=q.size();
                for(int i=0;i<n;i++){
                    root=q.poll();
                    if(i==0)
                        ans.add(root.data);
                    if(root.left!=null)
                        q.add(root.left);
                    if(root.right!=null)
                        q.add(root.right);
                }
            }
            return ans;

        }
    }
}
