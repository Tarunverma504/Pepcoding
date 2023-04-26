/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.BinaryTree;

/**
 *
 * @author Mind_Coder
 */
/*
    Given 2 Arrays of Inorder and preorder traversal. The tree can contain duplicate elements. Construct a tree and print the Postorder traversal. 

Example 1:

Input:
N = 4
inorder[] = {1 6 8 7}
preorder[] = {1 6 7 8}
Output: 8 7 6 1
Example 2:

Input:
N = 6
inorder[] = {3 1 4 0 5 2}
preorder[] = {0 1 3 4 2 5}
Output: 3 4 1 5 2 0
Explanation: The tree will look like
       0
    /     \
   1       2
 /   \    /
3    4   5
Your Task:
Your task is to complete the function buildTree() which takes 3 arguments(inorder traversal array, preorder traversal array, and size of tree n) and returns the root node to the tree constructed. You are not required to print anything and a new line is added automatically (The post order of the returned tree is printed by the driver's code.)

Expected Time Complexity: O(N*N).
Expected Auxiliary Space: O(N).
*/
public class Construct_Tree_from_Inorder_Preorder_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/construct-tree-1/1
        */
    }
    static class Node
    {
        int data;
        Node left;
        Node right;

            Node(int value)
        {
            data = value;
            left = null;
            right = null;
        }
    }
    static class Solution
    {
        public static Node buildTree(int inorder[], int preorder[], int n)
        {
            // code here 
            return sol(inorder, preorder, 0, inorder.length-1, 0, preorder.length-1);
        }

        public static Node sol(int in[], int[] pre, int inStart, int inEnd, int preStart, int preEnd){
            if(inStart>inEnd)
                return null;
            int rootVal = pre[preStart];
            Node root = new Node(rootVal);
            int idx = inStart;
            for(; idx<=inEnd; idx++){
                if(in[idx]==rootVal)
                    break;
            }

            int leftSubTreeSize = idx - inStart;
            int rightSubTreeSize = inEnd - idx;

            root.left = sol(in, pre, inStart, idx-1, preStart+1, preStart+leftSubTreeSize);
            root.right = sol(in, pre, idx+1, inEnd, preEnd-rightSubTreeSize+1, preEnd);
            return root;
        }
    }

}
