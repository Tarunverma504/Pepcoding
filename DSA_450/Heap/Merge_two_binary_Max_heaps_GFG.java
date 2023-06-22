/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Heap;

/**
 *
 * @author Mind_Coder
 */
/*
    Given two binary max heaps as arrays, merge the given heaps to form a new max heap.

 

Example 1:

Input  : 
n = 4 m = 3
a[] = {10, 5, 6, 2}, 
b[] = {12, 7, 9}
Output : 
{12, 10, 9, 2, 5, 7, 6}
Explanation :




 

 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function mergeHeaps() which takes the array a[], b[], its size n and m, as inputs and return the merged max heap. Since there can be multiple solutions, therefore, to check for the correctness of your solution, your answer will be checked by the driver code and will return 1 if it is correct, else it returns 0.

 

Expected Time Complexity: O(n.Logn)
Expected Auxiliary Space: O(n + m)

 

Constraints:
1 <= n, m <= 105
1 <= a[i], b[i] <= 2*105
 
*/
import java.util.*;
public class Merge_two_binary_Max_heaps_GFG {
    class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int[] ans = new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k++] = a[i];
        }
        for(int i=0;i<m;i++){
            ans[k++]=b[i];
        }
        
        // we start from n/2-1 because from n/2 to n-1 all are leaf nodes
        for(int i=ans.length/2-1; i>=0;i--){
            heapify(ans, i);
        }
        return ans;
    }
    
    
    public void heapify(int[] ans, int i){
        int l = 2*i+1;  //left child
        int r = 2*i+2;  // right child
        int largest = i; 
        if(l<ans.length && ans[l]>ans[largest]){
            largest = l;
        }
        if(r<ans.length && ans[r]>ans[largest]){
            largest = r;
        }
        if(largest!=i){
            int temp = ans[i];
            ans[i] = ans[largest];
            ans[largest] = temp;
            heapify(ans, largest);
        }
    }
}
}
