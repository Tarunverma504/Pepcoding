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
Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

Input Format
String

Constraints
Length of String should be between 2 to 1000.

Output Format
String

Sample Input
acb
Sample Output
a2c-1b
Explanation
For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.
*/
import java.util.*;
public class Strings_Difference_in_Ascii_Codes__CB {
     public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=str.charAt(0)+"";
		for(int i=1;i<str.length();i++){
			int diff=str.charAt(i)-str.charAt(i-1);
			ans=ans+diff+str.charAt(i);
		}
		System.out.println(ans);

    }
}
