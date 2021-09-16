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
1. You are given a prefix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to postfix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
Input Format
Input is managed for you
Output Format
value, a number
infix
prefix
Question Video

  COMMENTConstraints
1. Expression is a valid prefix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.
Sample Input
-+2/*6483
Sample Output
2
((2+((6*4)/8))-3)
264*8/+3-
*/
import java.util.*;
public class Prefix_Evaluation_And_Conversions {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        // code
        Stack<Integer> val=new Stack<Integer>();
        Stack<String> post=new Stack<String>();
        Stack<String> infix=new Stack<String>();

        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int num1=val.pop();
                int num2=val.pop();
                val.push(operation(num1,num2,ch));

                String postv1=post.pop();
                String postv2=post.pop();
                post.push(postv1+postv2+ch);

                String inv1=infix.pop();
                String inv2=infix.pop();
                infix.push("("+inv1+ch+inv2+")");
            }
            else{
                infix.push(ch+"");
                post.push(ch+"");
                val.push(ch-'0');

            }
        }
        System.out.println(val.pop());
        System.out.println(infix.pop());
        System.out.println(post.pop());
     }
     public static int operation(int val1,int val2,char ch){
         if(ch=='+')
            return val1+val2;
        else if(ch=='-')
            return val1-val2;
        else if(ch=='*')
            return val1*val2;
        else
            return val1/val2;
     }
}
