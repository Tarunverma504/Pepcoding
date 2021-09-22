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
1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
     2.1 addLast - adds a new element with given value to the end of Linked List
    2.2. display - Prints the elements of linked list from front to end in a single line. 
    All elements are separated by space
    2.3. size - Returns the number of elements in the linked list.
    2.4. removeFirst - Removes the first element from Linked List. 
    2.5. getFirst - Returns the data of first element.
    2.6. getLast - Returns the data of last element. 
    2.7. getAt - Returns the data of element available at the index passed. 
    2.8. addFirst - adds a new element with given value in front of linked list.
    2.9. addAt - adds a new element at a given index.
3. You are required to complete the body of removeLast function. This function should remove the last element and update appropriate data members. If the size is 0, should print "List is empty". If the size is 1, should set both head and tail to null.
4. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
None
Sample Input
addFirst 10
getFirst
addAt 0 20
getFirst
getLast
display
size
addAt 2 40
getLast
addAt 1 50
addFirst 30
removeFirst
getFirst
removeLast
removeLast
addAt 2 60
display
size
removeFirst
removeLast
getFirst
quit
Sample Output
10
20
10
20 10 
2
40
20
20 50 60 
3
50



*/
import java.util.*;
public class Remove_Last_In_Linked_List {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Entries");
        int n=sc.nextInt();
        LinkedList l=new LinkedList();
        for(int i=0;i<n;i++){
            l.addLast(sc.nextInt());
        }
        System.out.println("LinkeList Before Deletion :-");
        l.display();
        System.out.println("LinkeList After Deletion :-");
        l.removeLast();
        l.display();
    }
    public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here
      if(size==0){
          Node temp=new Node();
          temp.data=val;
          temp.next=null;
          head=tail=temp;
      }
      else{
          Node temp=new Node();
          temp.data=val;
          temp.next=null;
          tail.next=temp;
          tail=temp;
      }
      size++;
    }
    public void removeLast(){
      // write your code here
      if(size==0)
        System.out.println("List is empty");
        else if(size==1){
            head=tail=null;
            size=0;
        }
        else{
            Node temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            tail=temp;
            temp.next=null;
            size--;
        }
           
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
  }
}
