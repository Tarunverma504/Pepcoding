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
There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.

 

Example 1:

Input: points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
Example 2:

Input: points = [[1,2],[3,4],[5,6],[7,8]]
Output: 4
Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
Example 3:

Input: points = [[1,2],[2,3],[3,4],[4,5]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
- Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
 

Constraints:

1 <= points.length <= 105
points[i].length == 2
-231 <= xstart < xend <= 231 - 1
Accepted
176.9K
Submissions
335.6K
*/
import java.util.*;
public class Minimum_Number_of_Arrows_to_Burst_Balloons__LC__452 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
        */
    }
    static class Solution {
     class Pair{
        int start;
        int end;
        Pair(int start,int end){
            this.start=start;
            this.end = end;
        }
    }
    public int findMinArrowShots(int[][] points) {
        Pair p[] = new Pair[points.length];
        for(int i=0;i<points.length;i++){
            p[i]=new Pair(points[i][0],points[i][1]);
        }
        Arrays.sort(p,new Comparator<Pair>(){
           public int compare(Pair p1,Pair p2){
               if(p1.end<p2.end)
                   return -1;
               else
                   return 1;
                //return p1.end-p2.end;
           } 
        });
        for(int i=0;i<p.length;i++)
            System.out.println(p[i].start+" "+p[i].end);
        Stack<Pair> st = new Stack<>();
        st.push(p[0]);
        int count=1;
        for(int i=1;i<p.length;i++){
            Pair top = st.peek();
            if(p[i].start<=top.end){
                
                continue;
            }
            else{
                st.push(p[i]);
                count++;
            }
        }
        return count;
    }
}
}
