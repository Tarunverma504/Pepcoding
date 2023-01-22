package Leet_Code__GFG;

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
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
*/
import java.util.*;
public class N_Queens__LC__51__HARD {
    static class  Solution {
        public List<List<String>> solveNQueens(int n) {
            int arr[][]=new int[100][100];
            List<List<String>> ans=new ArrayList<>();
            Nqueen(arr,0,n,ans);
            return ans;
        }
        static boolean Nqueen(int arr[][],int i,int n,List<List<String>> ans){
            //base case
            if(i==n){
                // we have successfully place queen in n rows
                        //print the board;
                List<String> temp=new ArrayList<>();
                for(int l=0;l<n;l++){
                    String dummy="";
                    for(int r=0;r<n;r++){
                        if(arr[l][r]==1)
                            dummy=dummy+"Q";
                        else
                            dummy=dummy+".";
                    }
                    temp.add(dummy);
                }
                ans.add(temp);
                return false;
            }
            //recursive case
                //try to place the queen in currenty row and call ont the remaining part which will be solved by recursition
            for(int j=0;j<n;j++){
                // i have to check if i,j position is save to place the queen or not
                if(isSafe(arr,i,j,n)){
                    // place the queen- Assuming i,j is the right position
                    arr[i][j]=1;
                    boolean kyaNextQueenRakhPaye=Nqueen(arr,i+1,n,ans);
                    if(kyaNextQueenRakhPaye)
                        return true;
                    //means i,j is not true our assumptin is wrong
                    arr[i][j]=0;
                }
            }
            //we have truied for all positions in the current row but not able to plae the queen
            return false; 

        }
        static boolean isSafe(int[][]arr,int i,int j,int n){
            //vertical and horizontally check
            for(int k=0;k<n;k++){
                if(arr[k][j]==1 || arr[i][k]==1){
                    return false;
                }
            }
            // we have to check for left diagonal
            int x=i;
            int y=j;
            while(x>=0 && y>=0){
                if(arr[x][y]==1)
                    return false;
                x--;
                y--;
            }
            // again we have to check for the right diagonal also
            x=i;
            y=j;
            while(x>=0 && y<n){
                if(arr[x][y]==1)
                    return false;
                x--;
                y++;
            }
            // the position is now safe
            return true;
        }
     }
}
