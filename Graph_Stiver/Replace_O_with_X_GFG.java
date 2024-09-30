/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph_Stiver;

/**
 *
 * @author verma_v90bmnq
 */

import java.util.*;

/*
Given a matrix mat of size N x M where every element is either 'O' or 'X'. Replace all 'O' or a group of 'O' with 'X' that are surrounded by 'X'.

A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.

Example 1:

Input: 
n = 5, m = 4
mat = {{'X', 'X', 'X', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'O', 'O', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'X', 'O', 'O'}}
Output: 
ans = {{'X', 'X', 'X', 'X'}, 
       {'X', 'X', 'X', 'X'}, 
       {'X', 'X', 'X', 'X'}, 
       {'X', 'X', 'X', 'X'}, 
       {'X', 'X', 'O', 'O'}}
Explanation: 
Following the rule the above matrix is the resultant matrix. 
Example 2:

 

Input: 
n = 5, m = 4
mat = {{'X', 'O', 'X', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'O', 'O', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'X', 'O', 'O'}}
Output: 
ans = {{'X', 'O', 'X', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'O', 'O', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'X', 'O', 'O'}}
Explanation: 
Following the rule the above matrix is the resultant matrix.

*/
public class Replace_O_with_X_GFG {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1
        */
    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        boolean[][] vis = new boolean[a.length][a[0].length];
        char ans[][] = new char[a.length][a[0].length];
        
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for(int i=0; i<a[0].length; i++){
            
            //first row
            if(vis[0][i]==false && a[0][i]=='O'){
                dfs(0, i, a, vis, directions);
            }
            
            //last row;
            if(vis[a.length-1][i]==false && a[a.length-1][i]=='O'){
                dfs(a.length-1, i, a, vis, directions);
            }
        }
        
        for(int i=0; i<a.length; i++){
            
            //first column
            if(vis[i][0] == false && a[i][0]=='O'){
                dfs(i, 0, a, vis, directions);
            }
            
            //last column
            if(vis[i][a[0].length-1] == false && a[i][a[0].length-1] == 'O'){
                dfs(i, a[0].length-1, a, vis, directions);
            }
        }
        
        for(int i=0; i<vis.length; i++){
            for(int j=0; j<vis[0].length; j++){
                if(!vis[i][j])
                    ans[i][j] = 'X';
                else
                    ans[i][j] = 'O';
            }
        }
        return ans;
    }
    
    public static void dfs(int row, int col, char[][] a, boolean[][] vis, int[][] directions){
        vis[row][col] = true;
        for(int i=0; i<directions.length; i++){
            int nrow = row+directions[i][0];
            int ncol = col+directions[i][1];
            if(nrow>=0 && nrow<a.length && ncol>=0 && ncol<a[0].length && vis[nrow][ncol]==false && a[nrow][ncol]=='O'){
                dfs(nrow, ncol, a, vis, directions);
            }
        }
    }
}
