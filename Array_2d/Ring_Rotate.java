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

You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r
Output Format
output is handled by display function

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9
Sample Input
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3
Sample Output
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57s
*/
import java.util.*;
public class Ring_Rotate {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        s=s-1;
        int r=sc.nextInt();
        int minr=s;
        int minc=s;
        int maxr=arr.length-1-s;
        int maxc=arr[0].length-1-s;
        int oned[]=getOned(arr,minr,maxr,minc,maxc);
        r=r%oned.length;
        if(r<=0){
            r=r+oned.length;
        }
        reverse(oned,0,oned.length-1-r);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
        putBack(arr,oned,minr,maxr,minc,maxc);
        display(arr);
    }
    public static int[] getOned(int[][] arr,int minr,int maxr,int minc,int maxc){
        int r=2*(maxc-minc+1)+2*(maxr-minr+1)-4;
        int []brr=new int[r];
        int k=0;
        for(int i=minr;i<=maxr;i++){ //left row
            brr[k]=arr[i][minc];
            k++;
        }
        minc++;
        for(int i=minc;i<=maxc;i++){  // bottom row
            brr[k]=arr[maxr][i];
            k++;
        }
        maxr--;
        for(int i=maxr;i>=minr;i--){ //right row
            brr[k]=arr[i][maxc];
            k++;
        }
        maxc--;
        for(int i=maxc;i>=minc;i--){  //top row
            brr[k]=arr[minr][i];
            k++;
        }
        return brr;
    }
    
    public static void reverse(int []arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    
    public static void putBack(int[][] arr,int[] brr,int minr,int maxr,int minc,int maxc){
        int k=0;
        for(int i=minr;i<=maxr;i++){ //left row
        arr[i][minc]=brr[k];
            k++;
        }
        minc++;
        for(int i=minc;i<=maxc;i++){  // bottom row
            arr[maxr][i]=brr[k];
            k++;
        }
        maxr--;
        for(int i=maxr;i>=minr;i--){ //right row
            arr[i][maxc]=brr[k];
            k++;
        }
        maxc--;
        for(int i=maxc;i>=minc;i--){  //top row
            arr[minr][i]=brr[k];
            k++;
        }
        
        
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
