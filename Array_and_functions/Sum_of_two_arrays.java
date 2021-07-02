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
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max - min

Constraints
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9
Sample Input
6
15
30
40
4
11
9
Sample Output
36

*/
import java.util.*;
public class Sum_of_two_arrays {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the first Array");
        int n1=sc.nextInt();
        System.out.print("Enter size of the second Array");
        int n2=sc.nextInt();
        System.out.println("Enter Elements of the first Array:-");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Elements of the second Array:-");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] sum = new int[n1>n2?n1:n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        int d=0,c=0;
        while(k>=0){
            d=c;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c=d/10;
            sum[k]=d%10;
            i--;
            j--;
            k--;   
        }
        if(c!=0){
        System.out.println(c);
        }
        for(int value: sum){
            System.out.println(value);
        }
        
    }
    
}
