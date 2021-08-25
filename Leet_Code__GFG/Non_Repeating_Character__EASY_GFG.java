/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */

/*

Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
Your Task:
You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= N <= 103

 

*/
import java.util.*;
public class Non_Repeating_Character__EASY_GFG {
    public static void main(String[] arg){
        /*
            https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1/?category[]=Strings&category[]=Strings&difficulty[]=0&page=1&sortBy=submissions&query=category[]Stringsdifficulty[]0page1sortBysubmissionscategory[]Strings
        */
    }
    
    static char nonrepeatingCharacter(String a)
    {
        //Your code here
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<a.length();i++){
            int freq=h.get(a.charAt(i))==null?1:h.get(a.charAt(i))+1;
            h.put(a.charAt(i),freq);
        }
        char x='$';
        for(Map.Entry m:h.entrySet()){
            //System.out.println(m.getKey()+" "+m.getValue());
            if((int)m.getValue()==1){
                x=(char)m.getKey();
                break;
            }
        }
        return x;
    }
}
