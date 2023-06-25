/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;

/**
 *
 * @author Mind_Coder
 */
/*

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []
 

Constraints:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.
*/
import java.util.*;
public class Merge_k_Sorted_Lists_LC_23 {
    public static void main(String arg[]){
            /*
            https://leetcode.com/problems/merge-k-sorted-lists/description/?envType=list&envId=e9spcwu1
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
        
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
                public int compare(ListNode l1, ListNode l2){
                    return l1.val-l2.val;
                }
            });

            for(ListNode ListHead : lists){
                if(ListHead!=null)
                pq.add(ListHead);
            }
            return BuildList(pq);
        }

        public ListNode BuildList(PriorityQueue<ListNode> pq){
            ListNode head = new ListNode(-1);
            ListNode node = head;
            while(!pq.isEmpty()){
                ListNode curr = pq.poll();
                node.next = curr;
                if(curr.next!=null){
                    pq.add(curr.next);
                }
                node=node.next;
            }
            return head.next;
        }
    }
}
