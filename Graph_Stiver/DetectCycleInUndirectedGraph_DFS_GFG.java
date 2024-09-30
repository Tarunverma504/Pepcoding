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
public class DetectCycleInUndirectedGraph_DFS_GFG {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
        */
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++){
            if(vis[i]==false){
                if(dfs(i, -1, adj, vis)==true)
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfs(int src, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src] = true;
        for(int neighbour: adj.get(src)){
            if(vis[neighbour] == false){
                if(dfs(neighbour, src, adj, vis))
                    return true;
            }
            else if(neighbour != parent)
                return true;
        }
        return false;
    }
}
