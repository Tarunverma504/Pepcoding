/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Stack_and_Queue;

/**
 *
 * @author Mind_Coder
 */
/*
    Find the number of occurrences of a given search word in a 2d-Array of characters where the word can go up, down, left, right, and around 90-degree bends.
Note: While making a word you can use one cell only once.


Example 1:

Input: 
R = 4, C = 5
mat = {{S,N,B,S,N},
       {B,A,K,E,A},
       {B,K,B,B,K},
       {S,E,B,S,E}}
target = SNAKES
Output:
3
Explanation: 
S N B S N
B A K E A
B K B B K
S E B S E
Total occurrence of the word is 3
and denoted by color.
Example 2:

Input:
R = 3, C = 3 
mat = {{c,a,t},
       {a,t,c},
       {c,t,a}}
target = cat
Output:
5
Explanation: Same explanation
as first example.

Your task:
You don't need to read input or print anything. Your task is to complete the function findOccurrence() which takes the mat containing N*M 2-d array of characters and target as input parameters and returns the number of occurrences of the target.
*/
public class Count_occurrences_of_a_given_word_in_a_2d_array {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/count-occurences-of-a-given-word-in-a-2-d-array/1
        */
    }
    static class Solution
    {
        public int findOccurrence(char mat[][], String target)
        {
            // Write your code here
            int count=0;
            for(int i=0;i<mat.length; i++){
                for(int j=0;j<mat[0].length; j++){
                    count += sol(mat, target, i, j, 0);
                }
            }
            return count;

        }

        public static int sol(char[][] arr, String target, int  i, int j, int idx){
            int found=0;

            if(i>=0&& j>=0 && i<arr.length && j<arr[0].length && arr[i][j]==target.charAt(idx)){
                char temp = arr[i][j];
                arr[i][j]=0;
                idx++;
                if(idx==target.length()){
                    found =1;
                }

                else{
                    found += sol(arr, target, i+1, j, idx);
                    found += sol(arr, target, i-1, j, idx);
                    found += sol(arr, target, i, j+1, idx);
                    found += sol(arr, target, i, j-1, idx);
                }
                arr[i][j]=temp;
            }

            return found;
        }
    }
}
