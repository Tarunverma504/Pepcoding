/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
public class Merge_Two_Sorted_Arrays {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int arr[]=new int[a.length+b.length];
    int i=0,j=0,k=0;
    while(i<a.length&&j<b.length){
        if(a[i]<b[j]){
            arr[k]=a[i];
            i++;
            k++;
        }else{
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    while(i<a.length){
        arr[k]=a[i];
            i++;
            k++;
    }
    while(j<b.length){
        arr[k]=b[j];
            j++;
            k++;
    }
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }
}
