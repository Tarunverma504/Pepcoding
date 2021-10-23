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
Given the binary Tree of and two-node values. Check whether the two-node values are cousins of each other or not.

Example 1:

Input:
      1
    /   \
   2     3
a = 2, b = 3
Output: 0

Example 2:

Input:
       1
     /   \ 
    2     3
   /       \
  5         4 
a = 5, b = 4
Output: 1
Explanation: Here, nodes 5 and 4 are
at the same level and have different
parent nodes. Hence, they both are cousins 

Your Task:
You don't need to read input or print anything. Your task is to complete the function isCousins() that takes the root node of the tree (having all nodes distinct), and two integers 'a' and 'b' as inputs. It returns true if the nodes with given values 'a' and 'b' are Cousins of each other and returns false otherwise. 
Two nodes value are cousins of each other if they are at the same level and have different parents. (The driver code will print 1 if the returned values is true,otherwise 0.)

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1<=Number of Nodes<=1000
*/

import java.util.*;
public class Check_if_two_Nodes_are_Cousins__GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/check-if-two-nodes-are-cousins/1
        */
    }
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    
    static class Solution {
    
        // Returns true if the nodes with values 'a' and 'b' are cousins. Else returns false
        public boolean isCousins(Node root, int a, int b) {
            // your code here
            // This function should return true if x and y are cousins, else return false
            if(level(root,a)!=level(root,b))
                return false;
            return !isSibling(root,a,b);
        }

        public static boolean isSibling(Node root,int a,int b){
            if(root==null)
                return false;
            int x=root.left!=null? root.left.data:0;
            int y=root.right!=null? root.right.data:0;

            return ((x==a && y==b) || (x==b && y==a) || (a==b)
                || isSibling(root.left,a,b) 
                || isSibling(root.right,a,b));
        }

        public static int level(Node root ,int data){
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            int level=0;
            while(!q.isEmpty()){
                int n=q.size();
                while(n-- >0){
                    Node temp=q.poll();
                    if(temp.data==data)
                        return level;
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);

                }
                level++;

            }
            return 0;
        }

    }
}
