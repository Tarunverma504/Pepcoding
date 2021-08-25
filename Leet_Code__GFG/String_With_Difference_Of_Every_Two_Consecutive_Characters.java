/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */
/*

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
Input Format
A String
Output Format
A String

Constraints
1 <= length of string <= 1000
Sample Input
pepCODinG
Sample Output
p-11e11p-45C12O-11D37i5n-39G

*/
import java.util.*;
public class String_With_Difference_Of_Every_Two_Consecutive_Characters {
    public static String solution(String str){
		// write your code here
		String s=str.charAt(0)+"";
		int num;
		for(int i=1;i<str.length();i++){
		    num=str.charAt(i)-str.charAt(i-1);
		    s=s+num+str.charAt(i);
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
}
