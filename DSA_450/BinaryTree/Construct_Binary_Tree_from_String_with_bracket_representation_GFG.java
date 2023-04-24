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
    Construct a binary tree from a string consisting of parenthesis and integers. The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the roots value and a pair of parenthesis contains a child binary tree with the same structure. Always start to construct the left child node of the parent first if it exists. The integer values will be less than or equal to 10^5.

Example 1:

Input: "1(2)(3)" 
Output: 2 1 3
Explanation:
           1
          / \
         2   3
Explanation: first pair of parenthesis contains 
left subtree and second one contains the right 
subtree. Inorder of above tree is "2 1 3".
Example 2:

Input: "4(2(3)(1))(6(5))"
Output: 3 2 1 4 5 6
Explanation:
           4
         /   \
        2     6
       / \   / 
      3   1 5   
Your Task:
You don't need to read input or print anything. Your task is to complete the function treeFromString() which takes a string str as input parameter and returns the root node of the tree.
*/
public class Construct_Binary_Tree_from_String_with_bracket_representation_GFG {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static class Solution {
        static int i;
        public static Node treeFromString(String s) {
            // code here
            if(s==null || s.length()==0)
                return null;
            i=0;
            return sol(s);
        }

        public static Node sol(String s){
            if(i>=s.length())
                return null;
            boolean neg = false;
            if(s.charAt(i)=='-')
                neg= true;
            int num =0;
            while(i<s.length() && Character.isDigit(s.charAt(i))){
                num = num * 10 + (s.charAt(i)-'0');
                i++;
            }
            if(neg)
                num = num * -1;
            Node root = new Node(num);
            if(i>=s.length())
                return root;
            if(i<s.length() && s.charAt(i)=='('){
                i++;
                root.left = sol(s);
            }
            if(i<s.length() && s.charAt(i)==')'){
                if(s.charAt(i-1)=='('){
                    i++;
                    return null;
                }
                i++;
                return root;
            }
            if(i<s.length() && s.charAt(i)=='('){
                i++;
                root.right = sol(s);
            }
            if(i<s.length() && s.charAt(i)==')'){
                if(s.charAt(i-1)=='('){
                    i++;
                    return null;
                }
                i++;
                return root;
            }
            return root;
        }
    }
}
