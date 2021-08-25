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
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
*/
import java.util.*;
public class Letter_Combinations_of_a_Phone_Number_17 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/letter-combinations-of-a-phone-number/
        */
    }
    public static class  Solution {
        public static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        public List<String> letterCombinations(String digits) {
            if(digits.isEmpty()){
                 List<String> base=new ArrayList<String>();
                return base;
            }
            List<String> ans =getCombinations(digits);
            return ans;
        }
        public List<String> getCombinations(String digits){
            if(digits.length()==0){
                List<String> base=new ArrayList<String>();
                base.add("");
                return base;
            }
            char ch=digits.charAt(0);
            String ros=digits.substring(1);
            List<String> rstr=getCombinations(ros);
            List<String> dummy=new ArrayList<String>();
            String n=codes[ch-'0'-1];
            for(int i=0;i<n.length();i++){

                for(String res:rstr){
                    dummy.add(n.charAt(i)+res);
                }
            }
            return dummy;
        }
    }
}
