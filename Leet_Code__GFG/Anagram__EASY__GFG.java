
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet_Code__GFG;

/**
 *
 * @author Mind_Coder
 */
/*

Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are an anagram of each other.

Example 1:

Input:
a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same
characters with same frequency. So, 
both are anagrams.
Example 2:

Input:
a = allergy, b = allergic
Output: NO
Explanation:Characters in both the strings
are not same, so they are not anagrams.
Your Task:
You don't need to read input or print anything.Your task is to complete the function isAnagram() which takes the string a and string b as input parameter and check if the two strings are an anagram of each other. The function returns true if the strings are anagram else it returns false.

Expected Time Complexity: O(|a|+|b|).
Expected Auxiliary Space: O(Number of distinct characters).

Note: |s| represents the length of string s.

Constraints:
1 ≤ |a|,|b| ≤ 105

*/
public class Anagram__EASY__GFG {
    public static void main(String[] arg){
        /*
        https://practice.geeksforgeeks.org/problems/anagram-1587115620/1/?category[]=Strings&category[]=Strings&difficulty[]=0&page=1&sortBy=submissions&query=category[]Stringsdifficulty[]0page1sortBysubmissionscategory[]Strings
        */
    }
     public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        int []arr=new int[26];
        for(int i=0;i<a.length();i++){
            int index=a.charAt(i)-'a';
            arr[index]=arr[index]+1;
        }
        for(int i=0;i<b.length();i++){
            int index=b.charAt(i)-'a';
            arr[index]=arr[index]-1;
            //System.out.println(arr[i]);
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
        
    }
    
}
