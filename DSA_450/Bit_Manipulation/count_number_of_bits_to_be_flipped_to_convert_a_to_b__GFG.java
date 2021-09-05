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
You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.
Example 2:

Input: A = 20, B = 25
Output: 3
Explanation:
A  = 10100
B  = 11001
As we can see, the bits of A that need 
to be flipped are 10100. If we flip 
these bits, we get 11001, which is B.

Your Task: The task is to complete the function countBitsFlip() that takes A and B as parameters and returns the count of the number of bits to be flipped to convert A to B.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ A, B ≤ 106
*/
import java.util.*;
public class count_number_of_bits_to_be_flipped_to_convert_a_to_b__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/bit-difference-1587115620/1
        */
    }
    static class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
        public static int countBitsFlip(int a, int b){

            // Your code here
            int count=0;
            while(a>0 || b>0){
                int a_bit=a&1;
                int b_bit=b&1;
                if(a_bit!=b_bit)
                    count++;
                a=a>>1;
                b=b>>1;
            }
            return count;

        }


    }
}
