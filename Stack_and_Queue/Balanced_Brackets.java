/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_and_Queue;

/**
 *
 * @author Mind_Coder
 */
/*
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
Input Format
A string str
Output Format
true or false
Question Video

  COMMENTConstraints
0 <= str.length <= 100
Sample Input
[(a + b) + {(c + d) * (e / f)}]
Sample Output
true

*/

import java.util.*;
public class Balanced_Brackets {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(getResult(str));
    }
    public static boolean  getResult(String str){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{' ){
                stack.push(ch);
            }
            else if(ch==']' || ch=='}'|| ch==')'){
                if(!stack.isEmpty() && ch==']' && stack.peek()=='[')
                    stack.pop();
                else if(!stack.isEmpty() && ch=='}' && stack.peek()=='{')
                    stack.pop();
                else if(!stack.isEmpty() && ch==')' && stack.peek()=='(')
                    stack.pop();
                else
                return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    } 
}
