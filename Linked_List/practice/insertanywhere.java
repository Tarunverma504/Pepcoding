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
public class insertanywhere {
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
    public static Node insertpos(int data,int pos,int n,Node l1){
        Node temp=new Node(data);
        if(pos<0){
            System.out.println("Position must be greater than 0");
        }
        else if(pos==0){
            temp.next=head;
            l1=temp;
        }
        else if(pos>n){
            System.out.println("Invalid Position");
        }
        else if(pos==n){
            Node p=l1;
            while(p.next!=null){
                p=p.next;
            }
            p.next=temp;
            
        }
        else if(pos<n){
            Node ptr=l1;
            Node prev=l1;
            while(pos!=0){
                prev=ptr;
                ptr=ptr.next;
                pos--;
            }
            prev.next=temp;
            temp.next=ptr;
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
         System.out.println("enter the data u want to insert nywhere");
         
         int data=sc.nextInt();
         System.out.println("enter the position");
         int pos=sc.nextInt();
         l1=insertpos(data,pos,n,l1);
         display(l1);
    }
}
