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

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subset]
..

Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3
Sample Input
3
10
20
30
Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	


All subsets
*/
import java.util.*;
public class Subsets_Of_Array {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:- ");
        int n=sc.nextInt();
        System.out.println("Enter Elements of array :-");
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        int limit=(int)Math.pow(2, n);
        for(int i=0;i<limit;i++){
            int temp=i;
            String str="";
            for(int j=arr.length-1;j>=0;j--){
                int r=temp%2; // convert index to binary;
                temp=temp/2; // convert index to binary;
                if(r==0){
                    str="-"+str;  //if index  bit is  0 add -
                }
                else{
                    str=arr[j]+str;  //if index  bit is not 0 add element
                }
            }
            System.out.println(str);
        }
    }
    
}
