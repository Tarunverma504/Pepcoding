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

/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*/
public class Remove_Duplicates_from_Sorted_List_II__LC__82 {
    
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
        */
    }
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l1=new ListNode(-1,head);
        ListNode prev=l1;
        while(head!=null && head.next!=null){
            head=head.next;
            if(head.val!=prev.next.val){
                prev=prev.next;
            }
            else{
                while(head!=null && head.val==prev.next.val){
                    head=head.next;
                }
                prev.next=head;
            }
        }
        return l1.next;
    }
}
}
