/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Backtracking;

/**
 *
 * @author Mind_Coder
 */
/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
A number m
Output Format
Contents of the arraylist containing paths as shown in sample output
Question Video

  COMMENTConstraints
0 <= n <= 10
0 <= m <= 10
Sample Input
3
3
Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
*/
import java.util.*;
public class Get_Maze_Paths {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> ans=getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
    {
        if(sc==dc && sr==dr){
            ArrayList<String> bes=new ArrayList<String>();
            bes.add("");
            return bes;
        }
        ArrayList<String> hpath=new ArrayList<String>(); 
        ArrayList<String> vpath=new ArrayList<String>();
        if(sc<dc){
            hpath=getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpath=getMazePaths(sr+1,sc,dr,dc);
        }
        ArrayList<String> path=new ArrayList<String>();
        for(String res:hpath){
            path.add("h"+res);
        }
        for(String res:vpath){
            path.add("v"+res);
        }
        return path;
    }
}
