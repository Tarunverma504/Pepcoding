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
public class AdjencyList {
    public static void main(String arg[]){
        int n=3, m=3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(); 
        for(int i=0; i<=n; i++)
            adj.add(new ArrayList<Integer>());
            
        adj.get(1).add(2);
        adj.get(2).add(1);
            
        adj.get(2).add(3);
        adj.get(3).add(2);
            
        adj.get(1).add(3);
        adj.get(3).add(1);
            
        for(int i=1; i<n; i++){
            for(int j=0; j<adj.get(i).size(); j++){
                  System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }   
    }
}
