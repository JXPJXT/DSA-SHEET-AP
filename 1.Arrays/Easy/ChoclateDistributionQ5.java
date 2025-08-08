// Ques-5
// Platform: GFG
// Companies: Amazon Interview Qs
// Time Complexity: O(n log n), where n is the size of the input ArrayList due to sorting
// Space Complexity: O(1), as sorting is done in-place with no additional data structures
import java.util.*;

class ChoclateDistributionQ5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 3, 2, 4, 9, 12, 56));
        int m = 3;
        ChoclateDistributionQ5 obj = new ChoclateDistributionQ5();
        int result = obj.findMinDiff(arr, m);
        System.out.println("Minimum difference: " + result);
    }

    public int findMinDiff(ArrayList<Integer> arr, int m) {
        if (m == 0 || arr.size() == 0) {
            return 0;
        }
        Collections.sort(arr);
        if (arr.size() < m) {
            return -1;
        }
        int min_diff = arr.get(m - 1) - arr.get(0);
        for (int i = 1; i <= arr.size() - m; i++) {
            int current_diff = arr.get(i + m - 1) - arr.get(i);
            min_diff = Math.min(min_diff, current_diff);
        }
        return min_diff;
    }
}