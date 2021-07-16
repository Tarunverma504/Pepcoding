/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

/**
 *
 * @author Mind_Coder
 */

/*
Take as input N, an odd number (>=5) . Print the following pattern as given below for N = 7.

*  ****
*  *
*  *
*******
   *  *
   *  *
****  *
Input Format
Enter value of N ( >=5 )

Constraints
5 <= N <= 99

Output Format
Print the required pattern.

Sample Input
7
Sample Output
*  ****
*  *
*  *
*******
   *  *
   *  *
****  *
Explanation
Catch the pattern for the corresponding input and print it accordingly.
*/
import java.util.*;
public class Ganesha_Pattern {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n/2;i++){
			for(int j=0;j<n;j++){
				if(j==0 || j==n/2){
					System.out.print("*");
				}
				else if(j>0 && j<n/2){
					System.out.print(" ");
				}
				// else if(j>n/2 && i==0){
				// 	System.out.print("*");
				// }
				else{
					if(i==0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i=n/2-1;i>=0;i--){
			for(int j=0;j<n;j++){
				if(j==n/2 || j==n-1)
					System.out.print("*");
				else if(j>n/2 && j<n-1)
					System.out.print(" ");
				else{
					if(i==0)
					System.out.print("*");
					else
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}
