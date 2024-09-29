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
public class Number_of_Provinces_GFG {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/problems/number-of-provinces/1
        */
    }
    class Solution {
        int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
            // code here

            // conversion to adjency list from the Adjency matrix
            ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();

            for(int i=0; i<V; i++){
                adjLs.add(new ArrayList<Integer>());
            }

            for(int i=0; i<V; i++){
                for(int j=0; j<V; j++){
                    if(adj.get(i).get(j) == 1 && i!=j){
                        adjLs.get(i).add(j);
                        adjLs.get(j).add(i);
                    }
                }
            }
            int vis[] = new int[V+1];
            int count=0;
            for(int i=0; i<V; i++){
                if(vis[i]==0){
                    count++;
                dfs(i, adjLs, vis);
                }
            }
            return count;
        }

        public void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis){
            vis[node] = 1;
            for(Integer it: adjLs.get(node)){
                if(vis[it]==0){
                    dfs(it, adjLs, vis);
                }
            }
        }
    };
}
