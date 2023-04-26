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
    Given inorder and postorder traversals of a Binary Tree in the arrays in[] and post[] respectively. The task is to construct the binary tree from these traversals.

 

Example 1:

Input:
N = 8
in[] = 4 8 2 5 1 6 3 7
post[] =8 4 5 2 6 7 3 1
Output: 1 2 4 8 5 3 6 7
Explanation: For the given postorder and
inorder traversal of tree the  resultant
binary tree will be
           1
       /      \
     2         3
   /  \      /  \
  4    5    6    7
   \
     8
 

Example 2:

Input:
N = 5
in[] = 9 5 2 3 4
post[] = 5 9 3 4 2
Output: 2 9 5 4 3
Explanation:  
the  resultant binary tree will be
           2
        /     \
       9       4
        \     /
         5   3
 

Your Task:
You do not need to read input or print anything. Complete the function buildTree() which takes the inorder, postorder traversals and the number of nodes in the tree as input parameters and returns the root node of the newly constructed Binary Tree.
The generated output contains the preorder traversal of the constructed tree.

 

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N)
*/
public class Tree_from_Postorder_and_Inorder_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/tree-from-postorder-and-inorder/1
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


    static class GfG
    {
        //Function to return a tree created from postorder and inoreder traversals.
        Node buildTree(int in[], int post[], int n) {
            // Your code 
            return sol(in, post,0, in.length-1, 0, post.length-1);

        }

        public static Node sol(int in[], int post[], int inStart, int inEnd, int postStart, int postEnd){

            if(inStart>inEnd)
                return null;
            int rootVal = post[postEnd];
            Node root = new Node(rootVal);

            int idx = inStart;
            for(; idx<=inEnd; idx++){
                if(in[idx]==rootVal)
                    break;
            }

            int leftSubtree = idx-inStart;
            int rightSubtree = inEnd-idx;
            root.left = sol(in, post, inStart, idx-1, postStart, postStart+leftSubtree-1);
            root.right = sol(in, post, idx+1, inEnd, postEnd-rightSubtree, postEnd-1);
            return root;
        }
    }

}
