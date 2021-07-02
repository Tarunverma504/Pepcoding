/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mind_Coder
 */
/*
Given an array in such a way that the elements stored in array are in increasing order initially and then after reaching to a peak element , elements stored are in decreasing order. Find the highest element.
Note: A[i] != A[i+1]
 

Example 1:

Input:
11
1 2 3 4 5 6 5 4 3 2 1
Output: 6
Explanation: Highest element is 6.
Example 2:

Input:
5
1 2 3 4 5
Output: 5
Explanation: Highest element is 5.

 

Your Task:
You don't need to read or print anything. Your task is to complete the function findPeakElement() which takes the array as the input parameter and returns teh highest element.
 

Expected Time Complexity: O(log(n))
Expected Space Complexity: O(1)
 

Constraints:
2 <= Size of array <= 200
1 <= Elements of the array <= 100000 
*/
import java.util.*;
public class Find_the_Highest_number__EASY__GFG {
  public static void main(String[] arg){
      /*
      Question:-" https://practice.geeksforgeeks.org/problems/find-the-highest-number2259/1/?category[]=Binary%20Search&category[]=Binary%20Search&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Samsung&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Samsung&page=1&query=category[]Binary%20Searchcompany[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Samsungpage1company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Samsungcategory[]Binary%20Search# "
      
      */
  }
  public int findPeakElement(List<Integer> a)
    {
        // Code here
        //System.out.println(a.size());
        for(int i=1;i<a.size();i++){
            if(a.get(i)<a.get(i-1)){
                return a.get(i-1);
            }
        }
        return a.get(a.size()-1);
    }
}
