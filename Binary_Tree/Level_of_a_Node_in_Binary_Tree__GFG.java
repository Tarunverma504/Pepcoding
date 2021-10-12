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
Given a Binary Tree and a target key you need to find the level of target key in the given Binary Tree.

Note: The level of the root node is 1.

           3
         /   \
        2     5
      /   \
     1     4
Key: 4
Level: 3  
Note: if no such key exists then return 0.

Example 1:

Input:
        1
      /   \
     2     3
target = 4
Output: 0

Example 2:

Input:
         3
       /   \
      2     5
    /   \
   1     4
target = 4
Output: 3
Your Task:
 You don't have to take input. Just complete the function getLevel() that takes a node and a target as parameters and returns the level of the target value. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree and this space is used implicitly for recursion stack.

Constraints:
1 <= Number of nodes<= 105
1 <= Data of a node<= 105
1 <= Target <= 105
*/
import java.util.*;
public class Level_of_a_Node_in_Binary_Tree__GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1
        */
    }
    static class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
    }
    //iterative solution
    class Solution
    {
        /* Returns level of given data value */
        int getLevel(Node node, int data)  
        { 
            // Write your code here
            int level=0;
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            if(node.data == data){
                return 1;
            }
            while(!q.isEmpty()){
                level++;
                int n=q.size();
                for(int i=0;i<n;i++){
                    node=q.poll();
                    if(node.data==data)
                        return level;
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
            }
            return 0;

        } 

    }
    
    //---------------------------------------recursive----------------------------------
    /*
        class Solution
    {
        int getLevel(Node node, int data)  
        { 
            // Write your code here
            int ans=level(node,data,1);
            return ans;
        } 
        int level(Node node,int data,int level){
            if(node==null){
                return 0;
            }
            if(node.data==data)
                return level;
            int l=level(node.left ,data ,level+1);
            if(l!=0){
                return l;
            }
            l=level(node.right,data,level+1);
            return l;
        }

    }
    */
}
