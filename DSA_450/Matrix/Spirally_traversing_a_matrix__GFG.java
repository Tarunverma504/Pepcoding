/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Matrix;

/**
 *
 * @author Mind_Coder
 */
/*
Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

Example 2:

Input:
r = 3, c = 4  
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}}
Output: 
1 2 3 4 8 12 11 10 9 5 6 7
Explanation:
Applying same technique as shown above, 
output for the 2nd testcase will be 
1 2 3 4 8 12 11 10 9 5 6 7.

Your Task:
You dont need to read input or print anything. Complete the function spirallyTraverse() that takes matrix, r and c as input parameters and returns a list of integers denoting the spiral traversal of matrix. 

Expected Time Complexity: O(r*c)
Expected Auxiliary Space: O(r*c), for returning the answer only.

Constraints:
1 <= r, c <= 100
0 <= matrixi <= 100

Company Tags
*/
import java.util.*;
public class Spirally_traversing_a_matrix__GFG {
    public static void main(String []arg){
        /*
        https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
        */
    }
    static class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> a=new ArrayList<Integer>();
        int m=0,n=0;
        int ec=c-1,sc=0;
	    int er=r-1,sr=0;
	while(sc<=ec && sr<=er ){
		//print first column
    		for(int i=sc;i<=ec;i++){
    		   a.add(arr[sr][i]);
    		}
    		sr++;
    		
    		for(int i=sr;i<=er;i++){
    		    a.add(arr[i][ec]);
    		}
    		ec--;
    		if(sr<=er){
    			for(int i=ec;i>=sc;i--){
    			    a.add(arr[er][i]);
    
    			}
    			er--;
    		}
    		if(sc<=ec){
    			
    			for(int i=er;i>=sr;i--){
    			    a.add(arr[i][sc]);
    			}
    			sc++;
    		}
    		
    	}
        return a;
    }
}

}
