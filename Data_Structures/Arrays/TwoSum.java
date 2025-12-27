package Arrays;
/**
 * Problem: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * * Time Complexity: O(n) - We traverse the list containing n elements only once.
 * Space Complexity: O(n) - The extra space required depends on the number of items stored in the hash table.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solveTwoSum(int[] nums, int target) {
        // Map to store value and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number and index in map
            map.put(nums[i], i);
        }

        // Return empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] result = solver.solveTwoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}