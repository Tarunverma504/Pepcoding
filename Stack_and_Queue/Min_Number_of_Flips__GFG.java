package Stack_and_Queue;

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
Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.

Example 1:

Input:
S = "001"
Output: 1
Explanation: We can flip the 0th bit to 1
to have "101".
â€‹Example 2:

Input: 
S = "0001010111"
Output: 2
Explanation: We can flip the 1st and 8th bit
to have "0101010101".

Your Task:
You don't need to read input or print anything. Your task is to complete the function minFlips() which takes the string S as input and returns the minimum number of flips required.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
*/
public class Min_Number_of_Flips__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/min-number-of-flips3210/1
        */
    }
    static class Solution {
        public int minFlips(String S) {
           // Code here
            int even=0;   //even=1 odd=0
            int odd=0;  //even =0 odd=1;
            for(int i=0;i<S.length();i++){
                if(i%2==0 && S.charAt(i)=='1')  odd++;
                else if(i%2!=0 && S.charAt(i)=='0') odd++;
                if(i%2==0 && S.charAt(i)=='0') even++;
                else if(i%2!=0 && S.charAt(i)=='1') even++;
            }
            return Math.min(odd,even);
            //return 0;
        }
    }
}
