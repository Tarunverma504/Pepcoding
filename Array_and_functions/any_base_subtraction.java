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

import java.util.*;
public class any_base_subtraction {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int n2=sc.nextInt();
        System.out.print("Enter the base of the numbers:-");
        int b=sc.nextInt();
        int result=getSub(n1,n2,b);
        System.out.println(result);
    }
    
    public static int getSub(int n1,int n2,int b){
        
        int c=0,p=1,rv=0;
        while(n2>0){
            int d1=n1%10;
            n1=n1/10;
            int d2=n2%10;
            n2=n2/10;
            int d=0;
            d1=d1+c;
            if(d1>=d2){
                c=0;
                d=d1-d2;
            }
            else{
                c=-1;
                d=d1+b-d2;
            }
            
            rv+=d*p;
            p=p*10;
           
        }
         return rv;
    }
    
    
}
