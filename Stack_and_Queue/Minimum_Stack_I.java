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
1. You are required to complete the code of our MinStack class. 
2. As data members you've two stacks available in the class - one for data values and another for minimum values. (This is cryptic - take hint from video)
2. Here is the list of functions that you are supposed to complete
2.1. push -> Should accept new data in LIFO manner
2.2. pop -> Should remove and return data in LIFO manner. If not available, print "Stack underflow" and return -1.
2.3. top -> Should return data in LIFO manner. If not available, print "Stack underflow" and return -1.
2.4. size -> Should return the number of elements available in the stack
2.5. min -> Should return the smallest element available in the stack. If not available, print "Stack underflow" and return -1.
3. Input and Output is managed for you.

Note -> The judge maynot be able to check if all your functions are O(1) in time, but that is what the expectation is. 

Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
None
Sample Input
push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
quit
Sample Output
11
2
11
4
2
4
2
2
2
8
5
8
5
5
5
20
10
20
10
10
10



*/
import java.util.*;
public class Minimum_Stack_I {
    public static class MinStack {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public MinStack() {
          allData = new Stack<>();
          minData = new Stack<>();
        }


        int size() {
          // write your code here  
          return allData.size();

        }

        void push(int val) {
          // write your code here
          allData.push(val);
          if(minData.size()==0 || val<=minData.peek()){
              minData.push(val);
          }
        }

        int pop() {
          // write your code here
          if(size()==0){
                  System.out.println("Stack underflow");
                  return -1;
              }
              else{
                  int val=allData.pop();
                  if(val==minData.peek()){
                      minData.pop();
                  }
                  return val;
              }
        }

        int top() {
          // write your code here
          if(size()==0){
                  System.out.println("Stack underflow");
                  return -1;
              }
              else{
                  return allData.peek();
              }

        }

        int min(){
              // write your code here
              if(size()==0){
                  System.out.println("Stack underflow");
                  return -1;
              }
              else{
                  return minData.peek();
              }
        }
      }
}
