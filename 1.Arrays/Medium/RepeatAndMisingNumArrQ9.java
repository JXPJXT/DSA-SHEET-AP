//Ques-9
//Platform: InterviewBit Medium
//Companies: Amazon Interview Qs
//Time Complexity: O(n) — single pass to calculate sums, constant math at the end.
//Space Complexity: O(1) — no extra DS used, just variables.

import java.util.*;
public class RepeatAndMisingNumArrQ9 {
    static int[] repeatedNumber(final int[] arr){
        int n = arr.length;
        long S = (long)n*(n+1)/2;
        long S2 = (long)n*(n+1)*(2L*n+1)/6;
        long S_actual=0,S2_actual=0;
        for(int num:arr){
            S_actual+=num;
            S2_actual+=(long)num*num;
        }
        long diff1 = S_actual-S;
        long diff2 = S2_actual-S2;
        long sumAB =diff2/diff1;
        long A=(diff1+sumAB)/2;
        long B=A-diff1;
        return new int[]{(int)A, (int) B};
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};
        int[] res = repeatedNumber(arr);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}