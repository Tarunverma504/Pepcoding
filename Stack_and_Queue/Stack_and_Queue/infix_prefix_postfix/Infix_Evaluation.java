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
1. You are given an infix expression.
2. You are required to evaluate and print it's value.
Input Format
Input is managed for you
Output Format
Value of infix expression
Question Video

  COMMENTConstraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.
Sample Input
2 + 6 * 4 / 8 - 3
Sample Output
2`
*/
import java.util.*;
public class Infix_Evaluation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String exp = sc.nextLine();

        // code
        Stack<Integer> num=new Stack<Integer>();
        Stack<Character> oprt=new Stack<Character>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                oprt.push(ch);
            }
            else if(Character.isDigit(ch)){
                num.push(ch-'0');

            }
            else if(ch==')'){
                while(oprt.peek()!='('){
                    int v2=num.pop();
                    int v1=num.pop();
                    char op=oprt.pop();
                    num.push(operation(v1,v2,op));
                }
                oprt.pop();
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(oprt.size()>0 && oprt.peek()!='(' && priority(ch)<=priority(oprt.peek())){
                    int v2=num.pop();
                    int v1=num.pop();
                    char op=oprt.pop();
                    num.push(operation(v1,v2,op));
                }
                oprt.push(ch);
            }

        }
        while(!oprt.isEmpty()){
            int v2=num.pop();
                    int v1=num.pop();
                    char op=oprt.pop();
                    num.push(operation(v1,v2,op));
        }
        System.out.println(num.peek());
     }

     public static int priority(char op){
         if(op=='+' || op=='-')
            return 1;
         else
            return 2;
     }

     public static int operation(int v1,int v2,char op){
        if(op=='+')
            return v1+v2;
        else if(op=='-')
            return v1-v2;
        else if(op=='*')
            return v1*v2;
        else
            return v1/v2;
     }
}
