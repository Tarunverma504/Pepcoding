/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.Array;

/**
 *
 * @author Mind_Coder
 */

/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:

Input: nums = [1]
Output: [1]
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
*/
import Leet_Code__GFG.*;
import java.util.*;
public class Next_Permutation__LC__31 {
    public static void main(String[] arg){
        /*
        https://leetcode.com/problems/next-permutation/
        */
    }
    class Solution {
        public void sorting(int []arr,int idx){

            for(int i=idx;i<arr.length;i++){
                for(int j=idx;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        public void nextPermutation(int[] arr) {
            boolean flag=false;
            if(arr.length==1){
                return ;
            }
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    flag=true;

                    break;
                }

            }
            if(flag!=true){
                Arrays.sort(arr);
            }
            else{

                int idx=0;
                int value=Integer.MAX_VALUE;
                int idx2=0;
                for(int i=arr.length-1;i>0;i--){
                    if(arr[i]>arr[i-1]){
                        idx=i-1;
                        for(int k=idx+1;k<arr.length;k++){
                            if(arr[k]>arr[idx] && arr[idx]<value){

                                value=arr[k];
                                idx2=k;
                            }
                        }
                        break;
                    }
                }


                int temp=arr[idx];
                arr[idx]=arr[idx2];
                arr[idx2]=temp;
                sorting(arr,idx+1);

            }
        }
    }

}
