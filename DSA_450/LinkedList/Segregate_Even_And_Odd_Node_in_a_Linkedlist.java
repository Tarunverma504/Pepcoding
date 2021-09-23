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

/*
Given a singly linklist, modify the list such that all the even numbers appear before all the odd numbers in the modified list. The order of appearance of numbers within each segregation should be same as that in the original list.
Input Format
1->7->2->6->3->5->4->null
Output Format
2->6->4->1->7->3->5->null
Question Video

  COMMENTConstraints
0 <= N <= 10^6
Sample Input
4
0
6
7
5
Sample Output
0 6 7 5 



*/
public class Segregate_Even_And_Odd_Node_in_a_Linkedlist {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateEvenOdd(ListNode head) {
        ListNode evenStart=null;
        ListNode oddStart=null;
        ListNode evenEnd=null;
        ListNode oddEnd=null;
        ListNode curr=head;
        while(curr!=null){
            int num=curr.val;
            if(num%2==0){
                if(evenStart==null){
                    evenStart=curr;
                    evenEnd=evenStart;
                }
                else{
                    evenEnd.next=curr;
                    evenEnd=evenEnd.next;
                }
            }
            else{
                if(oddStart==null){
                    oddStart=curr;
                    oddEnd=oddStart;
                }
                else{
                    oddEnd.next=curr;
                    oddEnd=oddEnd.next;
                }
            }
            curr=curr.next;
        }
        if(oddStart==null||evenStart==null){
            return head;
        }
        evenEnd.next=oddStart;
        oddEnd.next=null;
        return evenStart;
    }
}
