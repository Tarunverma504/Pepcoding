/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author verma_v90bmnq
 */
import java.util.*;
public class Number_of_Islands_LC_200 {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/number-of-islands/
        */
    }
    public int numIslands(char[][] grid) {
        int vis[][] = new int[grid.length][grid[0].length];
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(vis[i][j]==0 && grid[i][j] == '1'){
                    count++;
                    bfs(i, j, grid, vis);
                }
            }
        }
        return count;
    }

    public void bfs(int ro, int co, char[][] grid, int[][] vis){
        Queue<Pair> q = new LinkedList<>();
        vis[ro][co] = 1;
        q.add(new Pair(ro, co));
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();

            //traverse in all eight directions for the neighbours
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for(int i=0; i<directions.length; i++){
                int nrow = row + directions[i][0];
                int ncol = col + directions[i][1];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1'){
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
            }

            // since in gfg they follow in eight direction so in that case we have to use this direction logic
            // for(int delrow = -1; delrow <= 1; delrow++){
            //     for(int delcol = -1; delcol <= 1; delcol++){
            //         int nrow = row + delrow;
            //         int ncol = col + delcol;
            //         if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1'){
            //             vis[nrow][ncol] = 1;
            //             q.add(new Pair(nrow, ncol));
            //         }
            //     }
            // }

        }
    }
}
