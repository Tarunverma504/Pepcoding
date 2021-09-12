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
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless. 
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true
Input Format
A string str
Output Format
true or false
Question Video

  COMMENTConstraints
0 <= str.length <= 100
Sample Input
(a + b) + ((c + d))
Sample Output
true
*/
import java.util.*;
public class Duplicate_Brackets {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(check(str));
    }
    public static boolean check(String str){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                if(stack.peek()=='('){
                    return true;
                }
                    
                else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        return false;
    }
}
