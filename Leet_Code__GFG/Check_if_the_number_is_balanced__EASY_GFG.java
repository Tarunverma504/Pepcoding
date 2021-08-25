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
Given an integer N which has odd number of digits, find whether the given number is a balanced or not.

An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.

Example 1:

Input:
N = 1234006
Output: 1 
Explanation: Total number of digits in
N = 7. Middle digit is 4. LHS = 1+2+3 = 6
and RHS = 0+0+6 = 6. LHS is equal to RHS. 

Example 2:

Input:
N = 12345
Output: 0
Explanation: LHS = 1+2 = 3 and RHS = 4+5
= 9. LHS and RHS are not equal.

Your Task:  
You dont need to read input or print anything. Complete the function balancedNumber() which takes string N as input parameter and returns a boolean value denoting if N is balanced or not.
Note: The driver code prints 1 if the returned value is true otherwise 0


Expected Time Complexity: O(number of digits in N)
Expected Auxiliary Space: O(1)


Constraints:
1<= N <= 10100
N will always have odd number of digits.
Since N can be very large, it is given as a string. 
*/
public class Check_if_the_number_is_balanced__EASY_GFG {
    public static void main(String[] arg){
        /*
        
            https://practice.geeksforgeeks.org/problems/check-if-the-number-is-balanced3014/1/?category[]=Strings&category[]=Strings&difficulty[]=0&page=1&query=category[]Stringsdifficulty[]0page1category[]Strings#
        */
    }
    Boolean balancedNumber(String N)
    {
        // your code here 
        int h=N.length()-1;
        int l=0;
        int  m=l+h/2;
        int sum1=0;
        int sum2=0;
        int i=0,j=m+1;
        while(i<m){
            sum1=sum1+(N.charAt(i)-'0');
            i++;
        }
        while(j<=h){
            sum2=sum2+(N.charAt(j)-'0');
            j++;
        }
        if(sum1== sum2){
            return true;
        }
        else{
            return false;
        }
    }
}
