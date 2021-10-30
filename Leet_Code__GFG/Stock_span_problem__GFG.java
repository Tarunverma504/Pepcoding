/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */


import java.util.*;
public class Stock_span_problem__GFG {
    
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#
        */
    }
    static class Solution
    {
        //Function to calculate the span of stockâ€™s price for all n days.
        public static int[] calculateSpan(int price[], int n)
        {
            // Your code here
            int span[] = new int[price.length];
            span[0]=1;
            Stack<Integer> st = new Stack<Integer>();
            st.push(0);
            for(int curr=1;curr<price.length;curr++){
                while(!st.isEmpty() && price[st.peek()]<=price[curr]){
                    st.pop();
                }
                span[curr]=st.isEmpty()?curr+1:curr-st.peek();
                            st.push(curr);
            }
                    return span;



        }

    }
}
