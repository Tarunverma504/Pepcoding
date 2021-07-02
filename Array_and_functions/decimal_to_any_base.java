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

  (67)10 = (103)8
*/
import java.util.*;
public class decimal_to_any_base {
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number:- ");
       int n1=sc.nextInt();
       System.out.print("Enter base in which you want to convert:- ");
       int b=sc.nextInt();
       int value=getValueBase(n1,b);
       System.out.println(value);
    }
    
    public static int getValueBase(int n,int b){
        int p=1,rv=0;
        while(n>0){
            int d=n%b;
            n=n/b;
            rv+=d*p;
            System.out.println(rv+" "+n);
            p=p*10;
        }
        return(rv);
    }
    
}
