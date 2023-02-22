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
public class Sort_a_k_sorted_doubly_linked_list {
    
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/sort-k-sorted-doubly-linked-list/
        */
    }
    static class Node 
    {
      int data;
      Node next, prev;
      Node(int d)
      {
        data = d;
        next = prev = null;
      }
    }
    class compareNode implements Comparator<Node>
    {
      public int compare(Node n1, Node n2){
        return n1.data-n2.data;
      }
    }
  
    // function to sort a k sorted doubly linked list 
    Node sortAKSortedDLL( Node head, int k) 
    { 

      // if list is empty 
      if (head == null) 
        return head; 

      // priority_queue 'pq' implemented as min heap with the 
      // help of 'compare' function in compare Node class
      PriorityQueue<Node> pq = new PriorityQueue<Node>(new compareNode()); 

      Node newHead = null, last = null; 

      // Create a Min Heap of first (k+1) elements from 
      // input doubly linked list 
      for (int i = 0; head != null && i <= k; i++) 
      {

        // push the node on to 'pq' 
        pq.add(head); 

        // move to the next node 
        head = head.next; 
      } 

      // loop till there are elements in 'pq' 
      while (!pq.isEmpty())
      { 

        // place root or top of 'pq' at the end of the 
        // result sorted list so far having the first node 
        // pointed to by 'newHead' 
        // and adjust the required links 
        if (newHead == null) 
        { 
          newHead = pq.peek(); 
          newHead.prev = null; 

          // 'last' points to the last node 
          // of the result sorted list so far 
          last = newHead; 
        } 

        else
        { 
          last.next = pq.peek(); 
          pq.peek().prev = last; 
          last = pq.peek(); 
        } 

        // remove element from 'pq' 
        pq.poll(); 

        // if there are more nodes left in the input list 
        if (head != null) 
        {

          // push the node on to 'pq' 
          pq.add(head); 

          // move to the next node 
          head = head.next; 
        } 
      } 

      // making 'next' of last node point to NULL 
      last.next = null; 

      // new head of the required sorted DLL 
      return newHead; 
    } 
}
