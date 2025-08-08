// Q-3
// Platform LeetCode 53 Medium
// Companies: Microsoft + Facebook Interview Qs
// Time Complexity: O(n), where n is the length of the input array nums
// Space Complexity: O(1), as only a constant amount of extra space is used
public class MaxSubArrQ3 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
    static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int currentMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }
}