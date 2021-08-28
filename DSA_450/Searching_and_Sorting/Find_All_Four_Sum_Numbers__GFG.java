/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Searching_and_Sorting;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.

Example 1:

Input:
N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2 $
Explanation: Sum of 0, 0, 1, 2 is equal
to K.
Example 2:

Input:
N = 7, K = 23
A[] = {10,2,3,4,5,7,8}
Output: 2 3 8 10 $2 4 7 10 $3 5 7 8 $
Explanation: Sum of 2, 3, 8, 10 = 23,
sum of 2, 4, 7, 10 = 23 and sum of 3,
5, 7, 8 = 23.
Your Task:
You don't need to read input or print anything. Your task is to complete the function fourSum() which takes the array arr[] and the integer k as its input and returns an array containing all the quadruples in a lexicographical manner. Also note that all the quadruples should be internally sorted, ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.  (In the output each quadruple is separate by $. The printing is done by the driver's code)

Expected Time Complexity: O(N3).
Expected Auxiliary Space: O(N2).

Constraints:
1 <= N <= 100
-1000 <= K <= 1000
-100 <= A[] <= 100

*/
import java.util.*;
public class Find_All_Four_Sum_Numbers__GFG {
    public static void main(String arg[]){
        /*
        https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1#
        */
    }
    static class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        //ArrayList<List<Integer>> ans=ArrayList<List<Integer>>();
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        LinkedHashSet<ArrayList<Integer>> dummy=new LinkedHashSet<ArrayList<Integer>>();
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j]==arr[j-1])
                    continue;
                int l=j+1;
                int r=arr.length-1;
                while(l<r){
                    int sum=arr[i]+arr[j]+arr[l]+arr[r];
                    if(sum==k){
                        ArrayList<Integer> a= new ArrayList<Integer>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[l]);
                        a.add(arr[r]);
                        dummy.add(a);
                        
                        l++;
                    }
                    else if(sum>k){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        Iterator <ArrayList<Integer>> it = dummy.iterator();
        while(it.hasNext()){
            ans.add(it.next());
        }
        return ans;
    }
}
}
