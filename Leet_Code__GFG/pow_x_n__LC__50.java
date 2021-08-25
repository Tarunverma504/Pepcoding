/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */

/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
-104 <= xn <= 104
*/
import java.util.*;
public class pow_x_n__LC__50 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/powx-n/
        */
    }
    class Solution {
        public double myPow(double x, int n) {
            double result=getResult(x,n);
            if(n<0){
                return 1/result;
            }
            return result;
        }

        public  double getResult(double x,int n){
            if(n==0)
                return 1;
            else if(n==1)
                return x;
            double temp=getResult(x,n/2);
            if(n%2==0)
                return temp*temp;
            else
                return x*temp*temp;
        }
    }
}
