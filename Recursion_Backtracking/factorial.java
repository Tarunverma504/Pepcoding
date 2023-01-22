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
public class factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
        
    }

    public static int factorial(int n){
        if(n==1)
        return 1;
        return n*factorial(n-1);
    }
}
