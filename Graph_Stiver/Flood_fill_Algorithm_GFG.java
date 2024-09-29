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
public class Flood_fill_Algorithm_GFG {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/problems/flood-fill-algorithm1856/1
        */
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int intialColor = image[sr][sc];
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int vis[][] = new int[image.length][image[0].length];
        dfs(sr, sc, image, intialColor, newColor, directions, vis);
        return image;
    }
    
    public void dfs(int sr, int sc, int[][] image, int intialColor, int newColor, int[][] directions, int vis[][]){
        image[sr][sc] = newColor;
        vis[sr][sc] = 1;
        for(int i=0; i<directions.length; i++){
            int nrow = sr + directions[i][0];
            int ncol = sc + directions[i][1];
            if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol] == intialColor && vis[nrow][ncol] == 0){
                dfs(nrow, ncol, image, intialColor, newColor, directions, vis);
            }
        }
    }
}
