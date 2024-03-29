/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_and_Queue;

/**
 *
 * @author Mind_Coder
 */
/*

1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that you are supposed to complete
     2.1. add -> Should accept new data if there is space available in the underlying 
     array or print "Queue overflow" otherwise.
     2.2. remove -> Should remove and return value according to FIFO, if available or 
     print "Queue underflow" otherwise and return -1.
     2.3. peek -> Should return value according to FIFO, if available or print "Queue 
     underflow" otherwise and return -1.
     2.4. size -> Should return the number of elements available in the queue.
     2.5. display -> Should print the elements of queue in FIFO manner (space- 
     separated) ending with a line-break.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
None
Sample Input
5
add 10
display
add 20
display
add 30
display
add 40
display
add 50
display
add 60
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
quit
Sample Output
10 
10 20 
10 20 30 
10 20 30 40 
10 20 30 40 50 
Queue overflow
10 20 30 40 50 
10
10
20 30 40 50 
20
20
30 40 50 
30
30
40 50 
40
40
50 
50
50

Queue underflow
Queue underflow
*/
public class Normal_Queue {
    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
          data = new int[cap];
          front = 0;
          size = 0;
        }

        int size() {
          // write ur code here
          return size;
        }

        void display() {
          // write ur code here
          for(int i=0;i<size;i++){
              int idx=(front+i)%data.length;
              System.out.print(data[idx]+" ");
          }
          System.out.println();
        }

        void add(int val) {
          // write ur code here
          if(size==data.length){
              System.out.println("Queue overflow");
          }
          else{
              int rear=(front+size)%data.length;
              data[rear]=val;
              size++;
          }
        }

        int remove() {
          // write ur code here 
          if(size==0){
               System.out.println("Queue underflow");
               return -1;
           }
           else{
               int val=data[front];
               front=(front+1)%data.length;
               size--;
               return val;
           }
        }

        int peek() {
           // write ur code here
           if(size==0){
               System.out.println("Queue underflow");
               return -1;
           }
           else{
               return data[front];
           }
        }
      }
}
