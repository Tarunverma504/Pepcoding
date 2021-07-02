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
import java.util.*;
public class Pangram_Checking {
    public static void main(String[] arg){
        List<String> l=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            
            String a=sc.nextLine();
            l.add(a);
        }
        boolean b[]= isPangram(l);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        
    }
    public static boolean[] isPangram(List<String> strings){
        boolean[] boo=new boolean[strings.size()];
        int k=0;
        for(String x:strings){
            int flag=0;
            LinkedHashMap<Character,Integer> h=new LinkedHashMap<Character,Integer>();
            for(char ch='a';ch<='z';ch++){
                h.put(ch,0);
            }
            String str=x;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                    int freq=h.get(str.charAt(i))+1;
                    h.put(str.charAt(i),freq);
                }
            }
            for(Map.Entry m:h.entrySet()){
                if((int)m.getValue()== 0){
                    boo[k]=false;
                    k++;
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                 boo[k]=true;
                 k++;
            }
        }
        return boo;
    }
}
