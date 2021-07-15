package Strings_and_StringBuilders;

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
order and str are strings composed of lowercase letters. In order, no letter occurs more than once.

order was sorted in some custom order previously. We want to permute the characters of str so that they match the order that order was sorted. More specifically, if x occurs before y in order, then x should occur before y in the returned string.

Return any permutation of str (as a string) that satisfies this property.

Example:
Input: 
order = "cba"
str = "abcd"
Output: "cbad"
Explanation: 
"a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a". 
Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.
 

Note:

order has length at most 26, and no character is repeated in order.
str has length at most 200.
order and str consist of lowercase letters only.
*/
import java.util.*;
public class Custom_Sort_String__LC__791 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/custom-sort-string/
        */
    }
    class Solution {
    public String customSortString(String order, String str) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<str.length();i++){
            int freq=h.get(str.charAt(i))==null?1:h.get(str.charAt(i))+1;
            h.put(str.charAt(i),freq);
        }
        str="";
        for(int i=0;i<order.length();i++){
            if(h.get(order.charAt(i))==null)
                continue;
            char ch=order.charAt(i);
            int val=h.get(order.charAt(i));
            while(val!=0){
                str=str+ch;
                val--;
            }
            h.remove(ch);
        }
        for(Map.Entry<Character,Integer>m:h.entrySet()){
            char ch=m.getKey();
            int val=m.getValue();
             while(val!=0){
                str=str+ch;
                val--;
            }
        }
        return str;
    }
}
}
