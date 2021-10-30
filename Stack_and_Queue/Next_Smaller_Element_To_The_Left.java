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
2. You are given n numbers, representing elements of array a.
3. You are required to "next smaller element on the left" for all elements of array
4. Input and output is handled for you.

"Next smaller element on the left" of an element x is defined as the first element to left of x having value smaller than x.
Note -> If an element does not have any element on it's left side smaller than it, consider -1 as it's "next smaller element on left"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next smaller for 2 is -1
Next smaller for 5 is 2
Next smaller for 9 is 5
Next smaller for 3 is 2
Next smaller for 1 is -1
Next smaller for 12 is 1
Next smaller for 6 is 1
Next smaller for 8 is 6
Next smaller for 7 is 6
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
0 <= n < 10^5
-10^9 <= a[i] <= 10^9
Sample Input
5
5
3
8
-2
7
Sample Output
-1
-1
3
-1
-2




*/
import java.util.*;
public class Next_Smaller_Element_To_The_Left {
    public static void main(String arg[]){
        /*
        https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/stacks/next-smaller-element-left-official/ojquestion
        */
    }
    public static int[] solve(int[] arr) {
    // solve
    int ans[] = new int[arr.length];
        ans[0]=-1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i])
                st.pop();
            if(st.isEmpty())
                ans[i]=-1;
            else
                ans[i]=st.peek();
            st.push(arr[i]);
        }
        return ans;
  }
}
