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
Given a binary tree, a target node in the binary tree, and an integer value k, find all the nodes that are at distance k from the given target node. No parent pointers are available.

Example 1:

Input:      
          20
        /    \
      8       22 
    /   \
   4    12 
       /   \
      10    14
Target Node = 8
K = 2
Output: 10 14 22
Explanation: The three nodes at distance 2
from node 8 are 10, 14, 22.

Example 2:

Input:      
         20
       /    \
      7      24
    /   \
   4     3
        /  
       1    
Target Node = 7
K = 2
Output: 1 24
Your Task:  
You don't need to read input or print anything. Complete the function KDistanceNodes() which takes the root of the tree, target, and K as input parameters and returns a list of nodes at k distance from target in a sorted order.


Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(Height of tree)


Constraints:
1 ≤ N ≤ 103
1 ≤ data of node ≤ 104
1 ≤ target ≤ 104
1 ≤ k ≤ 20
*/
import java.util.*;
public class Nodes_at_given_distance_in_binary_tree__GFG {
    public static void main(String arg[]){
        /*
        Approach:-
        1.Get Path from the Root node and add into a list
        2. For each ith element from Path just iterate and print (K-i)th distance nodes.
        */
        /*
            https://practice.geeksforgeeks.org/problems/nodes-at-given-distance-in-binary-tree/1#
        */
    }
    class Node  
    { 
        int data; 
        Node left, right;
    }

    static class Solution{
        static ArrayList<Node> path;
        static ArrayList<Integer> ans;
        public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
        {
            // return the sorted list of all nodes at k dist
            path=new ArrayList<>();
            ans=new ArrayList<>();
            findNodeToRootPath(root,target);
            for(int i=0;i<path.size();i++){
                getNodeAtDistanceK(path.get(i),k-i,i==0?null:path.get(i-1));
            }
            Collections.sort(ans);
            return ans;
        }
        static boolean findNodeToRootPath(Node root,int target){
            if(root==null){
                return false;
            }
            if(root.data == target){
                path.add(root);
                return true;
            }
            boolean left = findNodeToRootPath(root.left,target);
            if(left){
                path.add(root);
                return true;
            }
            boolean right = findNodeToRootPath(root.right,target);
            if(right){
                path.add(root);
                return true;
            }
            return false;
        }

        static void getNodeAtDistanceK(Node temp,int k,Node blocker){
            if(temp==null || k<0 || temp==blocker)
                return;
            if(k==0){
                ans.add(temp.data);
            }
            getNodeAtDistanceK(temp.left,k-1,blocker);
            getNodeAtDistanceK(temp.right,k-1,blocker);

        }


    };
}
