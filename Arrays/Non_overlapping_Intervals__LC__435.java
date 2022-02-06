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
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

 

Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 

Constraints:

1 <= intervals.length <= 105
intervals[i].length == 2
-5 * 104 <= starti < endi <= 5 * 104
Accepted
213.9K
Submissions
450.6K
*/
import java.util.*;
public class Non_overlapping_Intervals__LC__435 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/non-overlapping-intervals/
        */
    }
    class Solution {
        class Pair{
            int start;
            int end;
            Pair(int start,int end){
                this.start=start;
                this.end = end;
            }
        }
        public int eraseOverlapIntervals(int[][] intervals) {
            Pair p[] = new Pair[intervals.length];
            for(int i=0;i<intervals.length;i++){
                p[i]=new Pair(intervals[i][0],intervals[i][1]);
            }
            Arrays.sort(p,new Comparator<Pair>(){
               public int compare(Pair p1,Pair p2){
                 return p1.end-p2.end;
               } 
            });
            Stack<Pair> st = new Stack<>();
            st.push(p[0]);
            int count=0;
            for(int i=1;i<p.length;i++){
                Pair top = st.peek();
                if(p[i].start<top.end){
                    count++;
                }
                else{
                    st.push(p[i]);
                }
            }
            return count;

        }
    }
}
