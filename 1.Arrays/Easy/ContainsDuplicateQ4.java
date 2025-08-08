// Ques-4
// Platform LeetCode 217 Easy
// Companies: Amazon Interview Qs
// Time Complexity: O(n log n), where n is the length of the input array due to sorting
// Space Complexity: O(1), as sorting is done in-place with no additional data structures
import java.util.*;

public class ContainsDuplicateQ4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean result = containsDup(arr);
        System.out.println(result);
    }
    static boolean containsDup(int[] arr) {
        Arrays.sort(arr);
        boolean ans = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                ans = true;
                return ans;
            }
        }
        return ans;
    }
}