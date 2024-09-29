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
public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Set<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis.add(0);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int front = q.remove();
            ans.add(front);
            
            ArrayList<Integer> neighbours = adj.get(front);
            for(int neighbour: neighbours){
                if(!vis.contains(neighbour)){
                    vis.add(neighbour);
                    q.add(neighbour);
                }
            }
        }
        return ans;
    }
}
