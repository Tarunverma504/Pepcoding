/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.LinkedList;

/**
 *
 * @author Mind_Coder
 */


import java.util.*;
public class Merge_K_Sorted_Linkedlist__GFG {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode mergetwo(ListNode l1,ListNode l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode temp=new ListNode(-1);
        ListNode prev=temp;
        ListNode c1=l1,c2=l2;
        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                prev.next=c1;
                c1=c1.next;
            }
            else{
                prev.next=c2;
                c2=c2.next;
            }
            prev=prev.next;
            
        }
        if(c1!=null){
            prev.next=c1;
        }
        if(c2!=null){
            prev.next=c2;
        }
        return temp.next;
    }
    
    public static ListNode mergeKLists__(ListNode[] lists,int start,int end) {
        if(start==end)
            return lists[start];
        int mid=(start+end)/2;
        ListNode l1=mergeKLists__(lists,start,mid);
        ListNode l2=mergeKLists__(lists,mid+1,end);
        return mergetwo(l1,l2);
    }
    
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
            
        return mergeKLists__(lists,0,lists.length-1);
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
        ListNode[] list = new ListNode[n];
        for (int i = 0; i < n; i++) {
            int m = scn.nextInt();
            list[i] = createList(m);
        }

        ListNode head = mergeKLists(list);
        printList(head);
    }
}
