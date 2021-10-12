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

import java.util.*;
public class Remove_Leaves_In_Binary_Tree {
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
    public static Node removeLeaves(Node node){
    // write your code here
    if(node == null)
        return null;
    if(node.left==null && node.right==null)
        return null;
    node.left=removeLeaves(node.left);
    node.right=removeLeaves(node.right);
    return node;
  }
}
