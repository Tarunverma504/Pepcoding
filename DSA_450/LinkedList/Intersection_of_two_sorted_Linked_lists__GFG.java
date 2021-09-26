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
Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. The new list should be made with its own memory — the original lists should not be changed.
Note: The list elements are not necessarily distinct.

Example 1:

Input:
L1 = 1->2->3->4->6
L2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given first two
linked list, 2, 4 and 6 are the elements
in the intersection.
Example 2:

Input:
L1 = 10->20->40->50
L2 = 15->40
Output: 40
Your Task:
The task is to complete the function intersection() which should find the intersection of two linked list and add all the elements in intersection to the third linked list and return the head of the third linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
Note: n,m are the size of the linked lists.

Constraints:
1 <= size of linked lists <= 5000
1 <= Data in linked list nodes <= 1000
*/
import java.util.*;
public class Intersection_of_two_sorted_Linked_lists__GFG {
    public static void mian(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1#
        */
    }

    static class Sol
    {
        static class Node {
            int data;
             Node next;
             Node(int d)  { data = d;  next = null; }
        }
       public static Node findIntersection(Node head1, Node head2)
        {
            // code here.
            HashSet<Integer> h=new HashSet<Integer>();
            while(head2!=null){
                h.add(head2.data);
                head2=head2.next;
            }
            Node temp=new Node(-1);
            Node ans=temp;
            while(head1!=null){
                int num=head1.data;
                if(h.contains(num)){
                    Node dummy=new Node(num);
                    temp.next=dummy;
                    temp=temp.next;
                }
                head1=head1.next;
            }
            return ans.next;
        }
    }
}
