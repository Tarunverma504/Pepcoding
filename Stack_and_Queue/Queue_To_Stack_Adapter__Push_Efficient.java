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
1. You are required to complete the code of our QueueToStackAdapter class. 
2. As data members you've two queues available - mainQ and helperQ. mainQ is to contain data and helperQ is to assist in operations. (This is cryptic - take hint from video)
3. Here is the list of functions that you are supposed to complete
     3.1. push -> Should accept new data in LIFO manner.
     3.2. pop -> Should remove and return data in LIFO manner. If not available, print 
      Stack underflow" and return -1.
     3.3. top -> Should return data in LIFO manner. If not available, print "Stack 
     underflow" and return -1.
     3.4. size -> Should return the number of elements available in the stack.
4. Input and Output is managed for you.

Note -> push and size should work in constant time. pop and top should work in linear time.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
Note -> push and size should work in constant time. pop and top should work in linear time.
Sample Input
push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
quit
Sample Output
11
7
11
4
6
4
2
5
2
8
4
8
5
3
5
20
2
20
10
1
10



*/

import java.util.*;
public class Queue_To_Stack_Adapter__Push_Efficient {
    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
          mainQ = new ArrayDeque<>();
          helperQ = new ArrayDeque<>();
        }

        int size() {
          // write your code here
          return mainQ.size();
        }

        void push(int val) {
          // write your code here
          mainQ.add(val);
        }

        int pop() {
          // write your code here
           while(mainQ.size()>1){
            helperQ.add(mainQ.remove()); 
          }
          int ans=mainQ.remove();
          while(helperQ.size()>0){
            mainQ.add(helperQ.remove()); 
          }
          return ans;
        }

        int top() {
          // write your code here
          while(mainQ.size()>1){
            helperQ.add(mainQ.remove()); 
          }
          int ans=mainQ.remove();
          helperQ.add(ans);
          while(helperQ.size()>0){
            mainQ.add(helperQ.remove()); 
          }
          return ans;
        }
      }
}
