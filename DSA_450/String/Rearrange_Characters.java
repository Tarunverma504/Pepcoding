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
/*
        Given a string S with repeated characters. The task is to rearrange characters in a string such that no two adjacent characters are the same.
    Note: The string has only lowercase English alphabets and it can have multiple solutions. Return any one of them.

    Example 1:

    Input : str = "geeksforgeeks"
    Output: 1
    Explanation: All the repeated characters of the
    given string can be rearranged so that no 
    adjacent characters in the string is equal.
    Any correct rearrangement will show a output
    of 1.
    Example 2:

    Input : str = "bbbbb"
    Output: 0
    Explanation: Repeated characters in the string
    cannot be rearranged such that there should not
    be any adjacent repeated character.
    Your task :
    You don't have to read input or print anything. Your task is to complete the functionrearrangeString() which takes the string as input and returns the modified string. If the string cannot be modified return "-1".
    Note:The generatedoutput is 1 if the string is successfully rearranged and is 0 if rearranging is not possible.
*/
public class Rearrange_Characters {
    public static void main(String arg[]){
        /*
            https://practice.geeksforgeeks.org/problems/rearrange-characters4649/1
        */
    }
    static class Solution
    {
            public static String rearrangeCharacters(String str) {

                if(str.length()==0)
                    return "";
                    //code here
                    int[] freq = new int[26];
                    Arrays.fill(freq, 0);
                    for(int i=0; i<str.length(); i++){
                        char ch= str.charAt(i);
                        freq[(int)ch - (int)'a']++;
                    }
                    char ch = getMax(freq);
                    if(freq[(int)ch - (int)'a']>str.length()+1/2){
                        return "";
                    }
                    int i=0;
                    char arr[] = new char[str.length()];
                    for(i=0;i<str.length() && freq[(int)ch - (int)'a']>0; i=i+2){
                        arr[i]=ch;
                        freq[(int)ch - (int)'a']--;
                    }
                    int j=0;
                    while(i<str.length()){
                        if(j<=0){
                            j++;
                            continue;
                        }
                        arr[i]=(char)((int)'a' + j);
                        freq[j]--;
                        i=i+2;
                    }
                    i=1;
                    while(i<str.length()){
                        if(freq[j]<=0){
                            j++;
                            continue;
                        }
                        arr[i]=(char)((int)'a' + j);
                        freq[j]--;
                        i=i+2;
                    }
                    for(int k=0;k<arr.length;k++){
                        System.out.print(arr[k]);
                    }
                    String ans = new String(arr);
                    return ans;
            }

            public static char getMax(int[] freq){
                int max = Integer.MIN_VALUE;
                char ch=0;
                for(int i=0;i<freq.length; i++){
                    if(freq[i]>max){
                        max = freq[i];
                        ch = (char)((int)'a' + i);
                    }
                }
                return ch;
            }
    }
}
