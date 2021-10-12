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
public class Print_Single_Child_Nodes {
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
    public static void printSingleChildNodes(Node node, Node parent){
    // write your code here
        if(node==null)
            return;
        if(parent!=null && parent.left==null && parent.right!=null)
            System.out.println(node.data);
        if(parent!=null && parent.left!=null && parent.right==null)
            System.out.println(node.data);
        printSingleChildNodes(node.left,node);
        printSingleChildNodes(node.right,node);
    
  }
}
