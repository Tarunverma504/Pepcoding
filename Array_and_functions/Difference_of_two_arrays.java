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
public class Difference_of_two_arrays {
    public static void main(String[] arg){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the first Array:- ");
        int n1=sc.nextInt();
        System.out.print("Enter size of the second Array:- ");
        int n2=sc.nextInt();
        System.out.println("Enter Elements of the first Array:-");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Elements of the second Array:-");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        
        
        
        int[] diff = new int[n1];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
        int b=0;
        
        while(k>=0){
            
            int bval= j>=0?arr2[j]:0;
            int d=0;
            if(arr1[i]+b>=bval){
                d=arr1[i]+b-bval;
                b=0;
            }
            else{
                d=arr1[i]+10-bval;
                b=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int index=0;
        for(index=0;index<diff.length;index++){
            if(diff[index]!=0){
                break;
            }
        }
        for( i=index;i<diff.length;i++){
            System.out.print(diff[i]);
        }
    }
    
}
