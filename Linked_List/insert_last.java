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
public class insert_last {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    
    static Node head;
    public static class LinkedList{
        public static void insertlast(int d){
            if(head==null){
                Node t_node=new Node(d);
                t_node.next=head;
                head=t_node;
            }
            else{
                Node t_node=head;
                while(t_node.next!=null){
                    t_node=t_node.next;
                }
                Node new_node=new Node(d);
                t_node.next=new_node;
                new_node.next=null;
            }
        }
        public static void printList(){
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
            LinkedList.insertlast(num);
            t--;
        }
        System.out.println("----------------------------------");
        LinkedList.printList();
    }
}
