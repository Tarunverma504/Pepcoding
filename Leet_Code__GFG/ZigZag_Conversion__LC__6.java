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
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 

Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
*/

import java.util.*;
public class ZigZag_Conversion__LC__6 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/zigzag-conversion/
        */
    }
    class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        TreeMap<Integer,String> h=new TreeMap<Integer,String>();
        for(int i=1;i<=numRows;i++){
            h.put(i,"");
            
        }
        boolean flag=true;
        int k=1;
        
        for(int i=0;i<s.length();i++){
            String str=new String();
            str=str+(h.get(k)+s.charAt(i));
            h.put(k,str);
            if(flag==true)
                k++;
            if(flag==false)
                k--;
            
            
            
            if(k==1)
                flag=true;
            else if(k==numRows)
                flag=false;
        }
        String ans=new String();
        for(Map.Entry<Integer,String> m:h.entrySet()){
            ans=ans+m.getValue();
        }
        return ans;
    }
}
}
