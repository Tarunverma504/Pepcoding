/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Heap;

/**
 *
 * @author Mind_Coder
 */
/*
    An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

 

Example 1:

Input: n = 10
Output: 12
Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 

Constraints:

1 <= n <= 1690
*/
import java.util.*;
public class Ugly_NumberII_LC_264 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/ugly-number-ii/description/?envType=list&envId=e9sr11es
        */
    }
    class Solution {
        public int nthUglyNumber(int n) {
            PriorityQueue<Long> pq = new PriorityQueue<Long>();
            pq.add((long)1);
            n = n-1;
            while(n>0){
                long a = pq.poll();
                if(!pq.contains(a*2))
                    pq.add(a*2);
                if(!pq.contains(a*3))
                    pq.add(a*3);
                if(!pq.contains(a*5))
                    pq.add(a*5);
                n--;
            }
            long ans = pq.poll();
            return (int)ans;
        }
    }
}
