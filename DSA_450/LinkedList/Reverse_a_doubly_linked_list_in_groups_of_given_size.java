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

import java.util.*;
public class Reverse_a_doubly_linked_list_in_groups_of_given_size {
    static class Node
    {
        int data;
        Node next, prev;
    }
    
    public static void main(String arg[]){
        // Start with the empty list
        Node head = null;
             
        // Create doubly linked: 10<->8<->4<->2
        head = push(head, getNode(2));
        head = push(head, getNode(4));
        head = push(head, getNode(8));
        head = push(head, getNode(10));
 
        int k = 2;
        System.out.print("Original list: ");
        printList(head);
        
        // Reverse doubly linked list in groups of
        // size 'k'
        head = revListInGroupOfGivenSize(head, k);
        
        System.out.print("\nModified list: ");
        printList(head);
    }
    
    public static Node revListInGroupOfGivenSize(Node head, int k){
        Node curr = head, newHead=null, next=null;
        int count=0;
        
        // return the new list by adding second element to first and ...
        while(curr!=null && count<k){
            next = curr.next;
            newHead = push(newHead, curr);
            curr = next;
            count++;
        }
        
        // if next group exists then making the desired
        // adjustments in the link
        if(next!=null){
            head.next = revListInGroupOfGivenSize(next, k);
            head.next.prev = head;
        }
        
        return newHead;
    }
    
    
    // function to get a new node
    static Node getNode(int data)
    {
        // allocating node
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = new_node.prev = null;
 
        return new_node;
    }
 
    // function to insert a node at the beginning
    // of the Doubly Linked List
    static Node push(Node head, Node new_node)
    {
        // since we are adding at the beginning,
        // prev is always NULL
        new_node.prev = null;
 
        // link the old list of the new node
        new_node.next = head;
 
        // change prev of head node to new node
        if (head != null)
            head.prev = new_node;
 
        // move the head to point to the new node
        head = new_node;
        return head;
    }
    
    // Function to print nodes in a
    // given doubly linked list
    static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
