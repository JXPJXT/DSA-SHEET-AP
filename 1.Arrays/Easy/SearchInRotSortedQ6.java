// Ques-6
// Platform: LeetCode 33 Medium
// Companies: Microsoft, Google, Adobe, Amazon, D-E-Shaw, Flipkart, Hike, Intuit, MakeMyTrip, Paytm
// Time Complexity: O(log n) - Binary search in rotated sorted array
// Space Complexity: O(1) - Constant extra space

public class SearchInRotSortedQ6 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(nums, target);
        System.out.println("Index of target " + target + " is: " + result);

        int missingTarget = 3;
        int missingResult = search(nums, missingTarget);
        System.out.println("Index of target " + missingTarget + " is: " + missingResult);
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            final int m = (l + r) / 2;
            if (nums[m] == target)
                return m;

            if (nums[l] <= nums[m]) { 
                if (nums[l] <= target && target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            } else { 
                if (nums[m] < target && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }
        }

        return -1;
    }
}
