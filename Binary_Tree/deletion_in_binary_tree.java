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
public class deletion_in_binary_tree {
    
    static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key=key;
            this.left=null;
            this.right=null;
        }
    }
    
    static Node root;
    static void insert(Node temp,int num){
        if(temp==null){
            root=new Node(num);
            return ;
        }
        
        Queue<Node> q= new LinkedList<Node>();
        q.add(temp);
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp.left==null){
                temp.left=new Node(num);
                break;
            }
            else
                q.add(temp.left);
            if(temp.right==null){
                temp.right=new Node(num);
                break;
            }
            else
                q.add(temp.right);
        }
    }
    
    public static void inorder(Node temp){
        if(temp==null)
            return;
        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }
    
    public static void delete(Node root,int key){
        if(root==null)
               return;
        if(root.left==null && root.right==null){
            if(root.key==key){
                root=null;
                return;
            }
        }
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        Node temp=null,keynode=null;
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp.key==key){
                keynode=temp;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        
        if(keynode!=null){
            int x=temp.key;
            deleteDeepest(root,temp);
            keynode.key=x;
        }
    }
    
    public static void deleteDeepest(Node root,Node delNode){
        Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	
	Node temp = null;
	
	// Do level order traversal until last node
	while (!q.isEmpty())
	{
		temp = q.peek();
		q.remove();
		
		if (temp == delNode)
		{
			temp = null;
			return;
			
		}
		if (temp.right!=null)
		{
			if (temp.right == delNode)
			{
				temp.right = null;
				return;
		}
		else
			q.add(temp.right);
	}

	if (temp.left != null)
	{
		if (temp.left == delNode)
		{
			temp.left = null;
			return;
		}
		else
			q.add(temp.left);
	}
}
    }
    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        insert(root,10);
        insert(root,20);
        insert(root,30);
        insert(root,40);
        insert(root,50);
        insert(root,60);
        System.out.println("List before deletion");
        inorder(root);
        delete(root,60);
        System.out.println();
        System.out.println("List after deletion of node 60");
        inorder(root);
    }
}
