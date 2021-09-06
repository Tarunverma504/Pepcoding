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
Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3
Your Task:
Complete the function romanToDecimal() which takes a string as input parameter and returns the equivalent decimal number. 

Expected Time Complexity: O(|S|), |S| = length of string S.
Expected Auxiliary Space: O(1)

Constraints:
1<=roman no range<=3999
*/
import java.util.*;
public class Roman_Number_to_Integer__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1#
        */
    }
    static class Solution {
    // Finds decimal value of a given roman numeral
        public int romanToDecimal(String str) {
            // code here
            HashMap<Character,Integer> h=new HashMap<Character,Integer>();
            h.put('I',1);
            h.put('V',5);
            h.put('X',10);
            h.put('L',50);
            h.put('C',100);
            h.put('D',500);
            h.put('M',1000);
            int ans=h.get(str.charAt(str.length()-1));
            for(int i=str.length()-2;i>=0;i--){
                if(h.get(str.charAt(i+1))<= h.get(str.charAt(i))){
                    ans+=h.get(str.charAt(i));
                    //System.out.println(ans);
                }
                else
                ans-=h.get(str.charAt(i));
            }
           // System.out.println(ans);
            return ans;
        }
    }
}
