/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_and_StringBuilders;

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
public class Print_Anagrams_Together__MEDIUM__GFG {
    public static void main(String[] arg){
        /*
        Question:-"https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/?category[]=Strings&category[]=Strings&page=1&query=category[]Stringspage1category[]Strings#
        */
    }
    public List<List<String>> Anagrams(String[] string_list) {
        
        // Your Code here
        // Your Code here
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s: string_list){
        char c[]= s.toCharArray();
        Arrays.sort(c);
        String str=new String(c);
        if(!hm.containsKey(str)){
        hm.put(str,new ArrayList<>());
        }
        hm.get(str).add(s);
        }
        res.addAll(hm.values());
        return res;
        
    }
}
