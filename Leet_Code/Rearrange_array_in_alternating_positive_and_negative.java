/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code;

/**
 *
 * @author Mind_Coder
 */

/*
import java.util.*;
public class Rearrange_array_in_alternating_positive_and_negative {
    public static void reverse(int arr[],int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(flag==true)
                break;
            if(i%2==0){
                if(arr[i]>=0){
                    int j=i;
                    while(j<arr.length){
                        if(arr[j]<0)
                            break;
                        j++;
                    }
                    if(j!=arr.length){
                        reverse(arr,i,j-1);
                        reverse(arr,i,j);
                    }
                    else{
                        flag=true;
                    }
                }
            }
            else{
                if(arr[i]<0){
                    int j=i;
                    while(j<arr.length){
                        if(arr[i]>0)
                            break;
                        j++;
                    }
                    if(j!=arr.length){
                        reverse(arr,i,j-1);
                        reverse(arr,i,j);
                    }
                    else{
                        flag=true;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
*/
import java.util.*;
public class Rearrange_array_in_alternating_positive_and_negative {
    public static void reverse(int arr[],int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(flag==true)
                break;
            if(i%2==0){
                if(arr[i]>=0){
                    int j=i;
                    while(j<arr.length){
                        if(arr[j]<0)
                            break;
                        j++;
                    }
                    if(j!=arr.length){
                        reverse(arr,i,j-1);
                        reverse(arr,i,j);
                    }
                    else{
                        flag=true;
                    }
                }
            }
            else{
                if(arr[i]<0){
                    int j=i;
                    while(j<arr.length){
                        if(arr[i]>0)
                            break;
                        j++;
                    }
                    if(j!=arr.length){
                        reverse(arr,i,j-1);
                        reverse(arr,i,j);
                    }
                    else{
                        flag=true;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}

