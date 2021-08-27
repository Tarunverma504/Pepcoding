/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Array;

/**
 *
 * @author Mind_Coder
 */
/*
There are 2 sorted arrays A and B of size n each. Write an algorithm to find the median of the array obtained after merging the above 2 arrays(i.e. array of length 2n). The complexity should be O(log(n)). 

median-of-two-arrays

Note: Since the size of the set for which we are looking for the median is even (2n), we need to take the average of the middle two numbers and return the floor of the average.
Method 1 (Simply count while Merging) 
Use the merge procedure of merge sort. Keep track of count while comparing elements of two arrays. If count becomes n(For 2n elements), we have reached the median. Take the average of the elements at indexes n-1 and n in the merged array. See the below implementation. 
*/
import Leet_Code__GFG.*;
import java.util.*;
public class Median_of_two_sorted_arrays_of_same_size__GFG {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            brr[i]=sc.nextInt();
        
        int i=0,j=0,m1=0,m2=0;
        for(int c=0;c<=n;c++){
            if(i==n){
                m1=m2;
                m2=brr[0];
                break;
            }
            else if(j==n){
                m1=m2;
                m2=arr[0];
                break;
            }
            else if(arr[i]<=brr[j]){
                m1=m2;
                m2=arr[i];
                i++;
            }
            else{
                m1=m2;
                m2=brr[j];
                j++;
            }
            
        }
        System.out.println((m1+m2)/2);
    }
}
