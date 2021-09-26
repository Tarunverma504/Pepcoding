package DSA_450.LinkedList;

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
Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:

Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.
Example 2:

Input:
N = 4
value[] = {2,2,0,1}
Output: 0 1 2 2
Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.
Your Task:
The task is to complete the function segregate() which segregates the nodes in the linked list as asked in the problem statement and returns the head of the modified linked list. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 103
*/

import java.util.*;
public class Given_a_linked_list_of_0s_1s_and_2s_sort_it__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1#
        */
    }
    static class Solution
    {
        static class Node
        {
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                next = null;
            }
        }
        //Function to sort a linked list of 0s, 1s and 2s.
        static Node segregate(Node head)
        {
            // add your code here
            int n0=0;
            int n1=0;
            int n2=0;
            Node res=head;
            Node temp=head;
            while(temp!=null){
                if(temp.data==0)
                    n0++;
                else if(temp.data==1)
                    n1++;
                else
                    n2++;
                temp=temp.next;
            }
            temp=head;
            while(temp!=null && n0>0){
                temp.data=0;
                temp=temp.next;
                n0--;
            }
            while(temp!=null && n1>0){
                temp.data=1;
                temp=temp.next;
                n1--;
            }
            while(temp!=null && n2>0){
                temp.data=2;
                temp=temp.next;
                n2--;
            }
            return head;

        }
    }
}
