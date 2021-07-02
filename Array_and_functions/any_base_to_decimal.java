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

    (103)8 = (67)10
*/
import java.util.*;
public class any_base_to_decimal {
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number:- ");
       int n1=sc.nextInt();
       System.out.print("Enter base of the number which you enter :- ");
       int b=sc.nextInt();
       int value=getValueInDecimal(n1,b);
       System.out.println(value);
    }
    
    public static int getValueInDecimal(int n,int b){
        int rv=0,p=1;
        while(n>0){
            int d=n%10;
            n=n/10;
            rv+=d*p;
            p=p*b;
        }
        return rv;
    }  
}
