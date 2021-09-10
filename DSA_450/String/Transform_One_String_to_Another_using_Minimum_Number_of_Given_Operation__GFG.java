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
Given two strings A and B, the task is to convert A to B if possible. The only operation allowed is to put any character from A and insert it at front. Find if it’s possible to convert the string. If yes, then output minimum no. of operations required for transformation.

Examples: 

Input:  A = "ABD", B = "BAD"
Output: 1
Explanation: Pick B and insert it at front.

Input:  A = "EACBD", B = "EABCD"
Output: 3
Explanation: Pick B and insert at front, EACBD => BEACD
             Pick A and insert at front, BEACD => ABECD
             Pick E and insert at front, ABECD => EABCD
*/

import java.util.*;
public class Transform_One_String_to_Another_using_Minimum_Number_of_Given_Operation__GFG {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(minops(a,b));
    }
    public static int minops(String a,String b){
        if(a.length()!=b.length())
            return -1;
        int res=0;
        int count[]=new int[256];
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0)
                return -1;
        }
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0){
            if(a.charAt(i)!=b.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }
}
