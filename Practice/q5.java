/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author Mind_Coder
 */
/*
Mr. Jeetu has given an assignment for 10 credits. The problem of this assignment is to print those pairs from the array
which have sum equal to 20. Let us solve this problem to get full credits.
For example ,let the array is:
{10,5,15,16,4}
so the pairs with sum=20 are
{5,15} and {16,4}
*/
import java.util.*;
public class q5 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<n;i++){
           int temp=sum-arr[i];
           if(h.add(temp)==false){
               System.out.println(arr[i]+" "+temp);
           }
           else{
               h.add(arr[i]);
           }
        }
    }
}
