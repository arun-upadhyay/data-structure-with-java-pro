import java.util.*;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class ArrayProblem {


    public static void main(String[] args) {
        int[] arr = {12, 7, 11, 2};
        for (int a: ArrayProblem.twoSum(arr, 9)){
            System.out.println(a);
        }
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[]  twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                System.out.println(map.get(complement));
                System.exit(1);
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
