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
Given a Binary Tree, find the vertical traversal of it starting from the leftmost level to the rightmost level.
If there are multiple nodes passing through a vertical line, then they should be printed as they appear in level order traversal of the tree.

Example 1:

Input:
           1
         /   \
       2       3
     /   \   /   \
   4      5 6      7
              \      \
               8      9           
Output: 
4 2 1 5 6 3 8 7 9 
Explanation:

Example 2:

Input:
       1
    /    \
   2       3
 /    \      \
4      5      6
Output: 4 2 1 5 3 6
Your Task:
You don't need to read input or print anything. Your task is to complete the function verticalOrder() which takes the root node as input parameter and returns an array containing the vertical order traversal of the tree from the leftmost to the rightmost level. If 2 nodes lie in the same vertical level, they should be printed in the order they appear in the level order traversal of the tree.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= Number of nodes <= 3*104

*/
import java.util.*;
public class Vertical_Traversal_of_Binary_Tree__GFG {
    /*
    
        https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
    
    */
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static class Solution
    {
        //Function to find the vertical order traversal of Binary Tree.
        static class Pair{
            Node node=null;
            int hl=0;
            Pair(Node node,int hl){
                this.node=node;
                this.hl=hl;
            }
        }
        static ArrayList <Integer> verticalOrder(Node root)
        {
            // add your code here
            int minl=0,maxl=0;
            Queue<Pair> q = new LinkedList<>();
            HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
            ArrayList<Integer> ans=new ArrayList<Integer>();
            q.add(new Pair(root,0));
            while(!q.isEmpty()){
                int n=q.size();
                while(n-- > 0){
                    Pair rp=q.poll();
                    minl=Math.min(minl,rp.hl);
                    maxl=Math.max(maxl,rp.hl);
                    if(mp.get(rp.hl)==null){
                        mp.put(rp.hl,new ArrayList<Integer>());
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
                for(int j=0;j<temp.size();j++){
                    ans.add(temp.get(j));
                }
            }

            return ans;
        }
    }
}
