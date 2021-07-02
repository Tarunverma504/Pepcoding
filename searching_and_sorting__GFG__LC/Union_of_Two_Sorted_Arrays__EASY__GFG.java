/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching_and_sorting__GFG__LC;

/**
 *
 * @author Mind_Coder
 */

/*
Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.


Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including 
both the arrays are: 1 2 3 4 5.
 

Example 2:

Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 1 2 3 4 5
Explanation: Distinct elements including 
both the arrays are: 1 2 3 4 5.
 

Example 3:

Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 1 2
Explanation: Distinct elements including 
both the arrays are: 1 2.

Your Task: 
You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their size n and m as input parameters and returns a list containing the union of the two arrays. 
 

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(n+m).
 

Constraints:
1 <= n, m <= 105
1 <= arr[i], brr[i] <= 106
*/
import java.util.*;
public class Union_of_Two_Sorted_Arrays__EASY__GFG {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays/1#
        */
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]==arr2[j]){
                if(l.size() >0 && l.get(l.size()-1)!=arr1[i]){
                    l.add(arr1[i]);
                    
                }
                else if(l.size()==0){
                    l.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                if(l.size() >0 && l.get(l.size()-1)!=arr1[i]){
                    l.add(arr1[i]);
                    
                }
                else if(l.size()==0){
                    l.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(l.size() >0 && l.get(l.size()-1)!=arr2[j]){
                    l.add(arr2[j]);
                    
                }
                else if(l.size()==0){
                    l.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr1.length){
            if(l.get(l.size()-1)!=arr1[i]){
                    l.add(arr1[i]);
                    
                }
                i++;
        }
        while(j<arr2.length){
            if(l.get(l.size()-1)!=arr2[j]){
                    l.add(arr2[j]);
                    
                }
                j++;
        }
        return l;
    }
    
}
