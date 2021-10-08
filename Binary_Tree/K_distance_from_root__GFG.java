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
public class K_distance_from_root__GFG {
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
     public static void printKLevelsDown(Node node, int k){
        // write your code here
        if(node==null || k<0)
            return;
        if(k==0){
            System.out.println(node.data);
        }
        printKLevelsDown(node.left,k-1);
        printKLevelsDown(node.right,k-1);

      }
}
