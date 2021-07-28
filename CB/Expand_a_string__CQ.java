/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CB;

/**
 *
 * @author Mind_Coder
 */

import java.util.*;
public class Expand_a_string__CQ {
    
    public static void main(String []agr){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(expandString(str));
        
    }
    public static String expandString(String str) {
    // Write your code here
    StringBuilder ans=new StringBuilder("");
    int prev=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        int count=0;
        while((i<str.length()) && (str.charAt(i)>='0' && str.charAt(i)<='9')){
          if(count==0){
            count=count+(str.charAt(i)-'0');
            i++;
          }
          else{
            count=count*10;
            count=count+(str.charAt(i)-'0');
            i++;
          }
        }
        while(count>1){
          ans.append(str.charAt(prev));
          count--;
        }
        //prev=i;
        i--;
        //System.out.println(count+" tar" +i);
      }
      else{
        ans.append(str.charAt(i));
        prev=i;
      }
    }
    //System.out.println(ans.toString());
    return ans.toString();
  }
}
