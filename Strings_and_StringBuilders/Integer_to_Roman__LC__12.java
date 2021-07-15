/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_and_StringBuilders;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
public class Integer_to_Roman__LC__12 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/integer-to-roman/
        */
    }
    class Solution {
    public String intToRoman(int num) {
        int[] a={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []b={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder s=new StringBuilder();
        for(int i=0;i<a.length;i++){
            while(num>=a[i]){
                s.append(b[i]);
                num=num-a[i];
            }
        }
        return s.toString();
    }
}
}
