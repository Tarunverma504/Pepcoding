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
Given a singly linked list, remove all the nodes which have a greater value on its following nodes.

Example 1:

Input:
LinkedList = 12->15->10->11->5->6->2->3
Output: 15 11 6 3
Explanation: Since, 12, 10, 5 and 2 are
the elements which have greater elements
on the following nodes. So, after deleting
them, the linked list would like be 15,
11, 6, 3.
Example 2:

Input:
LinkedList = 10->20->30->40->50->60
Output: 60
Your Task:
The task is to complete the function compute() which should modify the list as required and return the head of the modified linked list. The printing is done by the driver code,

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ size of linked list ≤ 1000
1 ≤ element of linked list ≤ 1000
Note: Try to solve the problem without using any extra space.
*/
public class Delete_nodes_having_greater_value_on_right__GFG {
    
    static class Solution
    {
        static class Node {
            int data;
            Node next;

           Node(int data) {
               this.data = data;
           }
         }
        Node ans=null;
        Node compute(Node head)
        {
            // your code here
            // Node ans=null;
            Node ans=getList(head);
            return ans;
        }
        int max=Integer.MIN_VALUE;
        Node getList(Node head){
            if(head==null){
                return head;
            }
            if(head.next==null){
                max=head.data;
                Node temp=new Node(head.data);
                return temp;
            }

            Node dummy=getList(head.next);
            if(max<=head.data){
                max=head.data;
                Node node=new Node(head.data);
                node.next=dummy;
                return node;
            }
            return dummy;   
        }
    }
}
