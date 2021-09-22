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
public class Add_First_In_Linked_List {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Entries");
        int n=sc.nextInt();
        LinkedList l=new LinkedList();
        for(int i=0;i<n;i++){
            l.addFirst(sc.nextInt());
        }
        System.out.println("LinkeList is :-");
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
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
  }
}
