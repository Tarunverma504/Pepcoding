/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_List.practice;

/**
 *
 * @author Mind_Coder
 */
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
*/
import java.util.*;
public class Remove_Nth_Node_From_End_of_List__LC__19 {
    public static void main(String []arg){
        /*
        https://leetcode.com/problems/remove-nth-node-from-end-of-list/
        */
    }
    /**
 * Definition for singly-linked list.
 */
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    class Solution {
        
        public ListNode removeNthFromEnd(ListNode head, int n) {
               if(head == null)
                return null;
                ListNode tail = head;
                ListNode curr = head;
                while(n > 0) {
                    tail = tail.next;
                    n--;
                }
                if(tail == null) {
                    head = head.next;
                    return head;
                }
                while(tail.next != null){
                    tail = tail.next;
                    curr = curr.next;
                }

                curr.next = curr.next.next;
                return head;
            }
    }
}
