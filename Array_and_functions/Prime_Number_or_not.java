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
public class Prime_Number_or_not {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int prime=0;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                prime=1;
                break;
            }
        }
        if(prime==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}
