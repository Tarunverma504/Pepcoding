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
3. You are required to calculate the inverse of array a.

For definition and constraints check this link
The only difference is the range of values is from 0 to n - 1, instead of 1 to n.
Input Format
Input is managed for you
Output Format
Output is managed for you

Constraints
0 <= n < 10^7
For more constraints check this
The only difference is the range of values is from 0 to n - 1, instead
of 1 to n
Sample Input
5
4
0
2
3
1
Sample Output
1
4
2
3
0
*/

import java.util.*;
public class Inverse_Of_An_Array {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:- ");
        int n=sc.nextInt();
        int x=n;
        System.out.println("Enter Elements between 0 and "+ --x+":-");
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        int inv[]=new int[n];
        for(int i=0;i<n;i++){
            int val=arr[i];
            inv[val]=i;
        }
        for(int value:inv){
            System.out.print(value+" ");
        }
        
    }
}
