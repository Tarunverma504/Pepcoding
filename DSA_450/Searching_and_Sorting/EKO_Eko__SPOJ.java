/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Searching_and_Sorting;

/**
 *
 * @author Mind_Coder
 */

import java.util.*;
public class EKO_Eko__SPOJ {
    public static boolean isValid(int []arr,int n,int amt,int k){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>k)
                sum+=(arr[i]-k);
            if(sum>=amt)
                return true;
        }
        return false;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int amt=sc.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
              max=Math.max(arr[i],max);
        }
        int l=0;
        int r=max;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(isValid(arr,n,amt,mid)){
                ans=mid;
                
                l=mid+1;
            }
            else
                r=mid-1;
        }
        System.out.println(ans);
    }
}
