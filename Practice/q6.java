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

Repeated String
Write a program to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive
repeated word.
For example in the sentence "Rohan is a good good boy", the word "good" is repeated. The program should turn "Rohan is a good good boy"
into "Rohan is a good boy".
Input Format
The first line contains an integer denoting the number of sentences.
Each of the subsequent lines contains a sentence.
Output Format
In each line should display the input sentences after removing the repeated words leaving only the first occurrence.

*/
import java.util.*;
public class q6 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+" ";
        LinkedHashSet<String> l=new LinkedHashSet<String>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                l.add(word);
                word="";
            }else{
                word=word+s.charAt(i);
            }
        }
        for(String a:l){
            System.out.print(a+" ");
        }
    }
    
}
