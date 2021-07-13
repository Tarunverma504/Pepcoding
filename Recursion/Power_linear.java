/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Mind_Coder
 */

import java.util.*;
public class Power_linear {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0)
        return 1;
        
        return x*power(x,n-1);
    }
}
