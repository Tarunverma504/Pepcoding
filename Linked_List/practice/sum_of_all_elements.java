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
public class sum_of_all_elements {
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
    
    public static  int sum(){
        Node next_node=head;  
        int sum=0;
        while(next_node.next!=null){
            sum+=next_node.data;
            next_node=next_node.next;
            
        }
        sum+=next_node.data;
        return sum;
        
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
        System.out.println(sum());
    }
}
