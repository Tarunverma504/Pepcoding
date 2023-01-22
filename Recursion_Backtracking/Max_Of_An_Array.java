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
public class Max_Of_An_Array {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)
        return arr[idx];
        
        int max=maxOfArray(arr,idx+1);
        if(max>arr[idx])
            return max;
        return arr[idx]; 
    }
}
