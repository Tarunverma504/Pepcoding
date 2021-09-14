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
A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Note: Follow 0 based indexing.
 

Example 1:

Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity. 

Example 2:

Input:
N = 2
M[][] = {{0 1},
         {1 0}}
Output: -1
Explanation: The two people at the party both
know each other. None of them is a celebrity.

Your Task:
You don't need to read input or print anything. Complete the function celebrity() which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
2 <= N <= 3000
0 <= M[][] <= 1
*/
import java.util.*;
public class The_Celebrity_Problem__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1#
        */
    }
    static class Solution
    {
        //Function to find if there is a celebrity in the party or not.
        int celebrity(int M[][], int n)
        {
            // code here 
            Stack<Integer> stack=new Stack<Integer>();
            for(int i=0;i<n;i++)
                stack.push(i);
            while(stack.size()>=2){
                int i=stack.pop();
                int j=stack.pop();
                if(M[i][j]==1){
                    //if i knows j mean i is not celebrity
                    stack.push(j);
                }
                else{
                    // it mean j knows i so j is not celebrity
                    stack.push(i);
                }
            }
            int pot=stack.pop();
            for(int i=0;i<n;i++){
                if(i!=pot){
                    if(M[i][pot]==0 || M[pot][i]==1)
                        return -1;
                }
            }

            return pot;
        }
    }
}
