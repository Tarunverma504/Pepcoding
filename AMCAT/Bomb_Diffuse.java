/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AMCAT;

/**
 *
 * @author Mind_Coder
 */
/*
During the war, the enemy battalion has planted a bomb in your bunker. Your informer has sent you a message of the enemy which contains a list having N numbers and key(K) . The numbers have to be used to construct a sequence to diffuse the bomb. According to your informer, the logic to extract the sequence from the whole message is to replace each number with the sum of the next k elements , if the value of k is positive. When the value of K is negative, the number replaced by the sum of previous K numbers. The series of numbers is considered in a cyclic fashion for the last K numbers
Write an algorithm that finds the sequence to defuse the bomb
Input Format
Input to the function consist of three arguments
size , no of elements in the sequence
key , represents the K value
message, represents the sequence
Constraints
0<= size <= 10^5
-10^6 <= message[i] <= 10^6
0<= i <= size
Output Format
Return a list of integers representing the sequence to diffuse the bomb
Sample Input 0
4 3 
4 2 -5 11
Sample Output 0
8 10 17 1
*/
import java.util.*;
public class Bomb_Diffuse {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int b=0,c=0;
        for(int i=0;i<n;i++){
            b=i;
            c=k;
            int sum=0;
            if(arr[i]>0){
                while(c>0){
                    sum+=arr[(b+1)%n];
                    c--;
                    b++;
                }
            }
            else{
                while(c>0){
                    sum+=arr[(b+k)%n];
                    c--;
                    b--;
                }
            }
            System.out.print(sum+" ");
            
        }
    }
}
