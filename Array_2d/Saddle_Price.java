/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_2d;

/**
 *
 * @author Mind_Coder
 */

/*

1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output Format
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output
41

*/
import java.util.*;
public class Saddle_Price {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for(c=0;c<n;c++){
            int r = getMax(arr,c,n);
            int num=arr[r][c];
            boolean result=checkMin(arr,r,c,num,n);
            if(result==true){
                System.out.println(arr[r][c]);
                break;
            }
            
        }
        if(c==n){
            System.out.println("Invalid input");
        }
    }
    
    public static int getMax(int arr[][],int c,int n){
        int max=0,index=0;
        for(int i=0;i<n;i++){
            if(arr[i][c]>max){
                index=i;
                max=arr[i][c];
            }
        }
        return index;
    }
    
    public static boolean checkMin(int arr[][],int r,int c,int num,int n){
        int min=0;
        for(int i=0;i<n;i++){
            if(arr[r][i]<num && i!=c){
                return false;
            }
        }
        return true;
    }
}
