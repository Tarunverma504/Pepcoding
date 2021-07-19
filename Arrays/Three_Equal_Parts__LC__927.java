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
You are given an array arr which consists of only zeros and ones, divide the array into three non-empty parts such that all of these parts represent the same binary value.

If it is possible, return any [i, j] with i + 1 < j, such that:

arr[0], arr[1], ..., arr[i] is the first part,
arr[i + 1], arr[i + 2], ..., arr[j - 1] is the second part, and
arr[j], arr[j + 1], ..., arr[arr.length - 1] is the third part.
All three parts have equal binary values.
If it is not possible, return [-1, -1].

Note that the entire part is used when considering what binary value it represents. For example, [1,1,0] represents 6 in decimal, not 3. Also, leading zeros are allowed, so [0,1,1] and [1,1] represent the same value.

 

Example 1:

Input: arr = [1,0,1,0,1]
Output: [0,3]
Example 2:

Input: arr = [1,1,0,1,1]
Output: [-1,-1]
Example 3:

Input: arr = [1,1,0,0,1]
Output: [0,2]
 

Constraints:

3 <= arr.length <= 3 * 104
arr[i] is 0 or 1
*/
import java.util.*;
public class Three_Equal_Parts__LC__927 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/three-equal-parts/
        */
    }
    class Solution {
    public int[] threeEqualParts(int[] arr) {
        int z=1;
        int res[]={-1,-1};
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                h.put(z++,i);
            }
        }
        if(count==0){
            res[0]=0;
            res[1]=arr.length-1;
            return res;
        }
        
        if(count%3!=0){
            return res;
        }
        else{
            int p1=h.get(1);
            int p2=h.get(count/3+1);
            int p3=h.get(2*count/3+1);
            while(p3<arr.length){
                if(arr[p1]==arr[p2] && arr[p2]==arr[p3]){
                    p1++;
                    p2++;
                    p3++;
                    
                }
                else
                    return res;
            }
            res[0]=p1-1;
            res[1]=p2;
        }
        return res;
    }
}
}
