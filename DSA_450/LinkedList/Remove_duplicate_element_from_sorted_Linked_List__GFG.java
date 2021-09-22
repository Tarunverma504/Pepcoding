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
public class Remove_duplicate_element_from_sorted_Linked_List__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
        */
    }
    static class GfG
    {
        //Function to remove duplicates from sorted linked list.
        static class Node
        {
            int data;
            Node next;
            Node(int d) 
            {data = d; next = null; }
        }
        Node removeDuplicates(Node head)
        {
            // Your code her
                Node temp=new Node(-1);
                Node ans=temp;
                while(head!=null){
                    if(temp.data!=head.data){
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
