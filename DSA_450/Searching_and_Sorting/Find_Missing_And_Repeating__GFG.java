package DSA_450.Searching_and_Sorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ N
*/
import java.util.*;
public class Find_Missing_And_Repeating__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
        */
    }
    static class Solve {
        int[] findTwoElement(int arr[], int n) {
            // code here
            int ans[]=new int[2];
            for(int i=0;i<arr.length;i++){
                if(arr[Math.abs(arr[i])-1] <0){
                    ans[0]=Math.abs(arr[i]);
                }
                else{
                    arr[Math.abs(arr[i])-1]= -arr[Math.abs(arr[i])-1];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    ans[1]=i+1;
                    break;
                }
            }
            //System.out.println(ans[0]);
            return ans;
            // a;
        }
    }
}
