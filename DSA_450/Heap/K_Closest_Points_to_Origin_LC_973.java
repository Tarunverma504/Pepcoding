package DSA_450.Heap;

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
    
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

 

Example 1:


Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 

Constraints:

1 <= k <= points.length <= 104
-104 < xi, yi < 104
*/

import java.util.*;
public class K_Closest_Points_to_Origin_LC_973 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/k-closest-points-to-origin/description/?envType=list&envId=e9sr11es
        */
    }
    class Solution {
        class Pair{
            int x1;
            int x2;
            int dis;
            Pair(int x1, int x2,int dis){
                this.x1 = x1;
                this.x2 = x2;
                this.dis = dis;
            }
        }
        public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>(){
                public int compare(Pair p1, Pair p2){
                    return p1.dis - p2.dis;
                }
            });
            for(int i=0; i<points.length;i++){
                int p1 = points[i][0];
                int p2 = points[i][1];
                int dis = p1*p1 + p2*p2;
                pq.add(new Pair(p1, p2, dis));
            }
            int[][] ans = new int[k][2];
            int i=0;
            while(!pq.isEmpty() && k>0){
                Pair temp = pq.poll();
                ans[i][0] = temp.x1;
                ans[i][1] = temp.x2;
                i++;
                k--;
            }
            return ans;
        }
    }
}
