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
A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457 
Example 2:

Input:
LinkedList: 1->2->3
Output: 124 
Your Task:
Your task is to complete the function addOne() which takes the head of the linked list as the only argument and returns the head of the modified linked list. The driver code prints the number.
Note: The head represents the left-most digit of the number.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 101000

Company Tags
Topic Tags
Related Courses
We are replacing the old Disqus forum with the new Discussions section given below.
Click here to view old Disqus comments.

*/
import java.util.*;
public class Add_1_to_a_number_represented_as_linked_list {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#
        */
    }
    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    } 

    static class Solution
    {
        static int carry=0;
        public static Node addOne(Node head) 
        { 
            //code here.
            getAns(head);
            if(carry!=0){
                Node temp=new Node(carry);
                temp.next=head;
                head=temp;
            }
            carry=0;
            return head;
        }
        public static void getAns(Node right){
            if(right==null){
                return ;
            }
            if(right.next==null){
                right.data=right.data+1;
            }
            getAns(right.next);
            right.data=right.data+carry;
            carry=right.data/10;
            right.data=right.data%10;
        }
    }
}
