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
Bishu went to fight for Coding Club. There were N soldiers with various powers. There will be Q rounds to fight and in each round, Bishu's power will be varied. With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M). After each round, All the soldiers who are dead in the previous round will reborn. Such that in each round there will be N soldiers to fight. As Bishu is weak in mathematics, help him to count the number of soldiers that he can kill in each round and the total sum of their powers.

INPUT:

The first line of the input contains N, the number of soldiers.

The second line contains an array of N numbers denoting the power of each soldier

This third line contains Q, which denotes the number of rounds.

Q lines follow, each line having one number denoting the power of Bishu.

OUTPUT:

For each round, the output should be an array of two numbers. The first number should be the number of soldiers that Bishu can beat, and the second number denotes the cumulative strength of all the soldiers that Bishu can beat.

CONSTRAINTS:

1<=N<=10000

1<=power of each soldier<=100

1<=Q<=10000

1<=power of bishu<=100

Sample Input
7
1 2 3 4 5 6 7
3
3
10
2
Sample Output
3 6
7 28
2 3
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
There are 7 soldiers, each with the indicated power.

There are 3 rounds.

In the first round, Bishu's power is 3, which is greater than 3 soldiers, with the cumulative power of 6. Hence, the answer is 3 6

Similarly for the next round.
*/

import java.util.*;
public class Bishu_and_Soldiers__HE {
    static int bs(int[] arr , int n , int k){
        if(arr[n-1] <= k)
            return n;
        if(arr[0] > k)
            return 0;
        int lo = 0;
        int hi = n-1;
        int mid;
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(arr[mid] == k && arr[mid+1] > k) 
                return mid+1;
            if(arr[mid] <= k )
                lo = mid+1;
            else 
                hi = mid-1;
        }
        return 0;
    }

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n+1];
        for(int i=0 ; i<n ; i++)
            arr[i] = s.nextInt();
        Arrays.sort(arr);
        for(int i=1 ; i<=n ; i++)
            res[i] += res[i-1] + arr[i-1];
        for(int i=0;i<=n;i++)
            System.out.print(res[i]+" ");
        int k = s.nextInt();
        while(k>0){
            int p = s.nextInt();
            int ans = bs(arr,n,p);
            int r = ans>0?res[ans]:0;
            System.out.println(ans+" "+r);
            k--;
        }
    }
}
