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
Given a Binary Tree of size N. Find the sum of all the leaf nodes that are left child of their parent of the given binary tree.

Example 1:

Input:
       1
     /   \
    2     3
Output: 2

Example 2:

Input : 
         1
        /  \
       2    3
     /  \     \
    4    5     8 
  /  \        /  \
 7    2      6    9
Output: 13
Explanation:
sum = 6 + 7 = 13
Your Task:
You don't need to read input or print anything. Your task is to complete the function leftLeavesSum() which takes the root node of the tree as input and returns the sum of all the left leaf nodes present in the given binary tree.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1<=Number of nodes<=105

Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.`

*/
public class Sum_of_Left_Leaf_Nodes__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/sum-of-left-leaf-nodes/1#
        */
    }
    class Node  
    { 
        int data; 
        Node left, right; 

        public Node(int d)  
        { 
            data = d; 
            left = right = null; 
        } 
    }
    static class Solution{
        int sum=0;
        public int leftLeavesSum(Node root) 
        { 
            // Write your code here
            getSum(root,false);
            return sum;
        } 
        void getSum(Node node,boolean isLeftLeaf){
            if(node==null){
                return;
            }
            if(node.left==null && node.right==null && isLeftLeaf){
                sum+=node.data;
            }
            getSum(node.left,true);
            getSum(node.right,false);
        }

    }
}
