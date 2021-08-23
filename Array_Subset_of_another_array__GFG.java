/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */

import java.util.*;
public class Array_Subset_of_another_array__GFG {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1#
        */
    }
    class Compute {
        public String result(long a1[], long a2[]){
            HashSet<Long> h =new HashSet<Long>();
            if(a1.length<a2.length){
                return "No";
            }
            for(int i=0;i<a1.length;i++)
                h.add(a1[i]);
            for(int i=0;i<a2.length;i++){
                if(!h.contains(a2[i]))
                return "No";
            }
            return "Yes";

        }
        public String isSubset( long a1[], long a2[], long n, long m) {
            return result(a1,a2);

        }
    }
}
