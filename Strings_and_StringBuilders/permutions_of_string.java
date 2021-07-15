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

import java.util.*;
public class permutions_of_string {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str=sc.nextLine();
        System.out.println("Permutation of string are :-");
        sol(str);
    }
    public static void sol(String str){
        int n=str.length();
        int f=fac(n);
        for(int i=0;i<f;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=n;div>=1;div--){
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
    }
    public static int fac(int n){
        if(n==1)
            return 1;
        return n*fac(n-1);
    }
}
