package Stack_and_Queue;

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
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

 

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
Example 4:

Input: s = "abc3[cd]xyz"
Output: "abccdcdcdxyz"
 

Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].
*/
import java.util.*;
public class Decode_String__LC__394 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/decode-string/
        */
    }
    static class Solution {
        public String decodeString(String s) {
            Stack<Character> str=new Stack<Character>();
            Stack<Integer> num=new Stack<Integer>();
            int i=0;
            //int count=0;
            while(i<s.length()){
                if(Character.isDigit(s.charAt(i))){
                    int count=0;
                    while(Character.isDigit(s.charAt(i))){
                        count=count*10+(s.charAt(i)-'0');
                        i++;
                    }

                    num.push(count);
                }
                else if(s.charAt(i)==']'){
                    int repeat=num.pop();
                    String temp="";
                    while(str.peek()!='[')
                        temp=str.pop()+temp;
                    str.pop();
                    for(int k=0;k<repeat;k++){
                        for(int j=0;j<temp.length();j++){
                            str.push(temp.charAt(j));
                        }
                    }
                    i++;
                }
                else{
                    str.push(s.charAt(i));
                    i++;
                }
            }
            String ans="";
            while(!str.isEmpty())
                ans=str.pop()+ans;
            return ans;
        }
    }
    
}
