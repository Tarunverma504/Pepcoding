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
public class Target_Sum_Pair_1 {
    public static int[] mergerArray(int[] fsh,int[] ssh){
        int i=0,j=0,k=0;
        int brr[] = new int[fsh.length+ssh.length];
        while(i<fsh.length && j<ssh.length){
            if(fsh[i]<ssh[j]){
                brr[k]=fsh[i];
                i++;
                k++;
            }
            else if(fsh[i]>ssh[j]){
                brr[k]=ssh[j];
                j++;
                k++;
            }
        }
        while(i<fsh.length){
            brr[k]=fsh[i];
            i++;
            k++;
        }
        while(j<ssh.length){
            brr[k]=ssh[j];
            j++;
            k++;
        }
        return brr;
    }
    public static int[] mergeSort(int[] arr,int l,int r){
        if(l==r){
            int []b=new int[1];
            b[0]=arr[l];
            return b;
        }
        int mid=(l+r)/2;
        int fsh[]=mergeSort(arr,l,mid);
        int ssh[]=mergeSort(arr,mid+1,r);
        int fsa[]=mergerArray(fsh,ssh);
        return fsa;
    }
    public static void targetSumPair(int[] arr, int target){
    arr=mergeSort(arr,0,arr.length-1);
    int l=0;
    int r=arr.length-1;
    while(l<r){
        if(arr[l]+arr[r]<target){
            l++;
        }else if(arr[l] + arr[r]>target){
            r--;
        }else{
            System.out.println(arr[l]+", "+arr[r]);
            l++;
            r--;
        }
    }
//    for(int i=0;i<arr.length;i++){
//        System.out.println(arr[i]);
//    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }
}
