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
public class Rotting_Oranges_LC_994 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/rotting-oranges/
        */
    }
    class Solution {
        class Pair{
            int row, col, time;
            Pair(int row, int col, int time){
                this.row = row;
                this.col = col;
                this.time = time;
            }
        }
        public int orangesRotting(int[][] grid) {
            int vis[][] = new int[grid.length][grid[0].length];
            int cntFresh = 0;
            Queue<Pair> q = new LinkedList<>();
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j]==2){
                        vis[i][j]=1;
                        q.add(new Pair(i, j, 0));
                    }
                    else{
                        vis[i][j] = 0;
                    }
                    if(grid[i][j]==1)
                        cntFresh++;
                }
            }

            int time = 0;
            int directions[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            int count =0;
            while(!q.isEmpty()){
                int r = q.peek().row;
                int c = q.peek().col;
                int t = q.peek().time;
                q.remove();
                time = Math.max(time, t);
                for(int i=0; i<directions.length; i++){
                    int nrow = r + directions[i][0];
                    int ncol = c + directions[i][1];
                    if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                        q.add(new Pair(nrow, ncol, t+1));
                        vis[nrow][ncol] = 2;
                        count++;
                    }
                }
            }

            if(count != cntFresh)
                return -1;
            return time;
        }
    }
}
