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
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.

*/

import java.util.*;
public class Longest_Common_Prefix__LC__14 {
    public static void main(String arg[]){
      //  https://leetcode.com/problems/longest-common-prefix/
    }
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            String s="";
            if(strs.length<1)
            {
                return s;
            }
            for(int i=0;i<strs[0].length();i++)
            {
                char n=strs[0].charAt(i);
                for(int j=1;j<strs.length;j++)
                {
                    if(strs[j].length()-1<i)
                    {
                        return s;
                    }
                    if(strs[j].charAt(i)!=n)
                    {
                        return s;
                    }


                }
                s=s+n;

            }
            return s;
        }
    }
}
