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
Given an NxN matrix Mat. Sort all elements of the matrix.

Example 1:

Input:
N=4
Mat=[[10,20,30,40],
[15,25,35,45] 
[27,29,37,48] 
[32,33,39,50]]
Output:
10 15 20 25 
27 29 30 32
33 35 37 39
40 45 48 50
Explanation:
Sorting the matrix gives this result.
Example 2:

Input:
N=3
Mat=[[1,5,3],[2,8,7],[4,6,9]]
Output:
1 2 3 
4 5 6
7 8 9
Explanation:
Sorting the matrix gives this result.
Your Task:
You don't need to read input or print anything. Your task is to complete the function sortedMatrix() which takes the integer N and the matrix Mat as input parameters and returns the sorted matrix.


Expected Time Complexity:O(N2LogN)
Expected Auxillary Space:O(N2)


Constraints:
1<=N<=1000
1<=Mat[i][j]<=105
*/
import Leet_Code__GFG.*;
import java.util.*;
public class Sorted_matrix__GFG {
    public static void main(String []arg){
        /*
        
        */
    }
    class Solution {
        int[][] sortedMatrix(int N, int Mat[][]) {
            // code here
            int n=Mat.length*Mat[0].length;
            int arr[]=new int[n];
            int k=0;
            for(int i=0;i<Mat.length;i++){
                for(int j=0;j<Mat[0].length;j++){
                    arr[k++]=Mat[i][j];
                }
            }
            Arrays.sort(arr);
            k=0;
            for(int i=0;i<Mat.length;i++){
                for(int j=0;j<Mat[0].length;j++){
                    Mat[i][j]=arr[k++];
                }
            }
            return Mat;
        }
    };
}
