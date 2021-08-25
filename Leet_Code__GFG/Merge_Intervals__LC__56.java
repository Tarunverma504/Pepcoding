/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*/
import java.util.*;
public class Merge_Intervals__LC__56 {
    public static void main(String []arg){
        /*
        https://leetcode.com/problems/merge-intervals/
        */
    }
    class Solution {
        public class Pair implements Comparable<Pair> {
            int start;
            int end;
            public Pair(int start,int end){
                this.start=start;
                this.end=end;
            }
            public  int compareTo(Pair obj){
                if(this.start!=obj.start)
                    return this.start-obj.start;
                else
                    return  this.end-obj.end;
            }
        }
        public int[][] merge(int[][] intervals) {
            Pair p[]=new Pair[intervals.length];
            for(int i=0;i<intervals.length;i++){
                p[i]=new Pair(intervals[i][0],intervals[i][1]);
            }
            Arrays.sort(p);
            Stack<Pair> s=new Stack<Pair>();
            for(int i=0;i<p.length;i++){
                if(i==0)
                    s.push(p[i]);
                else{
                    Pair top = s.peek();
                    if(p[i].start > top.end)
                        s.push(p[i]);
                    else{
                        top.end=Math.max(p[i].end,top.end);
                    }
                }
            }
            int ans[][]=new int[s.size()][2];
            int k=s.size()-1;
            while(!s.isEmpty()){
                Pair num=s.pop();
                //System.out.println(num.start+" "+num.end);
                ans[k][0]=num.start;
                ans[k][1]=num.end;
                k--;

            }
            return ans;
        }
    }
}
