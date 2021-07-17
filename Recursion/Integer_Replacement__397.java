/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Mind_Coder
 */

/*
Given a positive integer n, you can apply one of the following operations:

If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n - 1.
Return the minimum number of operations needed for n to become 1.

 

Example 1:

Input: n = 8
Output: 3
Explanation: 8 -> 4 -> 2 -> 1
Example 2:

Input: n = 7
Output: 4
Explanation: 7 -> 8 -> 4 -> 2 -> 1
or 7 -> 6 -> 3 -> 2 -> 1
Example 3:

Input: n = 4
Output: 2
 

Constraints:

1 <= n <= 231 - 1
*/
import java.util.*;
public class Integer_Replacement__397 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/integer-replacement/
        */
    }
    class Solution {
    public int integerReplacement(int n) {
        return ans(n);
    }
    public int ans(int n){
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else if(n%2==0)
			return 1+ans(n/2);
		else if(n==Integer.MAX_VALUE)
			return 32;
		else{
			return 1+Math.min(ans(n-1),ans(n+1));
		}
	}
    }
}
