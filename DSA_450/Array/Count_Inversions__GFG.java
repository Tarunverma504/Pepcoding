/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Array;

/**
 *
 * @author Mind_Coder
 */



import Leet_Code__GFG.*;
import java.util.*;
public class Count_Inversions__GFG {
    public static void main(String []agr){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println(count);
        
    }
    static long count=0;
    public static long[] merging(long []left,long []right){
        int i=0;
        int j=0;
        int k=0;
        long brr[]=new long[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                brr[k]=left[i];
                i++;
                k++;
            }
            else{
                count+=(left.length-i);
                brr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            brr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            brr[k]=right[j];
            j++;
            k++;
        }
        return brr;
        
    }
    public static long[] mergeSort(long arr[],int l,int r){
        if(l==r){
            long base[]=new long[1];
            base[0]=arr[l];
            return base;
        }
        int mid=(l+r)/2;
        long left[]=mergeSort(arr,l,mid);
        long right[]=mergeSort(arr,mid+1,r);
        long merge[]=merging(left,right);
        return merge;
    }
}
