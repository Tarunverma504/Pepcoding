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
Given two numbers represented by two linked lists of size N and M. The task is to return a sum list.

The sum list is a linked list representation of the addition of two input numbers from the last.

Example 1:

Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).
Example 2:

Input:
N = 2
valueN[] = {6,3}
M = 1
valueM[] = {7}
Output: 7 0
Explanation: For the given two linked
list (6 3) and (7), after adding the
two linked list resultant linked list
will be (7 0).
Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the sum list.   

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(Max(N,M)) for the resultant list.

Constraints:
1 <= N, M <= 5000
*/
import java.util.*;
public class Add_two_numbers_represented_by_linked_lists__GFG {
    
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
        */
    }
    static class Solution{
        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        second=reverse(second);
        int carry=0;
        Node temp=new Node(-1);
        Node ans=temp;
        while(first!=null || second!=null){
            int sum=carry+(first!=null?first.data:0)+(second!=null?second.data:0);
            carry=(sum>=10?1:0);
            sum=sum%10;
            Node dummy=new Node(sum);
            temp.next=dummy;
            temp=temp.next;
            if(first!=null)
                first=first.next;
            if(second!=null)
                second=second.next;
            
        }
        if(carry!=0){
            Node dummy=new Node(carry);
            temp.next=dummy;
        }
        return reverse(ans.next);
    }
    
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
}
