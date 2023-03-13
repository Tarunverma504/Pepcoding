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
    Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.
 

Your Task:
You dont need to read input or print anything. Complete the function removeConsecutiveCharacter() which accepts a string as input parameter and returns modified string.
*/
public class Remove_Consecutive_Characters {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1
        */
    }
    static class Solution{
        public String removeConsecutiveCharacter(String s){
            if(s.length()<=1)
                return s;
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            for(int i=1;i<s.length(); i++){
                if(s.charAt(i-1)!=s.charAt(i)){
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
