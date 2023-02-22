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
public class Palindrome_Linked_List_LC_234 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/palindrome-linked-list/
        */
    }
    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode mid = Middle(head);
            ListNode head2 = reverse(mid);
            System.out.println(head2.val);
            while(head2!=null){
                if(head.val!=head2.val){
                    return false;
                }
                head = head.next;
                head2 = head2.next;
            }

            return true;
        }
    
        public ListNode Middle(ListNode node){
            ListNode slow = node;
            ListNode fast = node;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    
        public ListNode reverse(ListNode head){
            if(head==null || head.next==null)
                return head;
            ListNode newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }
}
