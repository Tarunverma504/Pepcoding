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
Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value x, without using any extra space? 

Example:  

Input : head : 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
        x = 7
Output: (6, 1), (5,2)
The expected time complexity is O(n) and auxiliary space is O(1).
*/
public class Find_pairs_with_given_sum_in_doubly_linked_list__GFG {
    static void pairSum(Node head, int x){
        Node first=head;
        Node second=head;
        while(second.next!=null){
            second=second.next;
        }
        boolean flag=false;
        while(first!=second && second.next!=first){
            if((first.data+second.data)==x){
                System.out.println(first.data+" "+second.data);
                flag=true;
                first=first.next;
                second=second.prev;
            }
            else if((first.data+second.data)<x){
                first=first.next;
            }
            else{
                second=second.prev;
            }
        }
        if(flag==false)
            System.out.println("Not Found");
    }
    public static void main(String args[])
    {
        Node head = null;
        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);
        int x = 7;

        pairSum(head, x);
    }
    static class Node
    {
        int data;
        Node next, prev;
    };
    static Node insert(Node head, int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = temp.prev = null;
        if (head == null)
            (head) = temp;
        else
        {
            temp.next = head;
            (head).prev = temp;
            (head) = temp;
        }
        return temp;
    }
}
