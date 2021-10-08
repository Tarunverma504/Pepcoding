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
public class Find_And_Nodetorootpath_In_Binary_Tree {
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
    
    static ArrayList<Integer> path=new ArrayList<>();
  public static boolean find(Node node, int data){
    // write your code here
    if(node==null){
        return false;
    }
        
    if(node.data==data){
        path.add(node.data);
        return true;
    }
        
    boolean left=find(node.left,data);
    if(left){
        path.add(node.data);
        return true;
    }
        
    boolean right=find(node.right,data);
    if(right){
        path.add(node.data);
        return true;
    }
        
    return false;
  }
  
}
