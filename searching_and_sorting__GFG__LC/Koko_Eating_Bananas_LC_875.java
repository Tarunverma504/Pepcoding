package searching_and_sorting__GFG__LC;

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
    Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
 

Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
*/
public class Koko_Eating_Bananas_LC_875 {
    public static void main(String arg[]){
        /*
            https://leetcode.com/problems/koko-eating-bananas/
        */
    }
    
    static class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int max=piles[0];
            int speed=0;
            for(int i=0;i<piles.length;i++)
                max=(int)Math.max(max,piles[i]);

            if(h==piles.length)
                return max;
            else if(h<piles.length)
                return -1;
            else{
                int l=1,r=max;
                while(l<=r){
                    int mid=l+(r-l)/2;
                    if(possible(piles,mid,h)){
                        speed=mid;
                        r=mid-1;
                    }
                    else{
                        l=mid+1;
                    }

                }
                return speed;
            }

        }

        public boolean possible(int[] piles,int mid,int h){

            int time =0;
            for(int i=0;i<piles.length;i++){
                time += piles[i]/mid;
                if(piles[i]%mid>0)
                    time += 1;
            }
            if(time<=0)
                return false;
            return time<=h;
        }
    }
}
