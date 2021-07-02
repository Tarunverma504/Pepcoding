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
2. You have to print all permutations of the given string iteratively.
Input Format
A String
Output Format
All permutations of the given string(one in a line). 

Constraints
1 <= length of string <= 15
Sample Input
abc
Sample Output
abc
bac
cab
acb
bca
cba
*/

import java.util.*;
public class Print_All_Permutations_Of_A_String_Iteratively {
    public static void solution(String str){
		// write your code here
		int n=fact(str.length());
		
		for(int i=0;i<n;i++){
		    StringBuilder sb=new StringBuilder(str);
		    int x=str.length();
		    int temp=i;
		    while(x>0){
		        int q=temp/x;
		        int r=temp%x;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		        x--;
		    }
		    System.out.println();
		}
		
	}
	
	public static int fact(int n){
	    if(n==1){
	        return 1;
	    }
	    return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
