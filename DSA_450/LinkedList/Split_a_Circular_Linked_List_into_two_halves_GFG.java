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
public class Split_a_Circular_Linked_List_into_two_halves_GFG {
    public static void main(String arg[]){
        /*
                https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1
        */
    }
    
    class gfg
    {
            // Function  to split a circular LinkedList
                void splitList(circular_LinkedList list)
            {
                 //DO NOT REMOVE THESE 3 LINES
                 Node head=list.head;
                 Node head1=null;
                 Node head2=null;

                 //Modify these head1 and head2 here, head is the starting point of our original linked list.    
                 Node slow = head;
                 Node fast = head.next;
                 while(fast!=head && fast.next!=head){
                     slow = slow.next;
                     fast = fast.next.next;
                 }

                 head1 = head;
                 head2 = slow.next;
                 slow.next = head1;
                 Node curr = head2;

                 while(curr.next!=head){
                     curr = curr.next;
                 }

                 curr.next = head2;


                 //DO NOT REMOVE THESE 2 LINES
                 list.head1=head1;
                 list.head2=head2;
             }
    }
}
