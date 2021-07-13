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
public class middle_of_list_without_using_size_property {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    public static Node insertend(int num){
        Node temp=new Node(num);
        if(head==null){
            head=temp;
        }
        else{
            Node t_node=head;
            while(t_node.next!=null){
                t_node=t_node.next;
            }
            t_node.next=temp;
        }
        return head;
    }
    
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
          insertend(sc.nextInt());
        }
        System.out.println("Current list is :-");
        display(head);
        System.out.println();
        System.out.println("Middle element is :- "+middle(head));
    }
    public static int middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
