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
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the prices of a share on n days.
3. You are required to find the stock span for n days.
4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.

e.g.
for the array [2 5 9 3 1 12 6 8 7]
span for 2 is 1
span for 5 is 2
span for 9 is 3
span for 3 is 1
span for 1 is 1
span for 12 is 6
span for 6 is 1
span for 8 is 2
span for 7 is 1
Input Format
Input is managed for you
Output Format
Output is managed for you
*/
import java.util.*;
public class Stock_Span {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = sc.nextInt();
        }

        int[] span = solve(a);
        display(span);
     }

     public static int[] solve(int[] price){
            Stack<Integer> st = new Stack<>();
            st.push(0);

            // Span value of first element is always 1
            int n=price.length;
            int S[]=new int[price.length];
            S[0] = 1;
            // Calculate span values for rest of the elements
            for (int i = 1; i < n; i++) {

                // Pop elements from stack while stack is not
                // empty and top of stack is smaller than
                // price[i]
                while (!st.empty() && price[st.peek()] <= price[i])
                    st.pop();

                // If stack becomes empty, then price[i] is
                // greater than all elements on left of it, i.e.,
                // price[0], price[1], ..price[i-1]. Else price[i]
                // is greater than elements after top of stack
                S[i] = (st.empty()) ? (i + 1) : (i - st.peek());

                // Push this element to stack
                st.push(i);
            }
         return S;
     }

}
