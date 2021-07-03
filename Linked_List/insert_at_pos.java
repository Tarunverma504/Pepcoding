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
public class insert_at_pos {
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
        
        public static void insertpos(int pos,int num){
            if(pos<1){
                System.out.println("Position can't be less than 1");
                return;
            }
            else if(head==null && pos>1){
                System.out.println("Position is greater than elments Exists");
                return;
            }
            else if(head==null && pos==1){
                insertbeg(num);
            }
            else if(pos==1){
                Node new_node=new Node(num);
                new_node.next=head;
                head=new_node;
            }
            else{
                Node t_node=head;
                int count=1;
                while(t_node.next!=null){
                    ++count;
                    if(count==pos){
                        Node new_node=new Node(num);
                        new_node.next=t_node.next;
                        t_node.next=new_node;
                    }
                    t_node=t_node.next;
                    
                }
                count++;
                if(count==pos){
                    Node new_node=new Node(num);
                    new_node.next=t_node.next;
                    t_node.next=new_node;
                }
            }
            
        }
        public static void printList(){
            Node t_node=head;
            while(t_node.next!=null){
                System.out.print(t_node.data+" ");
                t_node=t_node.next;
            }
            System.out.print(t_node.data+" ");
        }
    }
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        LinkedList.insertbeg(10);LinkedList.insertbeg(20);LinkedList.insertbeg(30);LinkedList.insertbeg(40);LinkedList.insertbeg(50);
        System.out.println("Enter position");
        int pos=sc.nextInt();
        System.out.println("Enter data");
        int num=sc.nextInt();
        LinkedList.insertpos(pos,num);
        LinkedList.printList();
    }
}
