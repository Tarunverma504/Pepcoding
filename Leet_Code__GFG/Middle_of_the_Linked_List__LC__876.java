package Leet_Code__GFG;

import DSA_450.LinkedList.*;

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
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
Accepted
399,479
Submissions
568,678
Seen this question in a real interview before?
*/
public class Middle_of_the_Linked_List__LC__876 {
    public static void main(String arg){
        /*
        https://leetcode.com/problems/middle-of-the-linked-list/
        */
    }
    static class Solution {
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { 
                this.val = val; this.next = next; 
            }
            
        }
    public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            
        }
        return s;
    }
}
}
