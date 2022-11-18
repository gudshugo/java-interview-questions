package Exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an int[] array "nums" and an integer target, return indices of the two numbers such they
 * add up to target.
 *
 * Example:
 *
 * input: int[] nums = new int[]{1,2,3,4} and target = 7
 *
 * output: [2,3]
 */

public class TwoSum {

    public static void main(String[] args){

        int[] input = new int[]{3,10,4,6};
        int target = 10;

        int[] output = sum(input, target);

        System.out.println(Arrays.toString(output));
    }

    private static int[] sum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }

        return new int[]{};
    }

}
