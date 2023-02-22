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
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12
Input Format
Input is managed for you
Output Format
A number representing area of largest rectangle in histogram
Question Video

  COMMENTConstraints
0 <= n < 20
0 <= a[i] <= 10
Sample Input
7
6
2
5
4
5
1
6
Sample Output
12
*/

import java.util.*;
public class Largest_Area_Histogram {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = sc.nextInt();
        }
        // code
        Stack<Integer> s1=new Stack<Integer>();
        int left[]=new int[a.length];  // store index of the previous smaller element on left if not the -1
        left[0]=-1;
        s1.push(0);
        for(int i=1;i<a.length;i++){
            while(!s1.isEmpty() && a[i]<=a[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty())
                left[i]=-1;
            else
                left[i]=s1.peek();
            s1.push(i);
        }
        Stack<Integer> s2=new Stack<Integer>();
        int right[]=new int[a.length]; // store the next smaller element if not the array.length
        s2.push(a.length-1);
        right[a.length-1]=a.length;
        for(int i=a.length-2;i>=0;i--){
            while(!s2.isEmpty() && a[i]<=a[s2.peek()]){
                s2.pop();
            }
            if(s2.isEmpty())
                right[i]=a.length;
            else
                right[i]=s2.peek();
            s2.push(i);
        }

        int ans=0;
        for(int i=0;i<a.length;i++){
            int width=right[i]-left[i]-1;
            int area=a[i]*width;
            if(area>ans)
                ans=area;
        }
        System.out.println(ans);
     }
    
}
