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
2. You have to toggle the case of every character of the given string.
Input Format
A String
Output Format
A String


Constraints
1 <= length of string <= 1000
Sample Input
pepCODinG
Sample Output
PEPcodINg

*/

import java.util.*;
public class Toggle_Case {
    public static String toggleCase(String str){   // p-a=P-A -> p=P-A+a;
		//write your code here
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<str.length();i++){
		    if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
		        char uch=(char)('A'+sb.charAt(i)-'a');
		        sb.setCharAt(i,uch);
		    }else if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
		        char lch=(char)('a'+sb.charAt(i)-'A');
		        sb.setCharAt(i,lch);
		    }
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
    
}
