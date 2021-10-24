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
Given a Binary Tree. Find the difference between the sum of node values at even levels and the sum of node values at the odd levels.

Example 1:

Input:
            1
          /   \
         2     3

Output: -4

Explanation:
sum at odd levels - sum at even levels
= (1)-(2+3) = 1-5 = -4

Example 2:

Input:
            10
          /    \
        20      30
       /  \         
     40    60      

Output: 60

Explanation:
sum at odd levels - sum at even levels
= (10+40+60) - (20+30)
= 110 - 50
= 60

Your Task:  
You dont need to read input or print anything. Complete the function getLevelDiff() which takes root node as input parameter and returns an integer.
 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)
 

Constraints:
1 ≤ N ≤ 10^5
*/

import java.util.*;
public class Odd_even_level_difference__GFG {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/odd-even-level-difference/1#
        */
    }
    static class Node{
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
            int getLevelDiff(Node root)
            {
                //code here
                Queue<Node> q = new LinkedList<>();
                int level=0;
                int odd=0;
                int even=0;
                q.add(root);
                while(!q.isEmpty()){
                    int n=q.size();
                    level++;
                    while(n-- > 0){
                        Node temp=q.poll();
                        if(level%2!=0){
                            odd+=temp.data;
                        }
                        else{
                            even+=temp.data;
                        }
                        if(temp.left!=null)
                            q.add(temp.left);
                       if(temp.right!=null)
                            q.add(temp.right);

                    }
                }
                return odd-even;
            }
    }
    
    /*   
    ----------------------------------Recursive Solution------------------------
    class Solution
    {
            int getLevelDiff(Node root)
            {
                //code here
                if(root==null)
                    return 0;
                return root.data-getLevelDiff(root.left)-getLevelDiff(root.right);
            }
    }
    */
}
