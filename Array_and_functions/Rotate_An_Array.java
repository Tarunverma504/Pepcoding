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
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k.
Input Format
Input is managed for you
Output Format
Output is managed for you

Constraints
0 <= n < 10^4
-10^9 <= a[i], k <= 10^9
Sample Input
5
1
2
3
4
5
3
Sample Output
3 4 5 1 2

*/

import java.util.*;
public class Rotate_An_Array {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:- ");
        int n=sc.nextInt();
        System.out.println("Enter Elements of array:- ");
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the rotation number:- ");
        int k=sc.nextInt();
        k=k%arr.length;
        if(k<=0){
            k=k+arr.length;
        }
        
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
    
}
