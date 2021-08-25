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

/*
Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800

Your Task:
You don't need to read input or print anything. Complete the function factorial() that takes integer N as input parameter and returns a list of integers denoting the digits that make up the factorial of N.


Expected Time Complexity : O(N2)
Expected Auxilliary Space : O(1)


*/
import java.util.*;
public class Factorials_of_large_numbers__GFG {
    public static void main(String []arg){
        /*
        https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1#
        */
    }
    static class Solution {
        static void multiply(ArrayList<Integer> a,int num){
            int carry=0;
            //int product=1;
            for(int i=0;i<a.size();i++){
                int product=a.get(i)*num+carry;
                a.set(i,product%10);
                carry=product/10;
            }
            while(carry!=0){
                a.add(carry%10);
                carry=carry/10;
            }
        }
        static ArrayList<Integer> factorial(int n){
            //code here
            ArrayList<Integer> a=new ArrayList<Integer>();
            a.add(1);
            for(int i=1;i<=n;i++){
                multiply(a,i);
            }
            Collections.reverse(a);
            return a;
        }
    }
}
