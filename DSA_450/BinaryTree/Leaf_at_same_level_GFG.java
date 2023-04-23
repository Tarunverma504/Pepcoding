/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.BinaryTree;

/**
 *
 * @author Mind_Coder
 */
/*
    Given a Binary Tree, check if all leaves are at same level or not.

Example 1:

Input: 
            1
          /   \
         2     3

Output: 1

Explanation: 
Leaves 2 and 3 are at same level.

Example 2:

Input:
            10
          /    \
        20      30
       /  \        
     10    15

Output: 0

Explanation:
Leaves 10, 15 and 30 are not at same level.

Your Task: 
You dont need to read input or print anything. Complete the function check() which takes root node as input parameter and returns true/false depending on whether all the leaf nodes are at the same level or not.
 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)
 

Constraints:
1 ≤ N ≤ 10^3

View Bookmarked Problems 
Company Tags
Topic Tags
If you are facing any issue on this page. Please let us know.
Output Window

*/
public class Leaf_at_same_level_GFG {
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    class Solution
    {
        int levelOfLeaf;
        boolean check(Node root)
        {
            // Your code here
                levelOfLeaf=0;
                return sol(root, 0);
        }

        public  boolean sol(Node root, int level){
            if(root==null)
                return true;
            if(root.left==null && root.right==null){
                if(levelOfLeaf==0){
                    levelOfLeaf=level;
                    return true;
                }
                return levelOfLeaf==level;
            }
            return sol(root.left, level+1) && sol(root.right, level+1);
        }
    }

}
