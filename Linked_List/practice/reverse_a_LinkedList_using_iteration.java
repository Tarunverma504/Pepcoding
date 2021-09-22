/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_List.practice;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;

public class reverse_a_LinkedList_using_iteration {
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
    
    static void reverse(){
        if(head==null){
            return;
        }
        else{
            Node prev_node=null; // store the address of previous node
            Node current_node=head; //store address of current node
            Node next_node=head;  //store address of next node basically used for iterating
            while(next_node!=null){
                next_node=next_node.next;//store the address of next node of given list
                current_node.next=prev_node;  //assign previous node  address to current node to point previous node 
                prev_node=current_node; //assign address of current node to prev_node so that we can assign to next node for pointing
                current_node=next_node;  //assign address of next node to current node for iterating
            }
            head=prev_node;
        }
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
        System.out.println("Enter No. of entries");
        int n=sc.nextInt();
        System.out.println("Enter Items");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        System.out.println("List before reverse");
        display();
        System.out.println("List after reverse");
        reverse();
        display();
    }
}
