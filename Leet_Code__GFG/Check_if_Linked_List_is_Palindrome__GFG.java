/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */

import DSA_450.LinkedList.*;
import java.util.*;
public class Check_if_Linked_List_is_Palindrome__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
        */
    }
    static class Node
    {
            int data;
            Node next;

            Node(int d)
            {
                    data = d;
                    next = null;
            }
    }

    static class Solution
    {
        //Function to check whether the list is palindrome.
        static Node left;
        boolean isPalindrome(Node head) 
        {
            //Your code here
            left=head;
            return result(head);
        }
        boolean result(Node right){
            if(right==null){
                return true;
            }
            boolean res=result(right.next);
            if(res==false)
                return false;
            else if(right.data!=left.data){
                return false;
            }
            else{
                left=left.next;
                return true;
            }

        }
    }
}
