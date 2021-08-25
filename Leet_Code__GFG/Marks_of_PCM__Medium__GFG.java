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
You are provided with marks of N students in Physics, Chemistry and Maths.
Perform the following 3 operations: 

Sort the students in Ascending order of their Physics marks.
Once this is done, sort the students having same marks in Physics in the descending order of their Chemistry marks.
Once this is also done, sort the students having same marks in Physics and Chemistry in the ascending order of their Maths marks.
Example 1:

Input:
N = 10
phy[] = {4 1 10 4 4 4 1 10 1 10}
chem[] = {5 2 9 6 3 10 2 9 14 10}
math[] = {12 3 6 5 2 10 16 32 10 4}
Output:
1 14 10
1 2 3
1 2 16
4 10 10
4 6 5
4 5 12
4 3 2
10 10 4
10 9 6
10 9 32
Explanation: Firstly, the Physics marks of 
students are sorted in ascending order.
Those having same marks in Physics have
their Chemistry marks in descending order.
Those having same marks in both Physics
and Chemistry have their Math marks in
ascending order.

Your Task:

You don't need to read input or print anything. Your task is to complete the function customSort() which takes  phy[],  chem[],  math[]  and an integer N denoting the marks and the number of students. The function sorts the marks in the described order and the final changes should be made in the given arrays only.


Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).


Constraints:
1 <= N <= 10000
*/
import searching_and_sorting__GFG__LC.*;
import java.util.*;
public class Marks_of_PCM__Medium__GFG {
    public static void mian(String []arg){
        /*
        https://practice.geeksforgeeks.org/problems/marks-of-pcm2529/1
        */
    }
     public static class Marks implements Comparable<Marks>{
            int phy,chem,math;
            Marks(int phy,int chem,int math){
                this.phy=phy;
                this.chem=chem;
                this.math=math;
            }
            public int compareTo(Marks o){
                System.out.println(this.phy+"-----"+o.phy);
                if(this.phy!=o.phy){
                    return this.phy-o.phy;
                }
                else if(this.chem!=o.chem){
                    return o.chem-this.chem;
                }
                else{
                    return this.math-o.math;
                }
            }
    }
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        // your code here
        Marks []a=new Marks[N];
        for(int i=0;i<N;i++){
            a[i]=new Marks(phy[i],chem[i],math[i]);
        }
        Arrays.sort(a);
        for(int i=0;i<N;i++){
            phy[i]=a[i].phy;
            chem[i]=a[i].chem;
            math[i]=a[i].math;
            
        }
    }
}
