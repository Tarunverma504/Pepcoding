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
Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
E.g. for “abexexdexed” return “abeedeedxxx”.
Print the value returned

Input Format
Single line input containing a string

Constraints
Length of string <= 1000

Output Format
Single line displaying the string with all x's moved at the end

Sample Input
axbxc
Sample Output
abcxx
Explanation
All x's are moved to the end of string while the order of remaining characters remain the same.
*/
import java.util.*;
public class Move_All_X_at_End {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder s=new StringBuilder();
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='x')
				s.append(str.charAt(i));
			else
				count++;
		}
		for(int i=0;i<count;i++){
			s.append('x');
		}
		System.out.println(s.toString());
    }
}
