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
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000

Output Format
String

Sample Input
aabccba
Sample Output
abcba
Explanation
For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.

After removing all of the consecutive occurences, the Final ans will be : - "abcba".
*/
import java.util.*;
public class Strings_Remove_Duplicates__cb {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=str.charAt(0)+"";
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(i-1))
				res=res+str.charAt(i);
		}
		System.out.println(res);
    }
}
