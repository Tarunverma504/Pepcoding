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
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
*/
import Linked_List.*;
import java.util.*;
public class Remove_Linked_List_Elements__LC__203 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/remove-linked-list-elements/submissions/
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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        if(head==null)
            return null;
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }
}
}
