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
1. Given a singly linklist, Segregate 01 Node of LinkedList and return pivot node of linkedlist.
2. After segregation zero nodes should come first and followed by ones node.

Input Format
1->0->1->0->0->1->1->1->1->1->1->null
Output Format
0->0->0->1->1->1->1->1->1->1->1->null
Question Video

  COMMENTConstraints
-10^6 <= size Of LinkedList <= 10^6
Sample Input
196
0 1 0 0 0 1 1 0 0 1 1 1 0 0 1 1 0 1 0 1 0 1 0 0 0 1 1 0 1 1 0 0 1 1 1 0 0 0 0 1 0 1 1 1 0 1 1 1 1 0 1 1 0 0 1 1 1 1 0 1 0 1 1 0 0 1 0 1 0 0 0 0 1 0 1 0 0 0 1 1 0 0 1 1 1 0 1 1 1 1 0 1 1 1 0 0 1 0 0 1 0 0 0 1 0 1 1 0 0 0 1 1 0 1 1 0 0 0 1 1 1 1 1 1 1 0 0 1 1 0 1 0 0 0 1 1 1 0 0 1 1 0 0 0 1 1 1 1 1 0 1 0 0 0 0 1 1 1 1 0 0 0 0 1 0 0 1 0 1 1 0 1 0 1 1 1 1 1 0 0 0 1 1 0 0 0 0 0 0 1 1 0 0 1 0 1 
Sample Output
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 


*/

import java.util.*;
public class Segregate_0_1_Node_Of_Linkedlist_Over_GFG {
    public static Scanner scn = new Scanner(System.in);
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregate01(ListNode head) {
        
        if(head == null || head.next==null) return head;
        ListNode  zero= new ListNode(-1);
        ListNode one =new ListNode(-1);
        ListNode pt0=zero;
        ListNode pt1=one;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==0){
                pt0.next=curr;
                pt0=pt0.next;
            }
            else{
                pt1.next=curr;
                pt1=pt1.next;
            }
            curr=curr.next;
        }
        
        pt0.next=one.next;
        pt1.next=null;
        
        
        return zero.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);
        h1 = segregate01(h1);
        printList(h1);
    }
}
