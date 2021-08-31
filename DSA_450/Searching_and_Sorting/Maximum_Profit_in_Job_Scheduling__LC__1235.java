package DSA_450.Searching_and_Sorting;

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
We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].

You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no two jobs in the subset with overlapping time range.

If you choose a job that ends at time X you will be able to start another job that starts at time X.

 

Example 1:



Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
Output: 120
Explanation: The subset chosen is the first and fourth job. 
Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
Example 2:



Input: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
Output: 150
Explanation: The subset chosen is the first, fourth and fifth job. 
Profit obtained 150 = 20 + 70 + 60.
Example 3:



Input: startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
Output: 6
 

Constraints:

1 <= startTime.length == endTime.length == profit.length <= 5 * 104
1 <= startTime[i] < endTime[i] <= 109
1 <= profit[i] <= 104
*/

import java.util.*;
public class Maximum_Profit_in_Job_Scheduling__LC__1235 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/maximum-profit-in-job-scheduling/
        */
    }
    static class Solution {
        public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
            int n=startTime.length;
            Job j[]=new Job[n];

            for(int i=0;i<n;i++){
                j[i]=new Job(startTime[i],endTime[i],profit[i]);
            }
            Arrays.sort(j);
            int dp[]=new int[n];
            dp[0]=j[0].p;
            for(int i=1;i<n;i++){
                int inc=j[i].p;
                int last=-1;
                int l=0;
                int r=i-1;
                while(l<=r){
                    int mid=(l+r)/2;
                    if(j[mid].e<=j[i].s){
                        last=mid;
                        l=mid+1;
                    }
                    else r=mid-1;
                }
                if(last!=-1)
                    inc+=dp[last];
                int exc=dp[i-1];
                dp[i]=Math.max(inc,exc);
            }

            return dp[n-1];

        }
         public static class Job implements Comparable<Job> {
            int s; // startTime
            int e; // endTime
            int p; // profit

            public Job(int startTime, int endTime, int profit) {
                this.s = startTime;
                this.e = endTime;
                this.p = profit;
            }

            public int compareTo(Job other) {
                if (this.e != other.e) return this.e - other.e;
                if (this.s != other.s) return this.s - other.s;
                return this.p - other.p;
            }
        }
    }
}
