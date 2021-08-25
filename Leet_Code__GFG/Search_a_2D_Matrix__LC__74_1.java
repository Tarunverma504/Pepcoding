/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

import searching_and_sorting__GFG__LC.*;

/**
 *
 * @author Mind_Coder
 */

/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
*/
public class Search_a_2D_Matrix__LC__74_1 {
    public static void main(String[] arg){
         /*
        https://leetcode.com/problems/search-a-2d-matrix/
        */   
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=getRow(matrix,target);
        if(r==-1){
            return false;
        }
        if(matrix[r][0]==target){
            return true;
        }
        else{
            int l=0,h=matrix[0].length-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(matrix[r][mid]==target){
                    return true;
                }
                else if(matrix[r][mid]>target){
                    h=mid-1;
                }
                else if(matrix[r][mid]<target){
                    l=mid+1;
                }
            }
        }
        return false;
    }
    public static int getRow(int[][] matrix,int target){
        int l=0,h=matrix.length-1;
        int c=matrix[0].length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(matrix[mid][0]<=target && matrix[mid][c]>=target){
                return mid;
            }
            else if(matrix[mid][0]>target){
                h=mid-1;
            }
            else if(matrix[mid][0]<target){
                l=mid+1;
            }
        }
        return -1;
    }
}
