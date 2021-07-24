/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CB;

/**
 *
 * @author Mind_Coder
 */

/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.

Input Format
A single String S

Constraints
1 < = length of String < = 1000

Output Format
The compressed String.

Sample Input
aaabbccds
Sample Output
a3b2c2d1s1
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice and 'd and 's' occurred only once.
*/

import java.util.*;
public class String_Compression__CB {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Stack<Character> stack=new Stack<Character>();
		//String ans="";
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(stack.isEmpty())
				stack.push(str.charAt(i));
			else{
				if(stack.peek()==str.charAt(i))
					stack.push(str.charAt(i));
				else{
					ans.append(stack.peek());
					ans.append(stack.size());
					//ans=ans+stack.peek()+stack.size();
					stack.clear();
					stack.push(str.charAt(i));
				}
			}
		}
		//ans=ans+stack.peek()+stack.size();
		ans.append(stack.peek());
		ans.append(stack.size());
		System.out.println(ans.toString());
    }
}
