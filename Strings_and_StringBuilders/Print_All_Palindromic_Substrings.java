/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_and_StringBuilders;

/**
 *
 * @author Mind_Coder
 */
/*

1. You are given a string. 
2. You have to print all palindromic substrings of the given string.
Input Format
A String
Output Format
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Constraints
1 <= length of string <= 500
Sample Input
abcc
Sample Output
a
b
c
cc
c
*/
import java.util.*;
public class Print_All_Palindromic_Substrings {
    public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        String ss=str.substring(i,j);
		        if(palidrom(ss)==true){
		           System.out.println(ss); 
		        }
		    }
		}
		
	}
	
	public static boolean palidrom(String s){
	    int l=0,r=s.length()-1;
	    while(l<r){
	        if(s.charAt(l)!=s.charAt(r)){
	            return false;
	        }
	        l++;
	        r--;
	    }
	    return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
