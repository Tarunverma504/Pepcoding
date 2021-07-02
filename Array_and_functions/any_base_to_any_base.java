/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *'ackage Array_and_functions;
0
/**
 *
 * @author Mind_Coder
 */

/*

    (103)8 = (1000011)2

*/
import java.util.*;
public class any_base_to_any_base {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int n=sc.nextInt();
        System.out.print("Enter the base of number which you enter recently:- ");
        int b1=sc.nextInt();
        System.out.print("Enter the base in which you want to convert:- ");
        int b2=sc.nextInt();
        int decimalvalue = getValueInDecimal(n,b1);
        int basevalue=getValueInBase(decimalvalue,b2);
        System.out.println(basevalue);
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
    
    public static int getValueInBase(int n,int b2){
        int rv=0,p=1;
        
        while(n>0){
            int d=n%b2;
            n=n/b2;
            rv+=d*p;
            p=p*10;
        }
        return rv;
    }
    
}
