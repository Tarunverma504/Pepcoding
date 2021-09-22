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
public class searching_and_deleting_element {
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
    
    public static  boolean search(int s){
        if(head.data==s){
            head=head.next;
            
            return true;
        }
        Node next_node=head;
        Node prev_node=head;
        while(next_node!=null){
            
            if(next_node.data==s){
                prev_node.next=next_node.next;
                next_node=null;
                return true;
            }
            prev_node=next_node;
            next_node=next_node.next;
        }
        return false;
        
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
        System.out.println("Enter No. to be searched");
        int s=sc.nextInt();
        System.out.println("current list");
        display();
        if(!search(s)){
            System.out.println("Element Not found");
        }
        display();
    }
}
