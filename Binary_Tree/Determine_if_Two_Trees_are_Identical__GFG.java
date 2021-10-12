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
Given two binary trees, the task is to find if both of them are identical or not. 


Example 2:

Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: Yes
Explanation: There are two trees both
having 3 nodes and 2 edges, both trees
are identical having the root as 1,
left child of 1 is 2 and right child
of 1 is 3.
Example 2:

Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: No
Explanation: There are two trees both
having 3 nodes and 2 edges, but both
trees are not identical.

Your task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function isIdentical() that takes two roots as parameters and returns true or false. The printing is done by the driver code.
*/
import java.util.*;
public class Determine_if_Two_Trees_are_Identical__GFG {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static class Solution
    {
        //Function to check if two trees are identical.
            boolean isIdentical(Node a, Node b)
            {
                // Code Here
                if(a==null && b==null)
                    return true;
               if(a!=null && b!=null){
                   return ((a.data==b.data) && isIdentical(a.left,b.left) && isIdentical(a.right,b.right));
               }

               return false;
            }

    }
}
