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
1. You are given a partially written BinaryTree class.
2. You are required to complete the body of transBackFromLeftClonedTree function. The function is expected to convert a left-cloned tree back to it's original form. The left cloned tree is dicussed in previous question. In a left-clone tree a new node for every node equal in value to it is inserted between itself and it's left child. For clarity check out the question video.
3. Input and Output is managed for you.
Input Format
Input is managed for you.
Output Format
Output is managed for you. 
Question Video

  COMMENTConstraints
None
Sample Input
37
50 50 25 25 12 12 n n n n 37 37 30 30 n n n n n n 75 75 62 62 n n 70 70 n n n n 87 87 n n n
Sample Output
25 <- 50 -> 75
12 <- 25 -> 37
. <- 12 -> .
30 <- 37 -> .
. <- 30 -> .
62 <- 75 -> 87
. <- 62 -> 70
. <- 70 -> .
. <- 87 -> .


*/
public class Transform_To_Normal_From_Left_cloned_Tree__GFG {
    public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
    public static Node transBackFromLeftClonedTree(Node node){
    // write your code here
    if(node==null)
        return null;
    Node lcr = transBackFromLeftClonedTree(node.left.left);
    Node rcr = transBackFromLeftClonedTree(node.right);
    node.left=lcr;
    node.right=rcr;
    return node;
  }
}
