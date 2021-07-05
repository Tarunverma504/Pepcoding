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
public class sorting_linked_list {
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
    
    public static void sortlist(){
        Node ptr1=head;
        while(ptr1.next!=null){
            Node ptr2=ptr1.next;
            while(ptr2.next!=null){
                if(ptr2.data<ptr1.data){
                    int temp=ptr2.data;
                    ptr2.data=ptr1.data;
                    ptr1.data=temp;
                }
                ptr2=ptr2.next;
            }
            if(ptr2.data<ptr1.data){
                    int temp=ptr2.data;
                    ptr2.data=ptr1.data;
                    ptr1.data=temp;
                }
           ptr1=ptr1.next;
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
        System.out.println("Enter no of list entries");
        int n=sc.nextInt();
        System.out.println("Enter Items");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        System.out.println("current list");
        display();
        System.out.println("List after sorting");
        sortlist();
        display();
        
    }
}
