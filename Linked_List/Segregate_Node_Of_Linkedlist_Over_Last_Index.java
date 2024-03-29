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

/*
1. Given a singly linklist, Segregate Node of LinkedList over lastindex and return pivot node of linkedlist.
2. pivot is always be last index of linkedlist.
3. After segregation pivot Element should have to be present at correct position as in sorted linkedlist.
Input Format
1->5->2->9->5->14->11->1->10->10->1->3->null
Output Format
3->5->9->5->14->11->10->10->null 
Question Video

  COMMENTConstraints
-10^6 <= size Of LinkedList <= 10^6
Sample Input
12
1 5 2 9 5 14 11 1 10 10 1 3 
Sample Output
3 5 9 5 14 11 10 10 


*/
import java.util.*;
public class Segregate_Node_Of_Linkedlist_Over_Last_Index {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateOnLastIndex(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode smaller = new ListNode(-1);
        ListNode ps=smaller;
        ListNode larger=new ListNode(-1);
        ListNode pl=larger;
        ListNode tail=head;
        
        while(tail.next!=null){
            tail=tail.next;
        }
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<=tail.val){
                ps.next=curr;
                ps=ps.next;
            }
            else{
                pl.next=curr;
                pl=pl.next;
            }
            curr=curr.next;
        }
        ps.next=larger.next;
        pl.next=null;
        return ps;
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
        h1 = segregateOnLastIndex(h1);
        printList(h1);
    }
}
