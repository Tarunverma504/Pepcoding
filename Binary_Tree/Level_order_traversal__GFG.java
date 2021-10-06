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
Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:10 20 30 40 60 N N

Your Task:
You don't have to take any input. Complete the function levelOrder() that takes the root node as input parameter and returns a list of integers containing the level order traversal of the given Binary Tree.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105
*/
import java.util.*;
public class Level_order_traversal__GFG {
    public static void main(String argp[]){
        /*
            https://practice.geeksforgeeks.org/problems/level-order-traversal/1
        */
    }
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    static class Solution
    {
        //Function to return the level order traversal of a tree.
        static ArrayList <Integer> levelOrder(Node node) 
        {
            // Your code here
            ArrayList<Integer> ans = new ArrayList<Integer>();
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);
            while(!q.isEmpty()){
                Node temp=q.peek();
                q.remove();
                ans.add(temp.data);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            return ans;
        }
    }
}
