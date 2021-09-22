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
public class deletionending {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node insert(int num){
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
    static Node deleteend(Node l){
        if(l==null){
            System.out.println("List is empty");
        }
        else if(l.next==null){
            l=null;
            return l;
        }
        else{
            Node prev=l;
            Node ptr=l;
            while(ptr.next!=null){
                prev=ptr;
                ptr=ptr.next;
            }
            prev.next=null;
            ptr=null;
        }
        return l;
    }
    static void display(Node l){
        Node temp=l;
        if(l==null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of entries");
        int n=sc.nextInt();
        Node l1=null;
        for(int i=0;i<n;i++){
            l1=insert(sc.nextInt());
        }
         System.out.println("current list is");
         display(l1);
         System.out.println("After deletion");
         l1=deleteend(l1);
         display(l1);
         
    }
}
