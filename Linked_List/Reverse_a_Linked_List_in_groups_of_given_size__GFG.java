package Linked_List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */

/*
Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should be considered as a group and must be reversed (See Example 2 for clarification).

Example 1:

Input:
LinkedList: 1->2->2->4->5->6->7->8
K = 4
Output: 4 2 2 1 8 7 6 5 
Explanation: 
The first 4 elements 1,2,2,4 are reversed first 
and then the next 4 elements 5,6,7,8. Hence, the 
resultant linked list is 4->2->2->1->8->7->6->5.
Example 2:

Input:
LinkedList: 1->2->3->4->5
K = 3
Output: 3 2 1 5 4 
Explanation: 
The first 3 elements are 1,2,3 are reversed 
first and then elements 4,5 are reversed.Hence, 
the resultant linked list is 3->2->1->5->4.
Your Task:
You don't need to read input or print anything. Your task is to complete the function reverse() which should reverse the linked list in group of size k and return the head of the modified linked list.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N <= 104
1 <= k <= N
*/
import DSA_450.LinkedList.*;
import java.util.*;
public class Reverse_a_Linked_List_in_groups_of_given_size__GFG {
    static class Solution
    {
        static class Node
        {
            int data;
            Node next;
            Node(int key)
            {
                data = key;
                next = null;
            }
        }
        public static Node reverse(Node node, int k)
        {
            //Your code here

            Node prev=null;
            Node next=null;
            Node curr=node;
            int count=0;

            //reverse the first k node of the linked list
            while(curr!=null && count<k){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;

            }
            if(next!=null){
                node.next=reverse(next,k);
            }
             // prev is now head of input list
            return prev;
        }
    }
}
