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
Take the following as input.

A character (ch) Write a function that returns ‘U’, if it is uppercase; ‘L’ if it is lowercase and ‘I’ otherwise. Print the value returned.

Input Format
Character (ch)

Constraints
No constraints

Output Format
'L' (if ch is lower-case) 'U' (if ch is upper-case) 'I' (otherwise)

Sample Input
s
Sample Output
L
Explanation
Anyone can Do it using Ascii codes. I dare you - "Try to not use ascii codes." ;)
*/
import java.util.*;
public class Character_Type__cb {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=s.charAt(0);
		if(Character.isUpperCase(c)){
			System.out.println("U");
		}
		else if(Character.isLowerCase(c)){
			System.out.println("L");
		}
		else
			System.out.println("I");

    }
}
