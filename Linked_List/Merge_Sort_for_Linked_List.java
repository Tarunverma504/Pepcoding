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

import java.util.*;
public class Merge_Sort_for_Linked_List {
    //User function Template for Java
    /*
    */
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1
        */
    }
    static class Solution
    {
        //Function to sort the given linked list using Merge Sort.
        static class Node
        {
            int data;
            Node next;
            Node(int key)
            {
                this.data = key;
                next = null;
            }
        } 
        static Node mergeSort(Node head)
        {
            // add your code here
            if(head==null || head.next==null){
                return head;
            }
            Node mid=getMid(head);
            Node nextOfmid=mid.next;
            mid.next=null;
            Node firstHalf=mergeSort(head);
            Node secondHalf=mergeSort(nextOfmid);
            Node sortedList=merging(firstHalf,secondHalf);
            return sortedList;

        }
        static Node getMid(Node head){
            Node temp=head;
            Node f=head;
            Node s=head;
            while(f.next!=null && f.next.next!=null){
                s=s.next;
                f=f.next.next;
            }
            return s;
        }
        static Node merging(Node a,Node b){
                Node temp=new Node(-1);
                Node ans=temp;
                while(a!=null && b!=null){
                    if(a.data<b.data){
                        temp.next=a;
                        a=a.next;
                    }
                    else{
                        temp.next=b;
                        b=b.next;
                    }
                    temp=temp.next;
                }
                while(a!=null){
                    temp.next=a;
                    a=a.next;
                    temp=temp.next;
                }
                while(b!=null){
                    temp.next=b;
                    b=b.next;
                    temp=temp.next;
                }
                return ans.next;
        }
    }
}
