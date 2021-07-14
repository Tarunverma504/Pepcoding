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
public class First_Index {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
            return -1;
        if(arr[idx]==x)
            return idx;
        else{
            int index=firstIndex(arr,idx+1,x);
            return index;
        }
    }
}
