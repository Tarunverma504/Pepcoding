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
Given an integer n, write a function that returns count of trailing zeroes in n!.



Input Format
A single integer N.

Constraints
1 <= N <= 10^9

Output Format
A single integer denoting the count of trailing zeroes in N!

Sample Input
5
Sample Output
1
Explanation
Factorial of 5 is 120 which has one trailing 0.
*/
import java.util.*;
public class Trailing_zeroes {
    /*
    Hint:- "one tens becomes with 2*5 ,5 is in less number than 2 so divide  5 until quotient will become smaller thanor equal to 1
    */
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>1){
			count=count+n/5;
			n=n/5;
		}
		System.out.println(count);
    }
}
