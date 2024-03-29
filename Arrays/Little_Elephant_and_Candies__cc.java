/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mind_Coder
 */
/*

A Little Elephant and his friends from the Zoo of Lviv like candies very much.

There are N elephants in the Zoo. The elephant with number K (1 ≤ K ≤ N) will be happy if he receives at least AK candies. There are C candies in all in the Zoo.

The Zoo staff is interested in knowing whether it is possible to make all the N elephants happy by giving each elephant at least as many candies as he wants, that is, the Kth elephant should receive at least AK candies. Each candy can be given to only one elephant. Print Yes if it is possible and No otherwise.

Input
The first line of the input file contains an integer T, the number of test cases. T test cases follow. Each test case consists of exactly 2 lines. The first line of each test case contains two space separated integers N and C, the total number of elephants and the total number of candies in the Zoo respectively. The second line contains N space separated integers A1, A2, ..., AN.

Output
For each test case output exactly one line containing the string Yes if it possible to make all elephants happy and the string No otherwise. Output is case sensitive. So do not print YES or yes.

Constraints
1 ≤ T ≤ 1000

1 ≤ N ≤ 100

1 ≤ C ≤ 109

1 ≤ AK ≤ 10000, for K = 1, 2, ..., N

Example
Input:
2
2 3
1 1
3 7
4 2 2

Output:
Yes
No

Explanation
Case 1. We can give one candy to the first elephant and two candies to the second elephant and make them both happy. Hence the answer is Yes. Alternatively we can give one candy to each elephant and left one candy for ourselves but they again will be happy.

Case 2. Even if we give four candies to the first elephant and two candies to the second elephant we will have only one candy left and can not make last elephant happy since he needs two candies for his happiness. Hence the answer is No.



*/
import java.util.*;
public class Little_Elephant_and_Candies__cc {
   public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
		    int sum=0;
		    int n=sc.nextInt();
		    int c=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        sum=sum+a[i];
		    }
		    if(sum<=c){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	} 
}
