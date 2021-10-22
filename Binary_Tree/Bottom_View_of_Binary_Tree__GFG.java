/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Tree;

/**
 *
 * @author Mind_Coder
 */

import java.util.*;
public class Bottom_View_of_Binary_Tree__GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
        */
    }
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static class Solution
    {
        //Function to return a list of nodes visible from the top view 
        //from left to right in Binary Tree.
        static class Pair{
            Node node=null;
            int hl=0;
            Pair(Node node,int hl){
                this.node=node;
                this.hl=hl;
            }
        }
        static ArrayList<Integer> topView(Node root)
        {
            // add your code
            ArrayList<Integer> ans = new ArrayList<>();
            Queue<Pair> q = new LinkedList<>();
            HashMap<Integer,ArrayList<Integer>> mp = new HashMap<>();
            q.add(new Pair(root,0));
            int maxl=0,minl=0;
            while(!q.isEmpty()){
                int n=q.size();
                while(n-- > 0){
                    Pair rp=q.poll();
                    maxl=Math.max(maxl,rp.hl);
                    minl=Math.min(minl,rp.hl);
                    if(mp.get(rp.hl)==null){
                        mp.put(rp.hl,new ArrayList<>());
                    }
                    mp.get(rp.hl).add(rp.node.data);
                    if(rp.node.left!=null){
                        q.add(new Pair(rp.node.left,rp.hl-1));
                    }
                    if(rp.node.right!=null){
                        q.add(new Pair(rp.node.right,rp.hl+1));
                    }
                }
            }
            for(int i=minl;i<=maxl;i++){
                ArrayList<Integer> temp=mp.get(i);
                ans.add(temp.get(temp.size()-1));
            }
            return ans;

        }
    }
}
