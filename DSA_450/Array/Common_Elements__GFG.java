/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Array;

/**
 *
 * @author Mind_Coder
 */
/*
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function commonElements() which take the 3 arrays A[], B[], C[] and their respective sizes n1, n2 and n3 as inputs and returns an array containing the common element present in all the 3 arrays in sorted order. 
If there are no such elements return an empty array. In this case the output will be printed as -1.

 

Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)

 

Constraints:
1 <= n1, n2, n3 <= 10^5
The array elements can be both positive or negative integers.
*/
import Leet_Code__GFG.*;
import java.util.*;
public class Common_Elements__GFG {
    public static void main(String arg){
        /*
        https://practice.geeksforgeeks.org/problems/common-elements1132/1#
        */
    }
    class Solution{
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        TreeSet<Integer> ts3 = new TreeSet<>();
        
        for(int i =0 ; i<n1 ; i++)
        ts1.add(a[i]);
        
        for(int i =0 ; i<n2 ; i++)
        ts2.add(b[i]);
        
        for(int i =0 ; i<n3 ; i++)
        ts3.add(c[i]);

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer>alex = new ArrayList<>(ts1);
        ArrayList<Integer>f = new ArrayList<>(); 

        for(int i =0 ; i<alex.size(); i++)
       {
           if(ts2.contains(alex.get(i)))
           al.add(alex.get(i));
           else
           ts2.add(alex.get(i));
       }
       
       
       
       for(int i =0 ; i<al.size(); i++)
       {
           if(ts3.contains(al.get(i)))
           f.add(al.get(i));
           else
           ts3.add(al.get(i));
           
       }
       
       return f;
        
        
    }
}
}
