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
    Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.

Note: H is the height of the tree and this space is used implicitly for the recursion stack.
 

TreeToList

Example 1:

Input:
      1
    /  \
   3    2
Output:
3 1 2 
2 1 3 
Explanation: DLL would be 3<=>1<=>2
Example 2:

Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:  DLL would be 
40<=>20<=>60<=>10<=>30.
Your Task:
You don't have to take input. Complete the function bToDLL() that takes root node of the tree as a parameter and returns the head of DLL . The driver code prints the DLL both ways.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).

Constraints:
1 ≤ Number of nodes ≤ 105
0 ≤ Data of a node ≤ 105
*/
import java.util.*;
public class Binary_Tree_to_DLL_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
        */
    }
    static class Node
    {
            Node left, right;
            int data;

            Node(int d)
            {
                    data = d;
                    left = right = null;
            }

    }

    //This function should return head to the DLL

    static class Solution
    {
        //Function to convert binary tree to doubly linked list and return it.
        Node bToDLL(Node root)
        {
            //  Your code here	
                ArrayList<Integer> list = new ArrayList<Integer>();
                getElements(root, list);
                Node head = new Node(list.get(0));
                Node temp = head;
                for(int i=1;i<list.size(); i++){
                    Node curr = new Node(list.get(i));
                    temp.right = curr;
                    curr.left = temp;
                    temp = curr;
                }
                return head;
        }

        public static void getElements(Node root,ArrayList<Integer> al){
            if(root==null)
                return;
            getElements(root.left, al);
            al.add(root.data);
            getElements(root.right, al);
        }
    }
}
