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


/*

1--> pre, s++, left
2--> in , s++, right
3--> post,pop
*/
public class Preorder_Inorder_Postorder_iteratively {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
          this.data = data;
          this.left = left;
          this.right = right;
        }
      }

      public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
          this.node = node;
          this.state = state;
        }
      }
    public static void iterativePrePostInTraversal(Node node) {
        // write your code here
        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(node,1);
        st.push(rtp);
        String pre="";
        String in="";
        String post="";
        while(st.size()>0){
            Pair top=st.peek();
            if(top.state==1){
                pre+=top.node.data+" ";
                top.state++;

                if(top.node.left!=null){
                    Pair lp = new Pair(top.node.left,1);
                    st.push(lp);
                }
            }

            else if(top.state==2){
                in += top.node.data+" ";
                top.state++;
                if(top.node.right!=null){
                    Pair rp = new Pair(top.node.right,1);
                    st.push(rp);
                }
            }
            else{
                post += top.node.data+" ";
                st.pop();
            }

        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
      }
}
