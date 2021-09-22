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

import DSA_450.LinkedList.*;
import java.util.*;
public class Remove_duplicates_from_an_unsorted_linked_list {
    public static void main(String arg[]){
     /*
        https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
        */   
    }

    static class Solution
    {
        //Function to remove duplicates from unsorted linked list.
        static class Node
        {
            int data;
            Node next;
            Node(int d) {
                data = d; 
                next = null;
            }
        }
        public Node removeDuplicates(Node head) 
        {
             // Your code here
             HashSet<Integer> h=new HashSet<Integer>();
             Node temp=new Node(-1);
            Node ans=temp;
            while(head!=null){
                if(h.add(head.data)){
                    Node dummy=new Node(head.data);
                    temp.next=dummy;
                    temp=temp.next;
                }
                head=head.next;
            }
            return ans.next;
        }
    }
}
