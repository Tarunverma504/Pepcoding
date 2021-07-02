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


/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.

Input Format
A number n
n1
n2
.. n number of elements

Output Format
A bar chart of asteriks representing value of array a


Sample Input
5
3
1
0
7
5
Sample Output
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*

*/
import java.util.*;
public class BarChart {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of the Array:-");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements:-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        int max=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>=max){
               max=arr[i];
           }
        }
        
        
        for(int j=max;j>=1;j--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=j){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
