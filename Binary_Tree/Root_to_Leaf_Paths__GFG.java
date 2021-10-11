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
Given a Binary Tree of size N, you need to find all the possible paths from root node to all the leaf node's of the binary tree.

Example 1:

Input:
       1
    /     \
   2       3
Output: 1 2 #1 3 #
Explanation: 
All possible paths:
1->2
1->3

Example 2:

Input:
         10
       /    \
      20    30
     /  \
    40   60
Output: 10 20 40 #10 20 60 #10 30 #

Your Task:
Your task is to complete the function Paths() that takes the root node as an argument and return all the possible path. (All the path are printed '#' separated by the driver's code.)

Note: The return type
cpp: vector
java: ArrayList>
python: list of list

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree.

Constraints:
1<=N<=103

Note: The Input/Ouput format and Example given, are used for the system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from the stdin/console. The task is to complete the function specified, and not to write the full code.
*/
import java.util.*;
public class Root_to_Leaf_Paths__GFG {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static class Tree{
        public ArrayList<ArrayList<Integer>> Paths(Node root){
            // Code here
             ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
             ArrayList<Integer> temp = new ArrayList<Integer>();
            getPath(ans,root,temp);
            return ans;
        }

        public static void getPath(ArrayList<ArrayList<Integer>> ans, Node node,ArrayList<Integer> temp ){

            if(node==null)
                return;
            if(node.left==null &&node.right==null){
                temp.add(node.data);
                ans.add(temp);
                return;
            }
            temp.add(node.data);
            ArrayList<Integer> a = new ArrayList<>(temp);
            ArrayList<Integer> b = new ArrayList<>(temp);
            if(node.left!=null) getPath(ans,node.left,a);
             if(node.right!=null) getPath(ans,node.right,b);

        }

    }
}
