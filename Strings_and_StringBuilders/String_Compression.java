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
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
Input Format
A String
Output Format
Two strings representing first compressed string and second compressed string respectively.


Constraints
1 <= length of string <= 1000
Sample Input
wwwwaaadexxxxxx
Sample Output
wadex
w4a3dex6

*/
import java.util.*;
public class String_Compression {
    public static String compression1(String str){
		// write your code here
		String word=str.charAt(0)+"";
		
		for(int i=1;i<str.length();i++){
		   char curr=str.charAt(i);
		   char prev=str.charAt(i-1);
		   if(curr!=prev){
		       word+=curr;
		   }
		}
		return word;
	}

	public static String compression2(String str){
		// write your code here
		String word=str.charAt(0)+"";
		int count=1;
		
		for(int i=1;i<str.length();i++){
		    char curr=str.charAt(i);
		    char prev=str.charAt(i-1);
		    if(curr==prev){
		        count++;
		    }else{
		        if(count>1){
		            word+=count;
		            count=1;
		        }
		        word+=curr;
		    }
		}
		if(count>1){
		    word+=count;
		    count=1;
		}
		return word;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}
