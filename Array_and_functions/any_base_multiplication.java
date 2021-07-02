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
public class any_base_multiplication {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:-");
        int n1= sc.nextInt();
        System.out.print("Enter Second number:-");
        int n2=sc.nextInt();
        System.out.print("Enter Base of the number:-");
        int b=sc.nextInt();
        int d=getProduct(n1,n2,b);
        System.out.println(d);
    }
    public static int getProduct(int n1,int n2,int b){
        int rv=0,p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;
            int sprd=getProductWithSingleDigit(b,n1,d2);
            rv=getSum(b,rv,sprd*p);
            p=p*10;
        }
        return rv;
    }
    
    public static int getProductWithSingleDigit(int b,int n1,int d2){
        int rv=0,c=0,p=1;
        while(n1>0 || c>0){
            int d1=n1%10;
            n1=n1/10;
            int d=d1*d2+c;
            c=d/b;
            d=d%b;
            rv+= d*p;
            p=p*10;
        }
        return rv;
    }
    public static int getSum(int b,int n1,int n2){
        int rv=0,c=0,p=1;
        
        while(n1>0 || n2>0 ||c>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;
            rv+= d*p;
            p=p*10;
        }
        return rv;
    }

       
}
