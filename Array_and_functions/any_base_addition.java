/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_and_functions;

/**
 *
 * @author Mind_Coder
 */

/*

    (346)8 + (777)8 = (1345)8 

*/

import java.util.*;
public class any_base_addition {
     public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int n2=sc.nextInt();
        System.out.print("Enter the base of the numbers:-");
        int b=sc.nextInt();
        int result=getSum(n1,n2,b);
        System.out.println(result);
        
    }
    public static int getSum(int n1,int n2,int b){
        int c=0,p=1,rv=0;
        while(n1>0 ||n2>0 || c>0){
            int d1=n1%10;
            n1=n1/10;
            int d2=n2%10;
            n2=n2/10;
            
            int d=d1+d2+c;
            c=d/b;;
            d=d%b;
            
            rv+=d*p;
            p=p*10;
            
        }
        return rv;
    }
}
