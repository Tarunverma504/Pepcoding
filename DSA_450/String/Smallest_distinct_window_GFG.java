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
Given a string 's'. The task is to find the smallest window length that contains all the characters of the given string at least one time.
For eg. A = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca”.

 

Example 1:

Input : "AABBBCBBAC"
Output : 3
Explanation : Sub-string -> "BAC"
Example 2:
Input : "aaab"
Output : 2
Explanation : Sub-string -> "ab"
 
Example 3:
Input : "GEEKSGEEKSFOR"
Output : 8
Explanation : Sub-string -> "GEEKSFOR"
 


Your Task:  
You don't need to read input or print anything. Your task is to complete the function findSubString() which takes the string  S as inputs and returns the length of the smallest such string.


Expected Time Complexity: O(256.N)
Expected Auxiliary Space: O(256)

 

Constraints:
1 ≤ |S| ≤ 105
String may contain both type of English Alphabets.
*/
import java.util.*;
public class Smallest_distinct_window_GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1#
        */
    }
    static class Solution {
        public String findSubString( String str) {
            // Your code goes here
            HashSet<Character> set=new HashSet<Character>();
            for(int i=0;i<str.length();i++)
                set.add(str.charAt(i));
            HashMap<Character,Integer> map=new HashMap<Character,Integer>();
            int i=0,j=0;
            int len=Integer.MAX_VALUE;
            int start=0;
            int end=0;
            while(true){
                boolean f1=false;
                boolean f2=false;
                while(i<str.length() && map.size()<set.size()){
                    char ch=str.charAt(i);
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    f1=true;
                    i++;
                }

                while(j<i && map.size()==set.size()){
                    int prelen=i-j+1;
                    if(prelen<len){
                        len=prelen;
                        start=j;
                        end=i;
                    }
                    char ch=str.charAt(j);
                    if(map.get(ch)==1)
                        map.remove(ch);
                    else
                        map.put(ch,map.get(ch)-1);

                    f2=true;
                    j++;
                }
                if(f1==false && f2==false)
                    break;
            }
            return str.substring(start,end);
        }
    }
}
