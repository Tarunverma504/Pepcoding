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
/*
    Given a boolean 2D matrix grid of size n * m. You have to find the number of distinct islands where a group of connected 1s (horizontally or vertically) forms an island. Two islands are considered to be distinct if and only if one island is not equal to another (not rotated or reflected).

Example 1:

Input:
grid[][] = {{1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}}
Output:
1
Explanation:
grid[][] = {{1, 1, 0, 0, 0}, 
            {1, 1, 0, 0, 0}, 
            {0, 0, 0, 1, 1}, 
            {0, 0, 0, 1, 1}}
Same colored islands are equal.
We have 2 equal islands, so we 
have only 1 distinct island.

Example 2:

Input:
grid[][] = {{1, 1, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {1, 1, 0, 1, 1}}
Output:
3
Explanation:
grid[][] = {{1, 1, 0, 1, 1}, 
            {1, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 1}, 
            {1, 1, 0, 1, 1}}
Same colored islands are equal.
We have 4 islands, but 2 of them
are equal, So we have 3 distinct islands.

Your Task:

You don't need to read or print anything. Your task is to complete the function countDistinctIslands() which takes the grid as an input parameter and returns the total number of distinct islands.

Expected Time Complexity: O(n * m)
Expected Space Complexity: O(n * m)
*/

import java.util.*;
public class Number_of_Distinct_Islands_GFG {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/problems/number-of-distinct-islands/0
        */
    }
    
    int countDistinctIslands(int[][] grid) {
        // Your Code here
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        HashSet<ArrayList<String>> hs = new HashSet<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(vis[i][j] == false && grid[i][j] == 1) {
                    ArrayList<String> vec = new ArrayList<>();
                    dfs(i, j, grid, vis, i, j, directions, vec);
                    hs.add(vec);
                }
            }
        }
        return hs.size();
    }
    
    public void dfs(int row, int col, int[][] grid, boolean[][] vis, int baseRow, int baseCol, int[][] directions, ArrayList<String> vec ){
        vis[row][col] = true;
        vec.add(toString(row, col, baseRow, baseCol));
        for(int i=0; i<directions.length; i++){
            int nrow = row + directions[i][0];
            int ncol = col + directions[i][1];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol]==false && grid[nrow][ncol]==1){
                dfs(nrow, ncol, grid, vis, baseRow, baseCol, directions, vec);
            }
        }
    }
    
    public String toString(int row, int col, int prevRow, int prevCol){
        row = prevRow-row;
        col = prevCol-col;
        return row+" "+col;
    }
}
