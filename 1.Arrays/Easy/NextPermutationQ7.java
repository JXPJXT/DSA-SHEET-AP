// Ques-7
// Platform: LeetCode 31 (Medium)
// Companies: Uber, Goldman Sachs, Adobe (Interview Questions)
// Time Complexity: O(n) - Worst case full reverse of the array
// Space Complexity: O(1) - In-place transformation

import java.util.Arrays;

public class NextPermutationQ7 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(nums));
        
        nextPermutation(nums);
        
        System.out.println("After:  " + Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

       
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

   
        if (i != -1) {
            int j = n - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

 
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
