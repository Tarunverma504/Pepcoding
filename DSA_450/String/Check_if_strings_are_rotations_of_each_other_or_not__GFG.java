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
Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.

 

Example 1:

Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.
 

Example 2:

Input:
mightandmagic
andmagicmigth
Output: 
0
Explanation: Here with any amount of
rotation s2 can't be obtained by s1.
 

Your Task:
The task is to complete the function areRotations() which checks if the two strings are rotations of each other. The function returns true if string 1 can be obtained by rotating string 2, else it returns false.

 

Expected Time Complexity: O(N).
Expected Space Complexity: O(N).
Note: N = |s1|.

 

Constraints:
1 <= |s1|, |s2| <= 107
*/
import java.util.*;
public class Check_if_strings_are_rotations_of_each_other_or_not__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1#
        */
    }
    static class Solution
    {
        //Function to check if two strings are rotations of each other or not.
        public static boolean areRotations(String s1, String s2 )
        {
            // Your code here
            if(s1.length()!=s2.length()){
                return false;
            }
            s1=s1+s1;
            if(s1.contains(s2))
                return true;
            return false;
        }

    }
}
