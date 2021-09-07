/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.String;

/**
 *
 * @author Mind_Coder
 */
/*
You are given a string S of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets. A string is considered balanced if it can be represented in the for S2[S1] where S1 and S2 are balanced strings. We can make an unbalanced string balanced by swapping adjacent characters. Calculate the minimum number of swaps necessary to make a string balanced.
Note - Strings S1 and S2 can be empty.

 

Example 1:

Input  : []][][
Output : 2
Explanation :
First swap: Position 3 and 4
[][]][
Second swap: Position 5 and 6
[][][]

 

Example 2:

Input : [[][]]
Output : 0 
Explanation:
String is already balanced.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function minimumNumberOfSwaps() which takes the string S and return minimum number of operations required to balance the bracket sequence.

 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

 

Constraints:

1<=|S|<=100000

 
*/
import java.util.*;
public class Minimum_Swaps_for_Bracket_Balancing__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/minimum-swaps-for-bracket-balancing2704/1
        */
    }
    static class Solution{
        static int minimumNumberOfSwaps(String str){
            // code here
            Vector<Integer> v=new Vector<Integer>();
            char s[]=str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(s[i]=='['){
                    v.add(i);
                }
            }

            int count=0;
            int ans=0;
            int p=0;
            for(int i=0;i<str.length();i++){
                if(s[i]=='['){
                    count++;
                    ++p;
                }
                else if(s[i]==']'){
                    --count;
                    if(count<0){
                        ans+=v.get(p)-i;
                        char temp=s[i];
                        s[i]=s[v.get(p)];
                        s[v.get(p)]=temp;
                        ++p;
                        count=1;
                    }
                }
            }
            return ans;
        }
    }
}
