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

import java.util.*;
public class string_is_palidrome_or_not_recursive {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isPermutation(str,0,str.length()-1));
    }
    static boolean isPermutation(String str,int l,int r){
        if(l>=r)
            return true;
        if(str.charAt(l)!=str.charAt(r))
                return false;
        return isPermutation(str,l+1,r-1);
       
    }
}
