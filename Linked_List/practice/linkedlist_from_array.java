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
public class linkedlist_from_array {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node insert(int data,Node l){
        
        Node temp=new Node(data);
        if(l==null){
            
            l=temp;
            return l;
        }
        else{
            
            Node t=l;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
        }
        return l;
    }
    
    static void display(Node l){
        if(l==null){
            System.out.println("List is Empty");
        }
        else{
            
            Node t=l;
            while(t!=null){
                
                System.out.print(t.data+" ");
                t=t.next;
            }
        }
        
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements of the Array");
        int arr[]=new int[n];
        Node l=head;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            l=insert(arr[i],l);
        }
        System.out.println("LinkedList from Array is:-");
        display(l);
    }
}
