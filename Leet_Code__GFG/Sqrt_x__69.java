package Leet_Code__GFG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
public class Sqrt_x__69 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/sqrtx/
        */
    }
    static class Solution {
        public int mySqrt(int x) {
            if(x==0)
                return 0;
            int l=1;
            int r=x/2+1;
            int ans=0;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(mid==x/mid){
                    return mid;
                }
                else if(mid<x/mid){
                    ans=mid;
                    l=mid+1;
                }
                else
                    r=mid-1;
            }
            return ans;
        }
    }
}
