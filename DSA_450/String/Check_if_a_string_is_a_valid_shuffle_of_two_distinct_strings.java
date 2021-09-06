/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_450.String;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
public class Check_if_a_string_is_a_valid_shuffle_of_two_distinct_strings {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String res=sc.nextLine();
        int l1=s1.length();
        int l2=s2.length();
        int lr=res.length();
        if((l1+l2)!=lr)
            System.out.println("No");
        else{
            int f=0;
            int i=0,j=0,k=0;
            while(k<lr){
                if(i<l1 && s1.charAt(i)==res.charAt(k)) i++;
                else if(j<l2 && s2.charAt(j)==res.charAt(k))j++;
                else{
                    f=1;
                    break;
                }
                k++;
            }
            if(i<l1 || j<l2)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
