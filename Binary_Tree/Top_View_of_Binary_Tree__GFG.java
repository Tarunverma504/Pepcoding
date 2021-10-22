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
/*
Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
Note: Return nodes from leftmost node to rightmost node.

Example 1:

Input:
      1
   /    \
  2      3
Output: 2 1 3
Example 2:

Input:
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100
Output: 40 20 10 30 100
Your Task:
Since this is a function problem. You don't have to take input. Just complete the function topView() that takes root node as parameter and returns a list of nodes visible from the top view from left to right.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 105
1 ≤ Node Data ≤ 105
*/


import java.util.*;
public class Top_View_of_Binary_Tree__GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1#
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
                ans.add(temp.get(0));
            }
            return ans;

        }
    }
}
