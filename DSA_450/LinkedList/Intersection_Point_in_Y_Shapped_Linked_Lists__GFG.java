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
Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

 

Example 1:

Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:
Y ShapedLinked List
Example 2:

Input: 
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation: 

4              5
|              |
1              6
 \             /
  8   -----  1 
   |
   4
   |
  5
  |
  NULL       
Your Task:
You don't need to read input or print anything. The task is to complete the function intersetPoint() which takes the pointer to the head of linklist1(head1) and linklist2(head2) as input parameters and returns data value of a node where two linked lists intersect. If linked list do not merge at any point, then it should return -1.
Challenge : Try to solve the problem without using any extra space.

 

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)

 

Constraints:
1 ≤ N + M ≤ 2*105
-1000 ≤ value ≤ 1000
*/
public class Intersection_Point_in_Y_Shapped_Linked_Lists__GFG {
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
     }
    static class LinkedList
    {
        Node head;  // head of list
    }

    static class Intersect
    {
        //Function to find intersection point in Y shaped Linked Lists.
            int intersectPoint(Node head1, Node head2)
            {
             // code here
             Node first;
             Node second;
             int len1=0;
             int len2=0;
             Node temp=head1;
             while(temp!=null){
                 len1++;
                 temp=temp.next;
             }
             Node temp2=head2;
             while(temp2!=null){
                 len2++;
                 temp2=temp2.next;
             }
             int k=0;
             if(len1>=len2){
                 first=head1;
                 k=len1-len2;
                 second=head2;
             }

            else{
                first=head2;
                k=len2-len1;
                second=head1;
            }
            while(k>0){
                first=first.next;
                k--;
            }
            while(first!=null && second!=null){
                if(first==second){
                    return first.data;
                }
                first=first.next;
                second=second.next;
            }
            return -1;


            }
    }
}
