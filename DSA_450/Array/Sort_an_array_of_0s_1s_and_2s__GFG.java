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
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 10^6
*/
public class Sort_an_array_of_0s_1s_and_2s__GFG {
    public static void main(String []arg){
        /*
        https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
        */
    }
    static class Solution
    {
        public static void sort012(int a[], int n)
        {
            // code here 
            int i=0,j=0,k=n-1;
        while(i<=k){
            if(a[i]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }else if(a[i]==1){
                i++;

            }else{
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
                k--;
            }
        }
        }
    }
}
