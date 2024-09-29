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
public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(adj, ans, 0, new HashSet<Integer>());
        return ans;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, int src, HashSet<Integer> vis){
        ans.add(src);
        vis.add(src);
        ArrayList<Integer> neighbours = adj.get(src);
        for(int neighbour: neighbours){
            if(!vis.contains(neighbour)){
                dfs(adj, ans, neighbour, vis);
            }
        }
    }
}
