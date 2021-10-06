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
public class Max_and_min_element_in_Binary_Tree {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1#
        */
    }
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }
    static class Solution{
        public static int findMax(Node root){
            //code here
            if(root==null)
                return Integer.MIN_VALUE;
            int left=findMax(root.left);
            int right=findMax(root.right);
            return Math.max(root.data,Math.max(left,right));

        }
        public static int findMin(Node root){
            //code here
            if(root==null)
                return Integer.MAX_VALUE;
            int left=findMin(root.left);
            int right=findMin(root.right);
            return Math.min(root.data,Math.min(left,right));
        }
    }
}
