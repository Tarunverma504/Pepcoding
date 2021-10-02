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
1. Given a singly linklist, Segregate 012 Node of LinkedList and return pivot node of linkedlist.
2. After segregation zero nodes should come first and then ones node followed by two's nodes.
Input Format
1->0->1->0->0->1->2->1->1->1->2->1->1->null
Output Format
0->0->0->1->1->1->1->1->1->1->1->2->2->null
Question Video

  COMMENTConstraints
-10^6 <= size Of LinkedList <= 10^6
Sample Input
17
2 2 0 2 1 0 0 2 2 1 2 1 2 0 1 0 0 
Sample Output
0 0 0 0 0 0 1 1 1 1 2 2 2 2 2 2 2 


*/

import java.util.*;
public class Segregate_0_1_2_Node_Of_Linkedlist__GFG {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregate012(ListNode head) {
        ListNode zero=new ListNode(-1);
        ListNode one=new ListNode(-1);
        ListNode two=new ListNode(-1);
        ListNode pt0= zero;
        ListNode pt1= one;
        ListNode pt2= two;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==0){
                pt0.next=curr;
                pt0=pt0.next;
            }
            else if(curr.val==1){
                pt1.next=curr;
                pt1=pt1.next;
            }
            else{
                pt2.next=curr;
                pt2=pt2.next;
            }
            
            curr=curr.next;
        }
        pt1.next=two.next;  //Imp step
        pt0.next=one.next;
        
        pt2.next=null;
        
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
        h1 = segregate012(h1);
        printList(h1);
    }
}
