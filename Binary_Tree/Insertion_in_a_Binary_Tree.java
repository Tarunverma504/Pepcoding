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
public class Insertion_in_a_Binary_Tree {
    static class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key=key;
            this.left=null;
            this.right=null;
        }
    }
    static Node root;
    static Node temp = root;
    static void inorder(Node temp){
        if(temp==null)
            return ;
        inorder(temp.left);
        System.out.println(temp.key+" ");
        inorder(temp.right);
    }
    
    static void insert(Node temp,int key){
        
        if(temp==null){
            root=new Node(key);
        }
        Queue<Node> q=new LinkedList<>();
        q.add(temp);
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }
            else{
                q.add(temp.left);
            }
            
            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
        
    }
    
    public static void main(String arg[]){
        root = new Node(10);
        root.left=new Node(11);
        root.left.left=new Node(7);
        root.right=new Node(9);
        root.right.left=new Node(15);
        root.right.right=new Node(8);
        System.out.println("Inorder traversal before insertion:");
        inorder(root);
        int key=12;
        insert(root,key);
        insert(root,13);
        insert(root,14);
        insert(root,15);
        System.out.println("Inorder traversal after insertion");
        inorder(root);
    }
    
    
    
}
