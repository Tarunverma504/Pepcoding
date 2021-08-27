package DSA_450.Matrix;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
import Leet_Code__GFG.*;
import java.util.*;
public class Search_a_2D_Matrix__LC__74 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/search-a-2d-matrix/
        */
    }
    static class Solution {
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
}
