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
Given a linked list of N nodes such that it may contain a loop.

A loop here means that the last node of the link list is connected to the node at position X(1-based index). If the link list does not have any loop, X=0.

Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.


Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    
A loop is present. If you remove it 
successfully, the answer will be 1. 

*/
public class Detect_And_Remove_Loop {
    
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
        */
    }
    static class Solution
    {
        class Node
        {
            int data;
            Node next;
        }
        //Function to remove a loop in the linked list.
        public static void removeLoop(Node head){
            // code here
            // remove the loop without losing any nodes

            // Detect Loop 
            Node slow = head;
            Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast)
                    break;
            }

            if(slow==fast){
                slow = head;
                if(slow!= fast){
                    while(slow.next!=fast.next){
                        slow = slow.next;
                        fast = fast.next;
                    }
                    fast.next = null;
                }

                // if cycle is present at first node
                else{
                    while(fast.next!=slow){
                    fast = fast.next;
                    }
                    fast.next = null;
                }

            }
        }
    }
}
