//Ques-11
//Platform: LeetCode 42 Hard
//Companies: Samsung Interview Qs
//Time Complexity: O(n)  -> We traverse the array once using two pointers.
//Space Complexity: O(1) -> We only use a few extra variables for pointers and max values.

import java.util.*;
public class TrappingRainWaterQ11{
    public static void main(String args[]){
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
         System.out.println(trap(height));
    }
    static int trap(int[] height){
        if(height.length==0){
            return 0;
        }
        int ans=0;
        int l=0;
        int r=height.length-1;
        int maxL=height[l];
        int maxR=height[r];
        while(l<r){
            if(maxL<maxR){
                ans+=maxL-height[l];
                maxL=Math.max(maxL,height[++l]);
            }
            else{
                ans+=maxR-height[r];
                maxR=Math.max(maxR,height[--r]);
            }
        }
        return ans;
    }
}