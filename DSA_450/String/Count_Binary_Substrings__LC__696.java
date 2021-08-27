package DSA_450.String;

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
Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

 

Example 1:

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
Example 2:

Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 

Constraints:

1 <= s.length <= 105
s[i] is either '0' or '1'.
*/
import java.util.*;
public class Count_Binary_Substrings__LC__696 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/count-binary-substrings/
        */
    }
    static class Solution {
        public int countBinarySubstrings(String s) {
            int curr=1,prev=0;
            int count=0;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i-1)!=s.charAt(i)){
                    count+=Math.min(prev,curr);
                    prev=curr;
                    curr=1;
                }
                else
                    curr++;
            }
            return count+=Math.min(prev,curr);
        }
    }
}
