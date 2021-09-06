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
Given a string S. The task is to print all permutations of a given string.

 

Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function find_permutaion() which takes the string S as input parameter and returns a vector of string in lexicographical order.

 

Expected Time Complexity: O(n! * n)

Expected Space Complexity: O(n)

 

Constraints:
1 <= length of string <= 5
 
*/
import java.util.*;
public class Permutations_of_a_given_string__iterative_method {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1#
        */
    }
    static class Solution {
        public List<String> find_permutation(String s) {
            // Code here
            int n=s.length();
            int f=fac(n);
            List<String> ans=new ArrayList<String>();
            for(int i=0;i<f;i++){
                StringBuilder str=new StringBuilder(s);
                StringBuilder res=new StringBuilder();
                int temp=i;
                for(int div=n;div>0;div--){
                    int q=temp/div;
                    int r=temp%div;
                    res.append(str.charAt(r));
                    //System.out.print(str.charAt(r)+" ");
                    str.deleteCharAt(r);
                    temp=q;
                }
                //System.out.println();
                ans.add(res.toString());
            }
            Collections.sort(ans);
            return ans;
        }
        public static int fac(int n){
            if(n==0)
                return 1;
            return n*fac(n-1);
        }
    }
}
