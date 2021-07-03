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
public class delete_last_node {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    static Node head;
    public static class LinkedList{
        public static void insertbeg(int d){
            Node new_node = new Node(d);
            new_node.next=head;
            head=new_node;
        }
        
        public static void deletelast(){
            if(head==null){
                System.out.println("List is Empty");
            }
            else{
                Node secondLast=head;
                while(secondLast.next.next!=null){
                    secondLast=secondLast.next;
                }
                Node last=secondLast.next;
                secondLast.next=null;
                last=null;
            }
        }
        public static void printList(){
            if(head==null){
                System.out.println("List is Empty");
            }
            Node t_node=head;
            while(t_node.next!=null){
                System.out.print(t_node.data+" ");
                t_node=t_node.next;
            }
            System.out.println(t_node.data+" ");
        }
    }
   public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Numbers to Be Enter");
        int t=sc.nextInt();
        System.out.println("Enter Numbers");
        while(t>0){
            int num=sc.nextInt();
            LinkedList.insertbeg(num);
            t--;
        }
        System.out.println("After deletion");
        LinkedList.deletelast();
        LinkedList.printList();
    }
}
