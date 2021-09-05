package Leet_Code__GFG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1
*/
public class Valid_Perfect_Square__LC__367 {
    public static void main(String []arg){
        /*
        https://leetcode.com/problems/valid-perfect-square/
        */
    }
    static class Solution {
        public boolean isPerfectSquare(int num) {
            if(num==1)
                return true;
            long l=1;
            long r=num/2+1;
            while(l<=r){
                long mid=l+(r-l)/2;
                if(mid*mid==num){
                    return true;
                }
                else if(mid*mid<num)
                    l=mid+1;
                else
                    r=mid-1;
            }
            return false;
        }
    }
}
