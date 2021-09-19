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
1. You are required to complete the code of our StackToQueueAdapter class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that are written in the class 
    2.1. add -> Accepts new data if there is space available in the underlying array or 
    print "Queue overflow" otherwise.
    2.2. remove -> Removes and returns value according to FIFO, if available or print 
    "Queue underflow" otherwise and return -1.
    2.3. peek -> Returns value according to FIFO, if available or print "Queue 
    underflow" otherwise and return -1.
    2.4. size -> Returns the number of elements available in the queue.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
Note -> add and size should work in constant time. remove and peek should work in linear time.
Sample Input
add 10
add 20
add 30
add 40
add 50
remove
remove
add 60
add 70
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit
Sample Output
10
20
30
30
40
40
50
50
60
60
70
70
Queue underflow
Queue underflow



*/
import java.util.*;
public class Stack_To_Queue_Adapter_Add_Efficient {
    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public StackToQueueAdapter() {
          mainS = new Stack<>();
          helperS = new Stack<>();
        }

        int size() {
          // write your code here
          return mainS.size();
        }

        void add(int val) {
          // write your code here
          mainS.push(val);
        }

        int remove() {
          // write your code here
           if(size()==0){
              System.out.println("Queue underflow");
              return -1;
          }
          while(mainS.size()>1){
            helperS.push(mainS.pop());
          }
          int ans=mainS.pop();
          while(helperS.size()>0){
              mainS.push(helperS.pop());
          }
          return ans;
        }

        int peek() {
          // write your code here
          if(size()==0){
              System.out.println("Queue underflow");
              return -1;
          }
          while(mainS.size()>1){
            helperS.push(mainS.pop());
          }
          int ans=mainS.pop();
          helperS.push(ans);
          while(helperS.size()>0){
              mainS.push(helperS.pop());
          }
          return ans;
        }
  }

}
