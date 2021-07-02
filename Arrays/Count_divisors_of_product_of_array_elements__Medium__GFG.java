/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mind_Coder
 */
/*

Given an array with N elements, the task is to find the count of factors of a number X which is product of all array elements.
 

Example 1:

Input:
N = 3
Arr[] = {2, 4, 6}
Output:
10
Explanation:
2 * 4 * 6 = 48, the factors of 48 are 
1, 2, 3, 4, 6, 8, 12, 16, 24, 48
whose count is 10.
 

Example 2:

Input:
N = 3
Arr[] = {3, 5, 7}
Output:
8
Explanation:
3 * 5 * 7 = 105, the factors of 105 are 
1, 3, 5, 7, 15, 21, 35, 105 whose count is 8.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function countDivisorsMult() which takes the array A[] and its size N as inputs and returns the count of factors of X.

 

Expected Time Complexity: O(N. sqrt(N))
Expected Auxiliary Space: O(N)

 

Constraints:
2<=N<=102
1<=Arr[i]<=102

*/
import java.util.*;
public class Count_divisors_of_product_of_array_elements__Medium__GFG {
    /*
    Hint :---------------------------------------------------------------
        Avoid overflow
        1. Find maximum element in array
        1. Find prime numbers smaller than the maximum element
        3. Find the number of overall occurrences of each prime factor in whole array by traversing all array elements and finding their prime factors. We use hashing to count occurrences.
        4. Let the counts of occurrences of prime factors be a1, a2, …aK, if we have K distinct prime factors, then the answer will be: (a1+1)(a2+1)(…)*(aK+1).


    */
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(countDivisorsMult(a,n));
    }
    public static long countDivisorsMult(long arr[], long n)
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        long count=1;
        for(int i=0;i<arr.length;i++){
            
            for(int j=2;j<=arr[i];j++){
                while(arr[i]%j==0){
                    arr[i]=arr[i]/j;
                    int freq=h.get(j)==null?1:h.get(j)+1;
                    h.put(j,freq);
                }
            }
        }
        
        for(Map.Entry m:h.entrySet()){
            if((int)m.getValue()>0){
                count=count*((int) m.getValue()+1);
            }
        }
        return count;
    }
}
