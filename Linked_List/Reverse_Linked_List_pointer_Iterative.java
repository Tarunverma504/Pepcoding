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
public class Reverse_Linked_List_pointer_Iterative {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Entries");
        int n=sc.nextInt();
        LinkedList l=new LinkedList();
        for(int i=0;i<n;i++){
            l.addLast(sc.nextInt());
        }
        System.out.println("LinkeList Before Reverse :-");
        l.display();
        
        System.out.println("LinkedList After reverse :- ");
        l.reversePI();
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
          Node temp = new Node();
          temp.data = val;
          temp.next = null;

          if (size == 0) {
            head = tail = temp;
          } else {
            tail.next = temp;
            tail = temp;
          }

          size++;
        }

        public int size(){
          return size;
        }

        public void display(){
          for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
          }
          System.out.println();
        }

        public void removeFirst(){
          if(size == 0){
            System.out.println("List is empty");
          } else if(size == 1){
            head = tail = null;
            size = 0;
          } else {
            head = head.next;
            size--;
          }
        }

        public int getFirst(){
          // write your code here
          if(size==0){
              System.out.println("List is empty");
              return -1;
          }
          else
          return head.data;
        }

        public int getLast(){
          // write your code here
          if(size==0){
              System.out.println("List is empty");
              return -1;
          }
          else
            return tail.data;
        }

        public int getAt(int idx){
          // write your code here
          if(size==0){
              System.out.println("List is empty");
              return -1;
          }
          else if(idx<0 || idx>=size){
              System.out.println("Invalid arguments");
              return -1;
          }
          else{
              Node temp=head;
              for(int i=0;i<idx;i++){
                  temp=temp.next;
              }
              return temp.data;
          }

        }
        public void reversePI(){
            // write your code here

            Node prev=null;   //store address of the previous node
            Node curr=head;   //store the address of the current node

            while(curr!=null){
                Node next=curr.next;  //store the address of the next node
                curr.next=prev;   // assign the address of the prev node in curr node
                prev=curr;    //now prev point to curr node
                curr=next;    // curr node point to next node;
            }
            Node temp=head;
            head=tail;
            tail=temp;
      }
    }
}
