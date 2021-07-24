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
One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.

Input Format
A single line contains the string.

Constraints
|S|<=1000

Output Format
Print words present in the string, in the order in which it appears in the string.

Sample Input
IAmACompetitiveProgrammer
Sample Output
I
Am
A
Competitive
Programmer
Explanation
There are 5 words in the string.
*/
import java.util.*;
public class Can_You_Read_This__Cb {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int start=0;
		int end=0;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
				end=i;
				//System.out.println(str.charAt(start)+" "+str.charAt(end));
				System.out.println(str.substring(start,end));
				start=i;
			}
			
			
		}
		System.out.println(str.substring(end,str.length()));
    }
}
