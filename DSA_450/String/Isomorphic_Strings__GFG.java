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
Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
Note: All occurrences of every character in ‘str1’ should map to the same character in ‘str2’

Example 1:

Input:
str1 = aab
str2 = xxy
Output: 1
Explanation: There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.
Example 2:

Input:
str1 = aab
str2 = xyz
Output: 0
Explanation: There are two different
charactersin aab but there are three
different charactersin xyz. So there
won't be one to one mapping between
str1 and str2.
Your Task:
You don't need to read input or print anything.Your task is to complete the function areIsomorphic() which takes the string str1 and string str2 as input parameter and  check if two strings are isomorphic. The function returns true if strings are isomorphic else it returns false.

Expected Time Complexity: O(|str1|+|str2|).
Expected Auxiliary Space: O(Number of different characters).
Note: |s| represents the length of string s.

Constraints:
1 <= |str1|, |str2| <= 2*104

Company Tags
*/

import java.util.*;
public class Isomorphic_Strings__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1#
        */
    }
    static class Solution
    {
        //Function to check if two strings are isomorphic.
        public static boolean areIsomorphic(String str1,String str2)
        {
            // Your code here
            if(str1.length()!=str2.length())
                return false;

            //store the maping of the characters 
            HashMap<Character,Character> map1=new HashMap<Character,Character>();

            //it keeps the record of wheather the character of string 2 is already mapped or not
            HashMap<Character,Boolean> map2=new HashMap<Character,Boolean>();
            for(int i=0;i<str1.length();i++){
                char ch1=str1.charAt(i);
                char ch2=str2.charAt(i);
                if(map1.containsKey(ch1)){
                    if(map1.get(ch1)!=ch2)
                        return false;
                }
                else{
                    if(map2.containsKey(ch2)==true)
                        return false;
                    else{
                        map1.put(ch1,ch2);
                        map2.put(ch2,true);
                    }
                }
            }
            return true;
        }
    }
}
