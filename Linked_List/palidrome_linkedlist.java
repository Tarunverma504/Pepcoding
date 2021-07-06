/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_List;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
public class palidrome_linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static void insert(int data){
        Node new_node=new Node(data);
        if(head==null){
            new_node.next=null;
            head=new_node;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
        
    }
    
    static boolean isPalidrome(Node right){
        if(right==null){
            return true;
        }
        boolean result=isPalidrome(right.next);
        if(result==false)
            return false;
        else if(left.data!=right.data)
            return false;
        else{
            left=left.next;
            return true;
        }
        
    }
    
    static Node left=null;
    static void checkPalidrome(){
        left=head;
        Node right=left;
        System.out.println(isPalidrome(right));
    }
    
    static void display(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of list entries");
        int n=sc.nextInt();
        System.out.println("Enter Items");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        System.out.println("current list");
        display();
        checkPalidrome();
        // System.out.println("List after sorting");
        // sortlist();
        // display();
        
    }
}
