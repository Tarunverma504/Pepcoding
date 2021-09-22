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
public class Linked_List_To_Queue_Adapter {
    public static class LLToQueueAdapter {
    LinkedList<Integer> list;

    public LLToQueueAdapter() {
      list = new LinkedList<>();
    }

    int size() {
      // write your code here
      return list.size();
    }

    void add(int val) {
      // write your code here
      list.addLast(val);
    }

    int remove() {
      // write your code here
      if(size()==0){
          System.out.println("Queue underflow");
          return -1;
      }
      else{
          return list.removeFirst();
      }
    }

    int peek() {
      // write your code here
      if(size()==0){
          System.out.println("Queue underflow");
          return -1;
      }
      else{
          return list.getFirst();
      }
    }
  }
}
