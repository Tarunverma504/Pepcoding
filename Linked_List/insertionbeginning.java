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
public class insertionbeginning {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node insert(int item){
        Node temp=new Node(item);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
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
    static Node head;
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        display(head);
    }
}
