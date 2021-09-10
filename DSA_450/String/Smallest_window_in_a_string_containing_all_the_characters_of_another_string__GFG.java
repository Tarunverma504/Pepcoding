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

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

Constraints: 
1 ≤ |S|, |P| ≤ 105
*/
import java.util.*;
public class Smallest_window_in_a_string_containing_all_the_characters_of_another_string__GFG {
    static class Solution
    {
        //Function to find the smallest window in the string s consisting
        //of all the characters of string p.
        public static String smallestWindow(String s, String p)
        {
            // Your code here
            HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
            HashMap<Character,Integer> map2=new HashMap<Character,Integer>(); //second string freq
            for(int i=0;i<p.length();i++){
                map2.put(p.charAt(i),map2.getOrDefault(p.charAt(i),0)+1);
            }
            int i=0,j=0;
            int dcmt=p.length();
            int mct=0;
            int len=Integer.MAX_VALUE;
            int start=0,end=0;
            while(true){
                boolean f1=false;
                boolean f2=false;
                while(i<s.length() && mct<dcmt){
                    char ch=s.charAt(i);
                    map1.put(ch,map1.getOrDefault(ch,0)+1);
                    if(map2.containsKey(ch) && map1.get(ch)<=map2.get(ch))
                        mct++;

                    i++;
                    f1=true;
                }

                while(j<i && mct==dcmt){
                    //System.out.println(s.substring(j,i));
                    int temp=i-j+1;

                    if(temp<len){
                        len=temp;
                        start=j;
                        end=i;
                    }

                    char ch=s.charAt(j);
                    if(map1.get(ch)==1)
                        map1.remove(ch);
                    else
                        map1.put(ch,map1.get(ch)-1);
                    if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0))
                        mct--;

                    j++;
                    f2=true;
                }
                if(f1==false && f2==false)
                    break;

            }
           // 
            //System.out.println(start+" "+end);
            if(start==0 && end==0){
                return "-1";
            }
            return s.substring(start,end);

        }
    }
}
