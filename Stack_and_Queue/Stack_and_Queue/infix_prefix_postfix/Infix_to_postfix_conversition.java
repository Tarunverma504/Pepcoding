/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_and_Queue.Stack_and_Queue.infix_prefix_postfix;

/**
 *
 * @author Mind_Coder
 */
/*
Given an infix expression in the form of string str. Convert this infix expression to postfix expression.

Infix expression: The expression of the form a op b. When an operator is in-between every pair of operands.
Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
â€‹Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -. 
Example 1:

Input: str = "a+b*(c^d-e)^(f+g*h)-i"
Output: abcd^e-fgh*+^*+i-
Explanation:
After converting the infix expression 
into postfix expression, the resultant 
expression will be abcd^e-fgh*+^*+i-
Example 2:

Input: str = "A*(B+C)/D"
Output: ABC+*D/
Explanation:
After converting the infix expression 
into postfix expression, the resultant 
expression will be ABC+*D/
 
Your Task:
This is a function problem. You only need to complete the function infixToPostfix() that takes a string(Infix Expression) as a parameter and returns a string(postfix expression). The printing is done automatically by the driver code.

Expected Time Complexity: O(|str|).
Expected Auxiliary Space: O(|str|).

Constraints:
1 ≤ |str| ≤ 105
*/
import java.util.*;
public class Infix_to_postfix_conversition {
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    String exp = sc.nextLine();
    // code
    
    Stack<Character> ops=new Stack<Character>();
    Stack<String> postfix=new Stack<String>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(ch=='('){
            ops.push(ch);
        }
        else if((ch>='0' && ch<=9)|| (ch>='a' && ch<='z')||(ch=='A' && ch=='Z')){
            postfix.push(ch+"");
        }
        else if(ch==')'){
            while(ops.peek()!='('){
                String postv2=postfix.pop();
                String postv1=postfix.pop();
                char op=ops.pop();
                postfix.push(postv1+postv2+op);
            }
            ops.pop();
        }
        else if(ch=='+'|| ch=='-'||ch=='*'||ch=='/'){
            while(!ops.isEmpty() && ops.peek()!='(' && precedence(ch)<=precedence(ops.peek())){
                String postv2=postfix.pop();
                String postv1=postfix.pop();
                char op=ops.pop();
                postfix.push(postv1+postv2+op);
                
            } 
            ops.push(ch);
        }
    }
    while(!ops.isEmpty()){
        String postv2=postfix.pop();
                String postv1=postfix.pop();
                char op=ops.pop();
                postfix.push(postv1+postv2+op);
            
    }
    System.out.println(postfix.pop());
 }
 public static int precedence(char ch){
     if(ch=='+'||ch=='-'){
         return 1;
     }
     else
        return 2;
 }
}
