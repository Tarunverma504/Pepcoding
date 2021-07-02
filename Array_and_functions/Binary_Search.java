/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_and_functions;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
public class Binary_Search {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:- ");
        int n=sc.nextInt();
        System.out.println("Enter Elements of array in sorted order:-");
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Number to search:- ");
        int x=sc.nextInt();
        int a=search(arr,x);
        System.out.println(a);
    }
    
    
    public static int search(int arr[],int x){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int m=(l+h)/2;
            if(arr[m]<x){
                l=m+1;
            }
            else if(arr[m]>x){
                h=m-1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}
