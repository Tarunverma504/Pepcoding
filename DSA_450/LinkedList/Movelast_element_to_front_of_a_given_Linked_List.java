/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.LinkedList;

/**
 *
 * @author Mind_Coder
 */
/*
Write a function that moves the last element to the front in a given Singly Linked List. For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.

Algorithm:
Traverse the list till last node. Use two pointers: one to store the address of last node and other for address of second last node. After the end of loop do following operations.
i) Make second last as last (secLast->next = NULL).
ii) Set next of last as head (last->next = *head_ref).
iii) Make last as head ( *head_ref = last)
*/
import java.util.*;
public class Movelast_element_to_front_of_a_given_Linked_List {
    public static void main(String arg[]){
        /*
        https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
        */
    }
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    Node head;
    void moveToFront()
    {
        /* If linked list is empty or it contains only
           one node then simply return. */
           if(head == null || head.next == null) 
              return;
  
        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;
  
        /* After this loop secLast contains address of 
           second last  node and last contains address of 
           last node in Linked List */
        while (last.next != null)  
        {
           secLast = last;
           last = last.next; 
        }
  
        /* Set the next of second last as null */
        secLast.next = null;
  
        /* Set the next of last as head */
        last.next = head;
  
        /* Change head to point to last node. */
        head = last;
    }
}
