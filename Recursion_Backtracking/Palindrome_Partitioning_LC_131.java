/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Backtracking;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
/*
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
*/

public class Palindrome_Partitioning_LC_131 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/palindrome-partitioning/
        */
    }
    
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> ans = new ArrayList<>();
            List<String> temp = new ArrayList<>();
            sol(s, ans, temp);
            return ans;
        }

        public  void sol(String s,List<List<String>> ans,List<String> temp ){
            if(s.length()==0){
                ans.add(new ArrayList<String>(temp));
                return;
            }
            for(int i=0;i<s.length();i++){
                String leftPart = s.substring(0, i+1);
                if(isPalidrome(leftPart)){
                    temp.add(leftPart);
                    sol(s.substring(i+1), ans, temp);
                    temp.remove(temp.size()-1);
                }
            }
        }

        public  boolean isPalidrome(String s){
            int l=0;
            int r= s.length()-1;
            while(l<=r){
                if(s.charAt(l)!=s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
    
    }
}
