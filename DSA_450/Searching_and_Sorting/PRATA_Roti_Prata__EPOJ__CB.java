/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Searching_and_Sorting;

/**
 *
 * @author Mind_Coder
 */

/*

IEEE is having its AGM next week and the president wants to serve cheese prata after the meeting. The subcommittee members are asked to go to food connection and get P(P<=1000) pratas packed for the function. The stall has L cooks(L<=50) and each cook has a rank R(1<=R<=8). A cook with a rank R can cook 1 prata in the first R minutes 1 more prata in the next 2R minutes, 1 more prata in 3R minutes and so on(he can only cook a complete prata) ( For example if a cook is ranked 2.. he will cook one prata in 2 minutes one more prata in the next 4 mins an one more in the next 6 minutes hence in total 12 minutes he cooks 3 pratas in 13 minutes also he can cook only 3 pratas as he does not have enough time for the 4th prata). The webmaster wants to know the minimum time to get the order done. Please write a program to help him out.

 

Input
The first line tells the number of test cases. Each test case consist of 2 lines. In the first line of the test case we have P the number of prata ordered. In the next line the first integer denotes the number of cooks L and L integers follow in the same line each denoting the rank of a cook.

Output
Print an integer which tells the number of minutes needed to get the order done.

 

Example
Input:

3
10
4 1 2 3 4
8
1 1
8
8 1 1 1 1 1 1 1 1
Output:
12
36
1
*/

import java.util.*;
public class PRATA_Roti_Prata__EPOJ__CB {
    public static boolean isValid(int []cook,int n,int p,int mid){
		int time=0;
		int parantha=0;
		for(int i=0;i<n;i++){
			time=cook[i];
			int j=2;
			while(time<=mid){
				parantha++;
				time+=cook[i]*j;
				j++;
			}
			if(parantha>=p)
					return true;
		}
		return false;

	}
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int p=sc.nextInt();
		 int n=sc.nextInt();
		 int cook[]=new int[n];
		 for(int i=0;i<n;i++)
		 	cook[i]=sc.nextInt();
		int l=0;
		int r=1000000;
		int ans=0;
		while(l<=r){
			int mid=(l+r)/2;
			if(isValid(cook,n,p,mid)){
				//System.out.println(mid);
				ans=mid;
				r=mid-1;
			}
			else
				l=mid+1;
		}
		System.out.println(ans);
    }
    
}
