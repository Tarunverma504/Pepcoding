/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author Mind_Coder
 */
public class dijkstra {
    public static void main(String arg[]){
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                if(graph[i][j]==0){
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        algo(graph, 0);
    }
    
    public static void algo(int[][] graph, int src){
        boolean vis[] = new boolean[graph.length];
        int dis[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            dis[i]=graph[src][i]; // store given distance of  from src to vertex in dis array
        }
        
        dis[src] = 0; // update distance of src to 0 bcoz dist fron src to src is 0.
        vis[src]=true;
        System.out.println("Chosen vertex : "+ src);
        for(int i=0;i<graph.length;i++){
            int minDist=Integer.MAX_VALUE;
            int targetV = -1;
            // to find the unvisted vertex which has smaller  dist 
            for(int j=0;j<graph.length; j++){
                if(vis[j]==false && minDist> dis[j]){
                    minDist = dis[j];
                    targetV = j;
                }
            }
            
            System.out.println("Chosen vertex : "+ targetV);
            vis[targetV] = true;
            //update all the neighbours of vertex
            for(int j=0;j<graph.length; j++){
                if(!vis[v] && graph[targetV][j]!=)
            }
        }
    }
}
