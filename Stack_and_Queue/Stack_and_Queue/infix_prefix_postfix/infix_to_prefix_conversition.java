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
Examples: 

Input : A * B + C / D
Output : + * A B/ C D 

Input : (A - B/C) * (A/K-L)
Output : *-A/BC-/AKL
*/
import java.util.*;
public class infix_to_prefix_conversition {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String exp = sc.nextLine();

    // code
    
    Stack<Character> ops=new Stack<Character>();
    Stack<String> prefix=new Stack<String>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(ch=='('){
            ops.push(ch);
        }
        else if((ch>='0' && ch<=9)|| (ch>='a' && ch<='z')||(ch=='A' && ch=='Z')){
            prefix.push(ch+"");
        }
        else if(ch==')'){
            while(ops.peek()!='('){
                char op=ops.pop();
                String prev2=prefix.pop();
                String prev1=prefix.pop();
                prefix.push(op+prev1+prev2);
            }
            ops.pop();
        }
        else if(ch=='+'|| ch=='-'||ch=='*'||ch=='/'){
            while(!ops.isEmpty() && ops.peek()!='(' && precedence(ch)<=precedence(ops.peek())){
                char op=ops.pop();
                String prev2=prefix.pop();
                String prev1=prefix.pop();
                prefix.push(op+prev1+prev2);
            } 
            ops.push(ch);
        }
    }
    while(!ops.isEmpty()){
        char op=ops.pop();
                String prev2=prefix.pop();
                String prev1=prefix.pop();
                prefix.push(op+prev1+prev2);
    }
    System.out.println(prefix.pop());
 }
 public static int precedence(char ch){
     if(ch=='+'||ch=='-'){
         return 1;
     }
     else
        return 2;
 }
}
