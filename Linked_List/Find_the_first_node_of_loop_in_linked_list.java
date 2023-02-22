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
Given a singly linked list of N nodes. Find the first node of the loop if the linked list has a loop. If a loop is present return the node data of the first node of the loop else return -1.

Example 1:

Input:

Output: 3
Explanation:
We can see that there exists a loop 
in the given linked list and the first
node of the loop is 3.
 

Example 2:

Input:

Output: -1
Explanation: No loop exists in the above
linked list.So the output is -1.
*/
public class Find_the_first_node_of_loop_in_linked_list {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/44bb5287b98797782162ffe3d2201621f6343a4b/1
        */
    }
        static class Solution {
            class Node
            {
                int data;
                Node next;

                Node(int x)
                {
                    data = x;
                    next = null;
                }
            }

        //Function to find first node if the linked list has a loop.
        public static int findFirstNode(Node head){
            //code here

            Node slow = head;
            Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    slow = head;
                    while(slow!=fast){
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow.data;
                }
            }

            return -1;

        }
    }
}
