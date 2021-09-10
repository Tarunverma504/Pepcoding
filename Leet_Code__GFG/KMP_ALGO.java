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
Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m.

Examples:

Input:  txt[] = "THIS IS A TEST TEXT"
        pat[] = "TEST"
Output: Pattern found at index 10

Input:  txt[] =  "AABAACAADAABAABA"
        pat[] =  "AABA"
Output: Pattern found at index 0
        Pattern found at index 9
        Pattern found at index 12

*/

//  https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
import java.util.*;
public class KMP_ALGO {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Kmp_Search(str1,str2);
    }
    public static void Kmp_Search(String s,String p){
        int lps[]=new int[p.length()];
        lps[0]=0;
        generate_lps(p,lps);
        int i=0;
        int j=0;
        while(i<s.length()){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                else
                       i++;
            }
            if(j==p.length()){
                System.out.println("Found pattern at index " + (i - j));
            }
        }
        
    }
    
    public static void generate_lps(String p,int lps[]){
        int i=1;
        int len=0;
        while(i<p.length()){
            if(p.charAt(i)==p.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }
}
