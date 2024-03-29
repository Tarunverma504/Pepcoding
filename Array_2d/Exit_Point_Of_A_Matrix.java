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

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
row
col (of the point of exit)

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
e1, e2, .. n * m elements belongs to the set (0, 1)
Sample Input
4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0
Sample Output
1
3
*/
import java.util.*;
public class Exit_Point_Of_A_Matrix {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        int i=0,j=0;
        int d=0; //e-0,s-1,w-2,n-3
        
        while(true){
            d=(d+arr[i][j])%4;
            if(d==0){
                j++;
            }
            else if(d==1){
                i++;
            }
            else if(d==2){
                j--;
            }
            else if(d==3){
                i--;
            }
            
            if(i<0){i++;
                break;}
            else if(j<0){
                j++;
                break;}
            else if(i==arr.length){
                i--;
                break;}
            else if(j==arr[0].length){j--;
                break;}
        }
        System.out.println(i);
        System.out.println(j);
    }
}
