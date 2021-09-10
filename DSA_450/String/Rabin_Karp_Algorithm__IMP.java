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
public class Rabin_Karp_Algorithm__IMP {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        String pat=sc.nextLine();
        int q=101; // prime number just to reduce the number so that i can fit in interger range
        int d=10; //number of total alphabet
        int m=pat.length();
        int n=txt.length();
        int p=0;    //hash value of the pattern
        int t=0;    //hash value of txt
        int h=1;
        // the value of h wold be "pow(d, M-1)%q"
        for(int i=0;i<m-1;i++)
            h=(h*d)%q;
        for(int i=0;i<m;i++){
            p=(d*p+pat.charAt(i))%q;
            t=(d*t+txt.charAt(i))%q;
        }
        
        for(int i=0;i<n-m;i++){
            if(p==t){
                int j=0;
                for(j=0;j<m;j++){
                    if(txt.charAt(j)!=pat.charAt(j))
                        break;
                }
                if(j==m){
                    System.out.println("Pattern  found at index "+i);
                }
            }
            //t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+m) )%q;
            t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+m))%q;
            if(t<0)
                t=(t+q);
        }
        
        
        
        
        
        
    }
    
}
