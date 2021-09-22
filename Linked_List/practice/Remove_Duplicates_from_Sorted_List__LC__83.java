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
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*/
public class Remove_Duplicates_from_Sorted_List__LC__83 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l1=head;
        ListNode head2=null;
        ListNode l2=null;
        while(l1!=null){
            if(head2==null){
                ListNode temp=new ListNode(l1.val);
                head2=temp;
                l2=head2;
            }
            else if(l2.val!=l1.val){
                ListNode temp=new ListNode(l1.val);
                l2.next=temp;
                l2=l2.next;
            }
                
            
            l1=l1.next;
        }
        return head2;
    }
}
}
