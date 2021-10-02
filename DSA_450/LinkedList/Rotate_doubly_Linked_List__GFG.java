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
Given a doubly linked list, rotate the linked list counter-clockwise by P nodes. Here P is a given positive integer and is smaller than the count of nodes(N) in a linked list.

Input:
The first line of input contains an integer T denoting the no of test cases. For each test case, the first line of input contains two integers N and P denoting the number of nodes in Linked List and the number of nodes to be rotated respectively.

Output:
For each test case, output the final linked list after the P rotations in it.

Constraints:
1 <= T <= 100
2 <= N <= 100
1 <= P <= N

Example:
Input:
1
6 2
1 2 3 4 5 6

Output:
3 4 5 6 1 2

Explanation:
Testcase 1: Doubly linked list after rotating 2 nodes is: 3 4 5 6 1 2.
*/

import java.util.*;
public class Rotate_doubly_Linked_List__GFG {
    class Node {
        int data;
        Node prev, next;

        public Node (int d){
            this.data = d;
            prev = null;
            next = null;
        }
    }
    class Gfg {
        Node rotateP (Node head, int p){
            //Write your code here
            Node curr=head;
            int count=1;
            while(count<p && curr!=null){
                curr=curr.next;
                count++;

            }
            Node nthnode=curr;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=head;
            head.prev=curr;
            head=nthnode.next;
            head.prev=null;
            nthnode.next=null;
            return head;
        }
    }
}
