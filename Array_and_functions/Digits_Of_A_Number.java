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

1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number

Constraints
1 <= n < 10^9
Sample Input
65784383
Sample Output
6
5
7
8
4
3
8
3
*/

import java.util.*;
public class Digits_Of_A_Number {
    public static void main(String[] args) {
      // write your code here 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c= count(n);
      c= (int)Math.pow(10,c);
      
      
      
      while(c>0){
          int temp=n/c;
          n=n%c;
          c=c/10;
          System.out.println(temp);
      }
     }
     
     
     public static int count(int n){
         int i=0;
         while(n>0){
             n=n/10;
             i++;
         }
         return i-1;
     }
}
