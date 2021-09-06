/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.String;

/**
 *
 * @author Mind_Coder
 */
/*
Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.

Note: No two strings are the second most repeated, there will be always a single string.

Example 1:

Input:
N = 6
arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
Output: bbb
Explanation: "bbb" is the second most 
occurring string with frequency 2.

â€‹Example 2:

Input: 
N = 6
arr[] = {geek, for, geek, for, geek, aaa}
Output: for
Explanation: "for" is the second most
occurring string with frequency 2.

Your Task:
You don't need to read input or print anything. Your task is to complete the function secFrequent() which takes the string array arr[] and its size N as inputs and returns the second most frequent string in the array.


Expected Time Complexity: O(N*max(|Si|).
Expected Auxiliary Space: O(N*max(|Si|).


Constraints:
1<=N<=103
*/
import java.util.*;
public class Second_most_repeated_string_in_a_sequence__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1
        */
    }
    static class Solution
    {
        String secFrequent(String arr[], int N)
        {
            // your code here
            HashMap<String,Integer> h=new HashMap<String,Integer>();
            for(int i=0;i<N;i++){
                int freq=h.get(arr[i])==null?1:h.get(arr[i])+1;
                h.put(arr[i],freq);
            }
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> it: h.entrySet()){
                if(it.getValue()>max1){
                    max2=max1;
                    max1=it.getValue();
                }
                else{
                    if(max2<it.getValue() && max1>it.getValue()){
                        max2=it.getValue();
                    }
                }
            }
            for (Map.Entry<String, Integer> it: h.entrySet()){
                if(max2==it.getValue())
                    return it.getKey();

            }

            return null;
        }
    }
}
