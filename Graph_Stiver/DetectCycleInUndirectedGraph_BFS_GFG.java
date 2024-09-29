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
public class DetectCycleInUndirectedGraph_BFS_GFG {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
        */
    }
    class Pair{
        int node, parent;
        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    
    public boolean detectCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src] = true;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(src, -1));
        
        while(!q.isEmpty()){
            int node = q.peek().node;
            int parent = q.peek().parent;
            q.remove();
            for(int adjNode: adj.get(node)){
                if(vis[adjNode] == false){
                    vis[adjNode] = true;
                    q.add(new Pair(adjNode, node));
                }
                else if(parent != adjNode)
                    return true;
            }
        }
        return false;
    }
    
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++){
            if(vis[i]==false){
                if(detectCycle(i, adj, vis))
                    return true;
            }
        }
        return false;
    }
}
