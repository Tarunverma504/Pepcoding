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
Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.


Example 1:

Input:
N = 5
words[] = {act,god,cat,dog,tac}
Output: 
god dog
act cat tac
Explanation:
There are 2 groups of
anagrams "god", "dog" make group 1.
"act", "cat", "tac" make group 2.
Example 2:

Input:
N = 3
words[] = {no,on,is}
Output: 
no on
is
Explanation:
There are 2 groups of
anagrams "no", "on" make group 1.
"is" makes group 2. 

Your Task:
The task is to complete the function Anagrams() that takes a list of strings as input and returns a list of groups such that each group consists of all the strings that are anagrams.


Expected Time Complexity: O(N*|S|*log|S|), where |S| is the length of the strings.
Expected Auxiliary Space: O(N*|S|), where |S| is the length of the strings.


Constraints:
1<=N<=100
*/
import java.util.*;
public class Print_Anagrams_Together__GFG {
    public static void main(String arg[]){
        // https://practice.geeksforgeeks.org/problems/print-anagrams-together/1#
    }
    static class Solution {
        public List<List<String>> Anagrams(String[] string_list) {
            // Code here
            List<List<String>> ans=new ArrayList<List<String>>();
            HashMap<String,List<String>> hm=new HashMap<String,List<String>>();
            for(int i=0;i<string_list.length;i++){
                String s=string_list[i];
                char ch[]=s.toCharArray();
                Arrays.sort(ch);
                String str=new String(ch);
                if(!hm.containsKey(str)){
                    hm.put(str,new ArrayList<>());
                }
                hm.get(str).add(s);

            }
            for(Map.Entry<String,List<String>> res:hm.entrySet())
                ans.add(res.getValue());
            return ans;
        }
    }

}
