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

Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
str = 123
Output: 123

Example 2:

Input:
str = 21a
Output: -1
Explanation: Output is -1 as all
characters are not digit only.
Your Task:
Complete the function atoi() which takes a string as input parameter and returns integer value of it. if the input string is not a numerical string then returns 1..


Expected Time Complexity: O(|S|), |S| = length of string S.
Expected Auxiliary Space: O(1)

Constraints:
1<=length of S<=10
*/
public class Implement_Atoi__MEDIUM__GFG {
    public static void main(String [] arg){
        /*
        Question:-" https://practice.geeksforgeeks.org/problems/implement-atoi/1/?category[]=Strings&category[]=Strings&difficulty[]=1&page=1&sortBy=submissions&query=category[]Stringsdifficulty[]1page1sortBysubmissionscategory[]Strings# "
        */
    }
    int atoi(String str)
    {
        int num=0;
        int p=0;
        int flag=0;
        if(str.charAt(0)=='-')
        {
            str=str.substring(1);
            flag=1;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                num+=Math.pow(10,p)*(str.charAt(i)-'0');
                p++;
            }
            else
            {
                return -1;
            }
        }
        if(flag==1)
        {
        return 0-num;
        }
        else
        {
            return num;
        }
        
    }
}
