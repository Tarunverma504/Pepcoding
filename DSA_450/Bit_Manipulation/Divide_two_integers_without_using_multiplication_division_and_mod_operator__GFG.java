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
public class Divide_two_integers_without_using_multiplication_division_and_mod_operator__GFG {
     
    // Function to divide a by b and
    // return floor value it
    static int divide(int dividend, int divisor)
    {
         
        // Calculate sign of divisor i.e.,
        // sign will be negative only iff
        // either one of them is negative
        // otherwise it will be positive
        int sign = ((dividend < 0) ^
                   (divisor < 0)) ? -1 : 1;
     
        // Update both divisor and
        // dividend positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
     
        // Initialize the quotient
        int quotient = 0;
         
        while (dividend >= divisor)
        {
            dividend -= divisor;
            ++quotient;
        }
        //if the sign value computed earlier is -1 then negate the value of quotient
        if(sign==-1) quotient=-quotient;
       
        return quotient;
    }   
     
    public static void main (String[] args)
    {
        int a = 10;
        int b = 3;
         
        System.out.println(divide(a, b));
         
        a = 43;
        b = -8;
         
        System.out.println(divide(a, b));
    }
}
