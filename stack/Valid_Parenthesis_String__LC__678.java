/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Mind_Coder
 */
/*
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "(*)"
Output: true
Example 3:

Input: s = "(*))"
Output: true
 

Constraints:

1 <= s.length <= 100
s[i] is '(', ')' or '*'.
*/
import java.util.*;
public class Valid_Parenthesis_String__LC__678 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/valid-parenthesis-string/
        */
    }
    class Solution {
        public boolean checkValidString(String s) {
            Stack<Integer> bracket=new Stack<Integer>();
            Stack<Integer> star=new Stack<Integer>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(')
                    bracket.push(i); //push value of i in bracket stack
                else if(s.charAt(i)=='*')
                    star.push(i);  //push value of i in star stack
                else{
                    if(!bracket.isEmpty())
                        bracket.pop();  //if bracket stack is not empty then pop
                    else if(!star.isEmpty())
                        star.pop();  //if star stack is not empty ten pop
                    else
                        return false;
                }
            }

            //if bracket stack  has opening brackets
            while(!bracket.isEmpty()){
            //star stack is empty if not then * value must be greater than ( value.
                if(star.isEmpty())
                    return false;
                else if(star.peek()>bracket.peek()){
                    star.pop();
                    bracket.pop();
                }else 
                    return false;

        }

        return true;
        }
    }

}
