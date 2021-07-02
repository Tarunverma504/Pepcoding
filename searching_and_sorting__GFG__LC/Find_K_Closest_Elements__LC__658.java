/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching_and_sorting__GFG__LC;

/**
 *
 * @author Mind_Coder
 */

/*
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 

Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:

Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
 

Constraints:

1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104
*/

import java.util.*;
public class Find_K_Closest_Elements__LC__658 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/find-k-closest-elements/
        */
    }
    public static class Pair implements Comparable<Pair>{
        int value,gap;
        Pair(){
            
        }
        Pair(int value,int gap){
            this.value=value;
            this.gap=gap;
        }
        public int compareTo(Pair o){
            if(this.gap==o.gap){
                return this.value-o.value;
            }
            else{
                return this.gap-o.gap;
            }
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        PriorityQueue<Pair> p=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            if(p.size()<k){
                p.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            }
            else{
                if(p.peek().gap>Math.abs(arr[i]-x)){
                    p.remove();
                    p.add(new Pair(arr[i],Math.abs(arr[i]-x)));
                }
            }
        }
        while(p.size()>0){
            Pair rem=p.peek();
            list.add(rem.value);
            p.remove();
            
        }
        Collections.sort(list);
        return list;
        
    }
}
