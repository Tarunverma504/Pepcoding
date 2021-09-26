package DSA_450.LinkedList;

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
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

Accepted
1,638,095
Submissions
2,415,619
Seen this question in a real interview before?
*/
import java.util.*;
public class Reverse_Linked_List__LC__206 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/reverse-linked-list/
        */
    }
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    static class Solution {
        static ListNode ans=new ListNode();
        public ListNode reverseList(ListNode head) {

            reverse(head);
            ListNode res=ans;
            ans=null;
            return res;
        }
        public static void reverse(ListNode temp){
            if(temp==null){
                return ;
            }
            if(temp.next==null){
                ans=temp;
                return ;
            }
            reverse(temp.next);
            temp.next.next=temp;
            temp.next=null;
        }
    }
}
