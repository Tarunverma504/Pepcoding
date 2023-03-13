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
import java.util.*;
/*
    Given two strings S and P. Find the smallest window in the string S consisting of all the characters(including duplicates) of the string P.  Return "-1" in case there is no such window present. In case there are multiple such windows of same length, return the one with the least starting index. 

Example 1:

Input:
S = "timetopractice"
P = "toc"
Output: 
toprac
Explanation: "toprac" is the smallest
substring in which "toc" can be found.
Example 2:

Input:
S = "zoomlazapzo"
P = "oza"
Output: 
apzo
Explanation: "apzo" is the smallest 
substring in which "oza" can be found.
Your Task:
You don't need to read input or print anything. Your task is to complete the function smallestWindow() which takes two string S and P as input paramters and returns the smallest window in string S having all the characters of the string P. In case there are multiple such windows of same length, return the one with the least starting index. 
*/
public class Smallest_window_in_a_string_containing_all_the_characters_of_another_string {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
        */
    }
    static class Solution
    {
        //Function to find the smallest window in the string s consisting
        //of all the characters of string p.
        public static String smallestWindow(String s, String p)
        {
            // Your code here
            Map<Character, Integer> map1 = new HashMap<Character,Integer>();
            Map<Character, Integer> map2 = new HashMap<Character, Integer>();
            for(int i=0; i<p.length(); i++)
                map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0)+1);

            int i=-1;
            int j=-1;
            int mct =0;
            int dmct=p.length();
            int len = Integer.MAX_VALUE;
            int start=-1;
            int end =-1;
            while(true){
                boolean flag1 = false;
            boolean flag2 = false;
                while(i<s.length()-1 && mct<dmct){
                    i++;
                    map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0)+1);
                    if(map2.getOrDefault(s.charAt(i), 0)<=map1.getOrDefault(s.charAt(i),0)){
                        mct++;
                    }
                    flag1=true;
                }
                while(j<i && mct==dmct){

                    if(i-j<len){
                        len = i-j;
                        start = j;
                        end = i;
                    }
                    j++;
                    if(map2.get(s.charAt(j))==1)
                        map2.remove(s.charAt(j));
                    else{
                        map2.put(s.charAt(j), map2.get(s.charAt(j))-1);
                    }

                    if(map2.getOrDefault(s.charAt(j), 0) < map1.getOrDefault(s.charAt(j), 0)){
                        mct--;
                    }
                    flag2=true;
                }
                if(!flag1 && !flag2)
                    break;
            }

            if(len==Integer.MAX_VALUE)
                return "-1";
            return s.substring(start+1, end+1);
        }
    }
}
