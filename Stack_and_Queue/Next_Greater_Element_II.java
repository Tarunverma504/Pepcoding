/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_and_Queue;

/**
 *
 * @author Mind_Coder
 */
/*
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
1: 1 <= nums.length <= 10^4
2: -10^9 <= nums[i] <= 10^9
Sample Input
3
1
2
1
Sample Output
3
2
-1
2

*/
import java.util.*;
public class Next_Greater_Element_II {
    public static void main(String arg[]){
        /*
            https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/stacks/next-greater-element-ii-official/ojquestion
        */
    }
    public static int[] nextGreaterElementII(int[] arr) {
        int n=arr.length;
        int temp[]= new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(arr[arr.length-1]);
		temp[arr.length-1]=-1;
		for(int i=arr.length-2;i>=0;i--){
			while(!st.isEmpty() && arr[i]>=st.peek())
				st.pop();
			if(st.isEmpty())
				temp[i]=-1;
			else
				temp[i]=st.peek();
			st.push(arr[i]);
		}
		Stack<Integer> st2= new Stack<>();
		for(int i=0;i<arr.length;i++){
			if(temp[i]==-1){
				for(int j=0;j<i;j++){
					if(arr[j]>arr[i]){
						temp[i]=arr[j];
						break;
					}
						
				}
			}
		}
		return temp;
    }
}
