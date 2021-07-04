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
public class deletionbeginning {
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
    
    static Node deletebeg(Node l){
        if(l==null){
            System.out.println("empty list");
            return l;
        }
        else{
            Node pt=l;
            l=pt.next;
            pt.next=null;
        }
        return l;
        
    }
    static void display(Node l){
        Node temp=l;
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
         System.out.println("Before Deletion ");
         display(l1);
         l1=deletebeg(l1);
         System.out.println("After deletion");
         display(l1);
    }
}
