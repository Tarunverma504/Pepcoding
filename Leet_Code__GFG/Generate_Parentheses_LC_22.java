package Leet_Code__GFG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
    22. Generate Parentheses
Medium
17.4K
698
Companies
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
*/
import java.util.*;
public class Generate_Parentheses_LC_22 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/generate-parentheses/description/
        */
    }
    static class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<String>();

            // It is sure that the string always begins with open bracket
            sol("(", 1, 0, n, ans);
            return ans;
        }

        public static void sol(String asf, int op, int close, int n, List<String> ans){

            // if asf length becomes 2*n that means we have iterated the open and closed brackets
            if(asf.length() == 2*n){
                ans.add(asf);
                return;
            }

            // there is 2 choices whether to take open or close bracket
            // if open is smaller then n then we have change to make recursivce call for open bracket
            if(op<n){
                sol(asf+'(', op+1, close, n, ans);
            }

            // if count of close bracket is smaller then open only at that time we have choice to make call for closed bracket elese it will result in unbalanaced brackets
            if(close<op){
                sol(asf+')', op, close+1, n, ans);
            }
        }
    }
}
