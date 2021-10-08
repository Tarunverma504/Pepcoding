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
public class Print_Nodes_K_Distance_Away {
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
    static ArrayList<Node> path;
    public static void printKNodesFar(Node node, int data, int k) {
      // write your code here
          Node temp=node;
          path=new ArrayList<>();
          findNodeToRootPath(temp,data);
          for(int i=0;i<path.size();i++){
              printKLevelDown(path.get(i),k-i, i==0?null:path.get(i-1));
          }
    }
  
    static boolean findNodeToRootPath(Node temp,int data){
      if(temp==null)
        return false;
      if(temp.data == data){
          path.add(temp);
          return true;
      }
      boolean left=findNodeToRootPath(temp.left,data);
      if(left){
          path.add(temp);
          return true;
      }
      boolean right = findNodeToRootPath(temp.right ,data);
      if(right){
          path.add(temp);
          return true;
      }
      return false;
      
    }
    
    static void printKLevelDown(Node temp,int k, Node blocker){
        if(temp==null || k<0 || temp==blocker)
            return;
        if(k==0){
            System.out.println(temp.data);
        }
        printKLevelDown(temp.left,k-1,blocker);
        printKLevelDown(temp.right,k-1,blocker);
    }
}
