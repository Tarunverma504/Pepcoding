package Leet_Code__GFG;

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
Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:


Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:


Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 5 * 104].
-105 <= Node.val <= 105
*/
public class Sort_List__LC__148 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode sortList(ListNode head) {
            if(head==null || head.next==null)
                return head;
            ListNode mid=getMid(head);
            ListNode nextOfMid=mid.next;
            mid.next=null;
            ListNode firstHalf=sortList(head);
            ListNode secondHalf=sortList(nextOfMid);
            ListNode sorted=merging(firstHalf,secondHalf);
            return sorted;
        }
        public ListNode getMid(ListNode head){
            ListNode fast=head;
            ListNode slow=head;
            while(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
        public ListNode merging(ListNode a,ListNode b){
            ListNode temp=new ListNode(-1);
            ListNode ans=temp;
            while(a!=null && b!=null){
                if(a.val<b.val){
                    temp.next=a;
                    a=a.next;
                }
                else{
                    temp.next=b;
                    b=b.next;
                }
                temp=temp.next;
            }
            while(a!=null){
                temp.next=a;
                a=a.next;
                temp=temp.next;
            }
            while(b!=null){
                temp.next=b;
                b=b.next;
                temp=temp.next;
            }
            return ans.next;
        }
    }
}
