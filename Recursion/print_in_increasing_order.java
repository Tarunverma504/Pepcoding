package Recursion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */

import java.util.*;
public class print_in_increasing_order {
   public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n==0)
        return ;
        printIncreasing(n-1);
        System.out.println(n);
    }
}
