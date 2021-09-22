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
public class Remove_At_Index_In_Linked_List {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Entries");
        int n=sc.nextInt();
        LinkedList l=new LinkedList();
        for(int i=0;i<n;i++){
            l.addLast(sc.nextInt());
        }
        System.out.println("Enter pos :-");
        l.removeAt(sc.nextInt());
        System.out.println("LinkeList Before Deletion :-");
        l.display();
        
        System.out.println("LinkeList After Deletion :-");
        l.display();
    }
    public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here
      if(size==0){
          Node temp=new Node();
          temp.data=val;
          temp.next=null;
          head=tail=temp;
      }
      else{
          Node temp=new Node();
          temp.data=val;
          temp.next=null;
          tail.next=temp;
          tail=temp;
      }
      size++;
    }
    public void addFirst(int val) {
      // write your code here
      Node temp=new Node();
      temp.data=val;
      temp.next=head;
      head=temp;
      if(size==0)
        tail=temp;
      size++;
    }
    public void addAt(int idx, int val){
      // write your code here
      if(idx<0 || idx>size)
        System.out.println("Invalid arguments");
        else if(idx==0)
            addFirst(val);
        else if(idx==size)
            addLast(val);
        else{
            Node node=new Node();
            node.data=val;
            
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
        
    }
    public void removeFirst(){
      // write your code here
      if(head==null){
          System.out.println("List is empty");
      }
      else{
          head=head.next;
          size--;
      }
    }
    public void removeLast(){
      // write your code here
      if(size==0)
        System.out.println("List is empty");
        else if(size==1){
            head=tail=null;
            size=0;
        }
        else{
            Node temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            tail=temp;
            temp.next=null;
            size--;
        }
           
    }
    public void removeAt(int idx) {
      // write your code here
      if(idx<0 || idx>=size)
        System.out.println("Invalid arguments");
     else if(idx==0)
        removeFirst();
        else if(idx==size-1)
            removeLast();
        else{
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
      }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
  }
}
