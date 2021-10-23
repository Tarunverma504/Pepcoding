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
public class Check_if_two_nodes_in_a_Binary_Tree_are_siblings {
    static class Node
    {
        int data;
        Node left, right;
    };
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;

        return (node);
    }
    static Node root = null;

    public static boolean CheckIfNodesAreSiblings(Node root, int a,int b){
        if(root==null)
            return false;
        boolean x= false,y=false, z=false;
        if(root.left!=null && root.right!=null){
            x=((root.left.data==a && root.right.data==b) || (root.left.data==b && root.right.data==a));
        }
        if(root.left!=null){
            y=CheckIfNodesAreSiblings(root.left,a,b);
        }
        if(root.right!=null){
            z=CheckIfNodesAreSiblings(root.right,a,b);
        }
        return(x||y||z);
        
    }
    
    public static void main(String arg[]){
        root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.right.left = newNode(5);
    root.right.right = newNode(6);
    root.left.left.right = newNode(7);
    int data_one = 5;
    int data_two = 6;
 
    if (CheckIfNodesAreSiblings(root,
                                data_one,
                                data_two))
        System.out.print("YES");
    else
        System.out.print("NO");
    }
}
