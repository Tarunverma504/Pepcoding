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

Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

 

Example 1:

Input : 
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output : 
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6
 
Example 2:
Input : 
N = 8
A[] = {12, -1, -7, 8, -15, 30, 16, 28}
K = 3
Output :
-1 -1 -7 -15 -15 0 
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function printFirstNegativeInteger() which takes the array A[], its size N and an integer K as inputs and returns the first negative number in every window of size K starting from the first till the end. If a window does not contain a negative integer , then return 0 for that window.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(K)

Constraints:
1 <= N <= 105
1 <= A[i] <= 105
1 <= K <= N

*/
public class First_negative_integer_in_every_window_of_size_k__EASY__GFG {
    /*
    Hint------------------------------------------------------
    take size of array N-K+1;
    */
    public static void main(String[] arg){
        /*
            https://practice.geeksforgeeks.org/viewSol.php?subId=649750a9e7ffa677a80e979a650bbe83&pid=703375&user=vermatarun4305
        */
    }
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long []l=new long[N-K+1];
        int x=0;
        for(int i=0;i<A.length;i++){
            int flag=0;
            int end=i+K;
            int start=i;
            
            if(end>A.length){
                break;
            }
            
            for(int j=start;j<end;j++){
                if(A[j]<0){
                    l[x]=A[j];
                    x++;
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                l[x]=0;
                x++;
            }
        }
        
        return l;
    }
}
