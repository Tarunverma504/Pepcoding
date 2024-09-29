/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie;

/**
 *
 * @author Mind_Coder
 */
/*

You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.

Return the number of strings in words that are a prefix of s.

A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
Output: 3
Explanation:
The strings in words which are a prefix of s = "abc" are:
"a", "ab", and "abc".
Thus the number of strings in words which are a prefix of s is 3.
Example 2:

Input: words = ["a","a"], s = "aa"
Output: 2
Explanation:
Both of the strings are a prefix of s. 
Note that the same string can occur multiple times in words, and it should be counted each time.
 

Constraints:

1 <= words.length <= 1000
1 <= words[i].length, s.length <= 10
words[i] and s consist of lowercase English letters only.
*/
import java.util.*;
public class Count_Prefixes_of_a_Given_String_LC_2255 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/count-prefixes-of-a-given-string/description/
        */
    }
    class Solution {
        class TrieNode{
            Map<Character, TrieNode> map;
            public TrieNode(){
                map = new HashMap<>();
            }
        }

        void addTrie(String str){
            TrieNode curr = root;
            for(char ch: str.toCharArray()){
                if(curr.map.containsKey(ch)){
                    curr = curr.map.get(ch);
                }
                else{
                    TrieNode node = new TrieNode();
                    curr.map.put(ch, node);
                    curr = node;
                }
            }
        }
        private TrieNode root;

        boolean isContains(String word){
            TrieNode curr = root;
            for(char ch : word.toCharArray()){
                if(curr.map.containsKey(ch)){
                    curr = curr.map.get(ch);
                }
                else{
                    return false;
                }
            }
            return true;
        }
        public int countPrefixes(String[] words, String s) {
            root = new TrieNode();
            addTrie(s);
            int count =0;
            for(String word: words){
                if(word.length() > s.length())
                    continue;
                if(isContains(word))
                    count++;
            }
            return count;
        }
    }
}
