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
/*
Given an array of elements of length N, ranging from 0 to N-1, your task is to write a program that rearranges the elements of the array. All elements may not be present in the array, if the element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

Example 1:

Input : A[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : -1 1 2 3 4 -1 6 -1 -1 9
Explanation:
Here We can see there are 10 elements. So, the sorted array
will look like {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} but in our
array we are not having 0, 5, 7 and 8. So, at there places
we will be printing -1 and otherplaces will be having elements.


Example 2:

Input : A[] = {2, 0, 1} 
Output : 0 1 2
 

 

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function Rearrange() that takes an array (arr), sizeOfArray (n), and return the array after rearranging it. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 

Constraints:
0 ≤ N ≤ 105
-1 ≤ A[] ≤ N-1
All values are unique other than -1.

*/
import java.util.*;
public class Reorganize_The_Array {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/reorganize-the-array4810/0/?category[]=Arrays&category[]=Arrays&difficulty[]=0&difficulty[]=1&page=1&query=category[]Arraysdifficulty[]0difficulty[]1page1category[]Arrays#
        */
    }
    public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            h.add(arr[i]);
        }
       for(int i=0;i<n;i++){
           if(!h.contains(i)){
               arr[i]=-1;
           }
           else{
               arr[i]=i;
           }
       }
       return arr;
    }
}
