/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mind_Coder
 */

import java.util.*;
public class First_negative_integer_in_window_k_OPTIMIZE_GFG {
    public static void main(String[] arg){
         /*
            https://practice.geeksforgeeks.org/viewSol.php?subId=649750a9e7ffa677a80e979a650bbe83&pid=703375&user=vermatarun4305
        */
    }
    public long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
       LinkedList<Integer> l = new LinkedList<Integer>();
       long ans[] = new long[n-k+1];
       int i=0,x=0;
       for(i=0;i<k;i++){
           if(arr[i]<0){
               l.add(i);
           }
       }
       
       for(;i<n;i++){
           if(!l.isEmpty()){
               ans[x++]=arr[l.peek()];
           }
           else{
               ans[x++]=0;
           }
           
           while((!l.isEmpty()) && l.peek()<i-k+1)
                l.remove();
            if(arr[i]<0){
                l.add(i);
            }
                
       }
       
       if (!l.isEmpty())
        ans[x++]=arr[l.peek()];
    else
        ans[x++]=0;
       
       
       return ans;
    }
}
