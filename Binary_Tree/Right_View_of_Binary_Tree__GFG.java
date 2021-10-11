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
Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Example 1:

Input:
       1
    /    \
   3      2
Output: 1 2
Example 2:

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60
Your Task:
Just complete the function rightView() that takes node as parameter and returns the right view as a list. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105
*/

import java.util.*;
public class Right_View_of_Binary_Tree__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1#
        */
    }
    class Node
    {
        int data;
        Node left, right;
        public Node(int data)
        {
            this.data = data;
             left = right = null;
        }
    }
    static class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if(node == null)
            return ans;
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                node=q.poll();
                if(i==n-1){
                    ans.add(node.data);
                }
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
        return ans;
    }
}
}
