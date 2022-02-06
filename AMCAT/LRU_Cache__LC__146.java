package AMCAT;

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
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.

 

Example 1:

Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4
 

Constraints:

1 <= capacity <= 3000
0 <= key <= 104
0 <= value <= 105
At most 2 * 105 calls will be made to get and put.

*/
import java.util.*;
public class LRU_Cache__LC__146 {
    
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/lru-cache/
        */
    }
    static class LRUCache {
        static class Node{
            int key;
            int val;
            Node next;
            Node prev;
            Node(int key,int val){
                this.key = key;
                this.val = val;
            }
        }

       public static int cap;
       public static Node head;
       public static Node tail;
       public static HashMap<Integer, Node> map ;
       public LRUCache(int capacity) {
           map = new HashMap<>();
           cap = capacity;
           head = new Node(0,0);
           tail = new Node(0,0);
           head.next = tail;
           tail.prev = head;

       }

       public int get(int key) {
           Node node = map.get(key);
           if(node==null)
               return -1;
           delete(node);
           insert(node);
           return node.val;
       }

       public void put(int key, int value) {

           if(map.containsKey(key))
               delete(map.get(key));
           if(map.size() == cap)
               delete(tail.prev);
           insert(new Node(key,value));
       }

       public static void insert(Node node){
           map.put(node.key,node);
           node.next = head.next;
           head.next.prev = node;
           node.prev = head;
           head.next = node;
       }

       public static void delete(Node node){
           map.remove(node.key);
           node.prev.next=node.next;
           node.next.prev = node.prev;
       }
   }
}
