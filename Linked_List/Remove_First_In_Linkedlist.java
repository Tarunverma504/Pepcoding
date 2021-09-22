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
public class Remove_First_In_Linkedlist {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Entries");
        int n=sc.nextInt();
        LinkedList l=new LinkedList();
        for(int i=0;i<n;i++){
            l.addLast(sc.nextInt());
        }
        System.out.println("Before Deletion :-");
        l.display();
        System.out.println("After Deletin:-");
        l.removeFirst();
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
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
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
  }
}
