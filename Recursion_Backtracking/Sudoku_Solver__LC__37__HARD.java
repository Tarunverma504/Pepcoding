package Recursion_Backtracking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.

 

Example 1:


Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:


 

Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit or '.'.
It is guaranteed that the input board has only one solution.
*/
import java.util.*;
public class Sudoku_Solver__LC__37__HARD {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/sudoku-solver/
        */
    }
    static class Solution {
        public void solveSudoku(char[][] board) {
            int n=board.length;
            solve(board,0,0,n);
        }
        boolean isNumberAlreadyPresent(char board[][],int i,int j,char num,int n){
            //check row and column
            for(int k=0; k<n; k++){
                if(board[i][k]==num || board[k][j]==num)
                    return true;
            }

            //check with in box
            n=(int)Math.sqrt(n);
            int starti=(i/n)*n;
            int startj=(j/n)*n;
            for(int l=starti; l<starti+n; l++){
                for(int r=startj; r<startj+n; r++){
                    if(board[l][r]==num){
                        return true;
                    }
                }
            }
            return false;
        }
        boolean solve(char board[][],int i,int j,int n){
            if(i==n){
                return true;
            }
            if(j==n){
                return solve(board,i+1,0,n);
            }

            if(board[i][j]!='.'){
                return solve(board,i,j+1,n);
            }
            for(int number=1;number<=n;number++){
                char num=(char) (number+'0');
                if(isNumberAlreadyPresent(board,i,j,num,n)==false){ 
                        board[i][j]=num;
                    boolean kyaBakiAnsMila=solve(board,i,j+1,n);
                    if(kyaBakiAnsMila==true)
                        return true;
                    board[i][j]='.';
                }
            }
            return false;
        }
    }
}
