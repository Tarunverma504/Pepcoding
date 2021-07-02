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
import java.util.*;
public class Mean_of_range_in_array__EASY__GFG {
    	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            int q = sc.nextInt();
            int queries[] = new int[2*q + 1];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<2*q;i++){
                queries[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> v;
            v = obj.findMean(a,queries,n,2*q);
            for(int i:v)
                System.out.print(i+" ");
            System.out.println();
        }
        
	}
}
class Solution{
    
    public ArrayList<Integer> findMean(int arr[],int queries[],int n,int q){
        
        // Complete the function
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<queries.length-1;i=i+2){
            int sum=0,count=0;
            for(int j=queries[i];j<=queries[i+1];j++){
                sum+=arr[j];
                count++;
            }
            
            int mean=(int)Math.floor(sum / count);
            a.add(mean);
        }
        return a;
    
    }    
    
}

