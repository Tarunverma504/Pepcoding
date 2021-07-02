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

Reeky Creeks Fun world is an entertainment complex. The owner of Reeky Creeks wants to implement a gondola lift
system that would connect some of its theme parks and hotels. Gondola lift is a seating compartment in a ski lift like
cable cars. The maximum permissible mass of each Gondola with occupants is 1000 kg.
Implement a software system to check the total weight in Gondola and throw an exception in case the total weight is
greater than permissible limit.
Weight of Gondola without occupants is 300 kg.

*/
import java.util.*;
class Warning extends Exception{
    public Warning(String str){
        super(str);
    }
}
public class q2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of persons:-");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try{
            int sum=300;
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
                if(sum>1000){
                    throw new Warning("Overloaded");
                }
            }
            System.out.println("Good to go");
        }
        catch(Warning e){
            System.out.println(e.getMessage());
        }
    }
}
