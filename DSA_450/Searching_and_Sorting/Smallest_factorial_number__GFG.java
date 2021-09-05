/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Searching_and_Sorting;

/**
 *
 * @author Mind_Coder
 */

/*
Given a number n. The task is to find the smallest number whose factorial contains at least n trailing zeroes.

Example 1:

Input:
n = 1
Output: 5
Explanation : 5! = 120 which has at
least 1 trailing 0.
Example 2:

Input:
n = 6
Output: 25
Explanation : 25! has at least
6 trailing 0.

User Task:
Complete the function findNum() which takes an integer N as input parameters, and returns the answer.

Expected Time Complexity: O(log2 N * log5 N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n <= 104
*/
public class Smallest_factorial_number__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/smallest-factorial-number5929/1
        */
    }
    class Solution
    {
        boolean check(int mid,int n){
            int temp=mid;
            int count=0;
            int f=5;
            while(f<=temp){
                count+=temp/f; // (x/5)+(x/25)+(x/125)
                f=f*5;

            }
            return (count>=n);

        }
        int findNum(int n)
        {
            // Complete this function
            if(n==1)
                return 5;
            int l=0;
            int r=5*n;
            while(l<r){
                int mid=(l+r)/2;
                if(check(mid,n))
                    r=mid;
                else
                    l=mid+1;

            }
            return l;

        }
    }
}
