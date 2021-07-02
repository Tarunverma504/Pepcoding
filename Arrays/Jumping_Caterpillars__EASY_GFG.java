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
Given N leaves numbered from 1 to N . A caterpillar at leaf 1, jumps from leaf to leaf in multiples of Aj (Aj, 2Aj, 3Aj).
j is specific to the caterpillar. Whenever a caterpillar reaches a leaf, it eats it a little bit.. You have to find out how many leaves, from 1 to N, are left uneaten after all K caterpillars have reached the end. Each caterpillar has its own jump factor denoted by Aj, and each caterpillar starts at leaf number 1.

Example 1:

Input:
N=10 K=3
arr[] = {2, 3, 5} 
Output: 2
Explanation: The leaves eaten by the first 
caterpillar are (2, 4, 6, 8, 10). The leaves 
eaten by the second caterpilllar are (3, 6, 9).
The leaves eaten by the third caterpilllar 
are (5, 10). Ultimately, the uneaten leaves are 
1, 7 and their number is 2.
 

Your Task:
Since this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function uneatenLeaves() that takes array arr, integer N, and integer K as parameters and returns the number of uneaten leaves.

 

Expected Time Complexity: O(N2).
Expected Auxiliary Space: O(N).

 

Constraints:
1 ≤ N ≤ 104
*/
import java.util.*;
public class Jumping_Caterpillars__EASY_GFG {
    public static void main(String[] arg){
        /*
            https://practice.geeksforgeeks.org/problems/jumping-caterpillars4412/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=0&page=1&sortBy=newest&query=category[]ArraysproblemStatusunsolveddifficulty[]0page1sortBynewestcategory[]Arrays#
        */
    }
    long uneatenLeaves(long arr[], int n,int k)
    {
        // Your code goes here  
        LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
        for(int i=0;i<k;i++){
            int j=(int)arr[i];
            while(j<=n){
                
                l.add(j);
                j=j+(int)arr[i];
            }
        }
        long result=n-l.size();
        return result;
    }
}
