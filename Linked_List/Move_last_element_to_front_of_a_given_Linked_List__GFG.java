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
public class Move_last_element_to_front_of_a_given_Linked_List__GFG {
    public static void main(String arg[]){
        LinkedList l=new LinkedList();
        l.insertAtHead(1);
        l.insertAtHead(2);
        l.insertAtHead(3);
        l.insertAtHead(4);
        l.insertAtHead(5);
        l.display();
        l.addBegining();
        l.display();
    }
    static class Node{
        int data;
        Node next;
    }
    static class LinkedList{
        Node head;
        public void insertAtHead(int val) {
        // write your code here
        Node temp=new Node();
        temp.data=val;
        temp.next=head;
        head=temp;
      }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void addBegining(){
            if(head==null || head.next==null)
                return;
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
        }
    }
}
