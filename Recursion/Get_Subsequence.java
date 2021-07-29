/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Mind_Coder
 */
/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output
Constraints
0 <= str.length <= 20
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]
*/
import java.io.*;
import java.util.*;

public class Get_Subsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> ans=gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);  //a
        String rest=str.substring(1);//bc
        ArrayList<String> res=gss(rest);
        ArrayList<String> ans=new ArrayList<String>();
        for(String s:res){
            ans.add(""+s);
        }
        for(String s:res){
            ans.add(ch+s);
        }
        return ans;
        
    }
}
