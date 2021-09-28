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
public class Count_tripletsI_in_a_sorted_doubly_linked_list_whose_sum_is_equal_to_a_given_value_x__GFG {
    static int countTriplets(Node head, int x){
        int count=0;
        Node curr=head;
        Node left,right;
        Node tail=head;
        while(tail.next!=null)
                tail=tail.next;
        while(curr!=null && curr.next!=null){
            left=curr.next;
            right=tail;
            while(left!=right && right.next!=left){
                if((curr.data+left.data+right.data)==x){
                    count++;
                    left=left.next;
                    right=right.prev;
                }
                else if((curr.data+left.data+right.data)<x){
                    left=left.next;
                }
                else{
                    right=right.prev;
                }
            }
            curr=curr.next;
        }
        
        return count;
    }
    public static void main(String args[])
    {
            // start with an empty doubly linked list
            Node head = null;
             
            // insert values in sorted order
            head = insert(head, 9);
            head = insert(head, 8);
            head = insert(head, 6);
            head = insert(head, 5);
            head = insert(head, 4);
            head = insert(head, 2);
            head = insert(head, 1);
 
            int x = 17;
            System.out.println("count = " + countTriplets(head, x));
    }
    static Node insert(Node head, int val)
    {
            // allocate node
            Node temp = new Node(val);
 
            if (head == null)
                head = temp;
 
            else
            {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
         
            return head;
    }
    static class Node
    {
        int data;
        Node prev, next;
        Node(int val)
        {
            data = val;
            prev = null;
            next = null;
        }
    }
}
