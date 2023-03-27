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
    Given are the heights of certain Buildings which lie adjacent to each other. Sunlight starts falling from the left side of the buildings. If there is a building of a certain Height, all the buildings to the right side of it having lesser heights cannot see the sun. The task is to find the total number of such buildings that receive sunlight.

 

Example 1:

Input:
N = 6
H[] = {6, 2, 8, 4, 11, 13}
Output:
4
Explanation:
Only buildings of height 6, 8, 11 and
13 can see the sun, hence output is 4.
 

Example 2:

Input:
N = 5
H[] = {2, 5, 1, 8, 3}
Output:
3
Explanation:
Only buildings of height 2, 5 and 8
can see the sun, hence output is 3.
 

Example 3:

Input:
N = 7
H[] = {3, 4, 1, 0, 6, 2, 3}
Output:
3
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function longest() which takes the array A[] and its size N as inputs and returns the desired output.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
import java.util.*;
public class Buildings_receiving_sunlight_GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1
        */
    }
    static class Solution {
        public static int longest(int arr[],int n)
        {
            int count=1;
            int lmax = arr[0];
            for(int i=1;i<arr.length; i++){
                if(arr[i]>=lmax){
                    count++;
                    lmax = arr[i];
                }
            }
            return count;
        }
    }
}
