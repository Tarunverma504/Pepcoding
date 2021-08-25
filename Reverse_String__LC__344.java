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
Write a function that reverses a string. The input string is given as an array of characters s.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 
*/
public class Reverse_String__LC__344 {
    public static void main(String  arg[]){
        /*
        https://leetcode.com/problems/reverse-string/
        */
    }
    class Solution {
        public void reverseString(char[] s) {
            int left=0,right=s.length-1;
            while(left<right)
            {
                char temp=s[left];
                s[left]=s[right];
                s[right]=temp;
                left++;
                right--;
            }
            System.out.println(s);

        }
    }
}
