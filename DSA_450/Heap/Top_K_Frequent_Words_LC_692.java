package DSA_450.Heap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 

Constraints:

1 <= words.length <= 500
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
k is in the range [1, The number of unique words[i]]
 

Follow-up: Could you solve it in O(n log(k)) time and O(n) extra space?
*/
import java.util.*;
public class Top_K_Frequent_Words_LC_692 {
    public static void main(String[] arg){
        /*
            https://leetcode.com/problems/top-k-frequent-words/description/?envType=list&envId=e9sr11es
        */
    }
    class Solution {
        class Pair{
            String key;
            int freq;
            Pair(String key, int freq){
                this.key = key;
                this.freq = freq;
            } 
        }
        public List<String> topKFrequent(String[] words, int k) {

            List<String> ans = new ArrayList<String>();
            HashMap<String, Integer> hm = new HashMap<>();
            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
                    public int compare(Pair p1, Pair p2){
                        if(p1.freq == p2.freq){
                            String s1 = p1.key;
                            String s2 = p2.key;
                            return s1.compareTo(s2);
                        }

                        return p2.freq-p1.freq;
                    }
                });
            for(int i=0; i<words.length; i++){
                hm.put(words[i], hm.getOrDefault(words[i], 0)+1);
            }

            for(Map.Entry<String, Integer> map: hm.entrySet()){
                pq.add(new Pair(map.getKey(), map.getValue()));
            }

            for(int i=0;i<k;i++){
                ans.add(pq.remove().key);
            }
            return ans;
        }
    }
}
