/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Backtracking;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
public class Print_in_decreasing_order {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NUmber :-");
        int n=sc.nextInt();
        pr(n);
    }
    public static void pr(int n){
        if(n==0)
            return;
        System.out.println(n+" ");
        pr(n-1);
    }
}
