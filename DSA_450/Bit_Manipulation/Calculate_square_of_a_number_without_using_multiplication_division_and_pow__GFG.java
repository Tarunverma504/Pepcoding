/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Bit_Manipulation;

/**
 *
 * @author Mind_Coder
 */
/*
Given an integer n, calculate the square of a number without using *, / and pow(). 

Examples : 

Input: n = 5
Output: 25

Input: 7
Output: 49

Input: n = 12
Output: 144
*/
public class Calculate_square_of_a_number_without_using_multiplication_division_and_pow__GFG {
     public static int square(int n)
    {
 
        // handle negative input
        if (n < 0)
            n = -n;
 
        // Initialize result
        int res = n;
 
        // Add n to res n-1 times
        for (int i = 1; i < n; i++)
            res += n;
 
        return res;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        for (int n = 1; n <= 5; n++)
            System.out.println("n = " + n
                               + ", n^2 = " + square(n));
    }
}
