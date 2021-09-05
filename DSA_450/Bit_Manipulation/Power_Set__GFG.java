/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Bit_Manipulation;

/**
 *
 * @author Mind_Coder
 */
/*
Given a string S find all possible subsequences of the string in lexicographically-sorted order.

Example 1:

Input : str = "abc"
Output: a ab abc ac b bc c
Explanation : There are 7 substrings that 
can be formed from abc.
Example 2:

Input: str = "aa"
Output: a a aa
Explanation : There are 3 substrings that 
can be formed from aa.
Your Task:
You don't need to read ot print anything. Your task is to complete the function AllPossibleStrings() which takes S as input parameter and returns a list of all possible substrings(non-empty) that can be formed from S in lexicographically-sorted order.
 

Expected Time Complexity: O(2n) where n is the length of the string
Expected Space Complexity : O(n * 2n)
 

Constraints: 
1 <= Length of string <= 16


*/

import java.util.*;
public class Power_Set__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/power-set4302/1#
        */
    }
    class Solution
    {
        public List<String> AllPossibleStrings(String s)
        {
            // Code here
            ArrayList<String> a=new ArrayList<String>();
            int n=s.length();
            int size=(int)Math.pow(2,n);
            for(int i=0;i<size;i++){
                String str="";
                for(int j=0;j<n;j++){
                    int mask=1<<j;
                    if((i&mask)!=0){
                        str=str+s.charAt(j);
                    }
                }
                if(!str.isEmpty()){
                    a.add(str);
                }

            }
            Collections.sort(a);
            return a;
        }
    }
}
