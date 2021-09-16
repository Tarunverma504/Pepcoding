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
1. You are given a postfix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to prefix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
Input Format
Input is managed for you
Output Format
value, a number
infix
prefix
Question Video

  COMMENTConstraints
1. Expression is a valid postfix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.
Sample Input
264*8/+3-
Sample Output
2
((2+((6*4)/8))-3)
-+2/*6483
*/

import java.util.*;
public class Postfix_Evaluation_And_Conversions {
    public static void main(String[] args) throws Exception {
    Scanner  sc = new Scanner(System.in);
    String exp = sc.nextLine();

    // code
    Stack<String> infix=new Stack<String>();
    Stack<String> prefix=new Stack<String>();
    Stack<Integer> val=new Stack<Integer>();
    for(int i=0;i<exp.length();i++){
        char ch =exp.charAt(i);
        
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            int num2=val.pop();
            int num1=val.pop();
            val.push(operation(num1,num2,ch));
            
            String prev2=prefix.pop();
            String prev1=prefix.pop();
            prefix.push(ch+prev1+prev2);
            
            String inv2=infix.pop();
            String inv1=infix.pop();
            infix.push("("+inv1+ch+inv2+")");
        }
        else{
            infix.push(ch+"");
            prefix.push(ch+"");
            val.push(ch-'0');
        }
    }
    System.out.println(val.pop());
    System.out.println(infix.pop());
    System.out.println(prefix.pop());
 }
 
 public static int operation(int n1,int n2,char ch){
     if(ch=='+')
        return n1+n2;
    else if(ch=='-')
        return n1-n2;
    else if(ch=='*')
        return n1*n2;
    else
        return n1/n2;
    
 }
}
