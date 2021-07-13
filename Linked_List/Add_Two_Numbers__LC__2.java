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
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

*/
import java.util.*;
public class Add_Two_Numbers__LC__2 {
    /*
 * Definition for singly-linked list.
 * 
 */
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/add-two-numbers/
        */
    }
    class Solution {
        public ListNode insert(ListNode head,int n){
            ListNode temp=head;
            ListNode new_node=new ListNode(n);
            if(temp==null){
                head=new_node;
                return head;
            }

            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
            return head;
        }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=null;
        int carry=0;
        while(l1!=null || l2!=null){
            int n1=l1!=null?l1.val:0;
            int n2=l2!=null?l2.val:0;
            int sum=n1+n2+carry;
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            else
                carry=0;
            l3=insert(l3,sum);
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            
        }
        if(carry==1)
            l3=insert(l3,1);
        return l3;
    }
}
}
