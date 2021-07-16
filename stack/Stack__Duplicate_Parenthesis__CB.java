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
Check for duplicate parenthesis in an expression

Input Format
First line contains T, the number of testcases. Then each testcase contains a string in which we check for duplicacy.

Constraints
1<=T<=100 10<=len(str)<=1000

Output Format
For each testcase print "Duplicate Found" if we have duplicacy otherwise print "No Duplicates Found" if there are no duplicates.

Sample Input
2
(((a+(b))+(c+d)))
((a+b)+(c+d))
Sample Output
Duplicate Found 
No Duplicates Found 
*/

import java.util.*;
public class Stack__Duplicate_Parenthesis__CB {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=0;i<x;i++){
			String s=sc.nextLine();
			if(checkDuplicate(s)==false){
				System.out.println("Duplicate Found");
			}
			else{
				System.out.println("No Duplicates Found");
			}
		}
    }

	public static boolean checkDuplicate(String str){
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=')'){
				stack.push(str.charAt(i));
			}
				
			else{
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
		}


		return false;
	}
}
