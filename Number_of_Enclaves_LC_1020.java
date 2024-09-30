/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author verma_v90bmnq
 */
/*
You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.

A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.

Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.

 

Example 1:


Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.
Example 2:


Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: All 1s are either on the boundary or can reach the boundary.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 500
grid[i][j] is either 0 or 1.

*/
import java.util.*;
public class Number_of_Enclaves_LC_1020 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/number-of-enclaves/
        */
    }
    
    public int numEnclaves(int[][] grid) {
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        int directions[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1){
                    if(vis[i][j] == false && grid[i][j]==1){
                        dfs(i, j, grid, vis, directions);
                    }
                }
            }
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(vis[i][j]==false && grid[i][j] ==1)
                    ans++;
            }
        }
        return ans;

    }

    public void dfs(int row, int col, int[][] grid, boolean[][] vis, int[][] directions){
        vis[row][col] = true;
        for(int i=0; i<directions.length; i++){
            int nrow = row+directions[i][0];
            int ncol = col+directions[i][1];    
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol]==false && grid[nrow][ncol]==1){
                dfs(nrow, ncol, grid, vis, directions);
            }
        }
    }
}
