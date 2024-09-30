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
public class Distance_of_nearest_cell_having_1_GFG {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/problems/distance-of-nearest-cell-having-1-1587115620/1
        */
    }
    class Pair{
        int row, col, step;
        Pair(int row, int col, int step){
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        Queue<Pair> q = new LinkedList<Pair>();
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int dist[][] = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }
        
        int directions[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int step = q.peek().step;
            q.remove();
            dist[row][col] = step;
            for(int i=0; i<directions.length; i++){
                int ro = row + directions[i][0];
                int co = col + directions[i][1];
                if(ro>=0 && ro<grid.length && co>=0 && co<grid[0].length && vis[ro][co]==false){
                    vis[ro][co] = true;
                    q.add(new Pair(ro, co, step+1));
                }
            }
            
        }
        return dist;
    }
}

