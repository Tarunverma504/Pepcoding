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
public class deleteanywhere {
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
    
    
    static Node deletepos(Node l1,int pos,int n){
        if(pos==0){
           Node temp=l1;
           l1=temp.next;
           temp.next=null;
        }
        else if(pos>0&&pos<=n-1){
            
            Node ptr=l1;
            Node prev=l1;
            while(pos!=0){
                prev=ptr;
                ptr=ptr.next;
                pos--;
            }
            prev.next=ptr.next;
            ptr.next=null;
            return l1;

        }
        else{
            System.out.println("Invalid Position");
        }
        return l1;
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
         System.out.println("current list is");
         display(l1);
         System.out.println("enter the position u want to delete");
         int pos=sc.nextInt();
         l1=deletepos(l1,pos,n);
         display(l1);
    }
}
