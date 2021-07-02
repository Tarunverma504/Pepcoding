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
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..
Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9
Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24

*/
import java.util.*;
public class Spiral_Display {
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
        System.out.println("output:-");
        int m=0,n=0;
        while(m<r&& n<c){
            //left row
            for(int i=m;i<r;i++){
                System.out.println(arr[i][n]);
            }
            n++;
            //bottom row
            
            for(int i=n;i<c;i++){
                System.out.println(arr[r-1][i]);
            }
            r--;
            //right row
            
            if(n<c){
                for(int i=r-1;i>=m;i--){
                    System.out.println(arr[i][c-1]);
                }
                
            }
            c--;
            //top row
            
            if(m<r){
                for(int i=c-1;i>=n;i--){
                System.out.println(arr[m][i]);
                }
               
            }
             m++;
            
            
        }
            
    }
    
}
