package LeetCode.Easy.ProblemTwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProblemTwoSum {

    public static void main(String[] args) {

        int target = 9;
        int[] nums = {2, 7, 11, 15};
        int[] twoSumResult = twoSum(target, nums);
        System.out.println(Arrays.toString(twoSumResult));

        System.out.println("=======");

        target = 6;
        nums = new int[]{3, 2, 4};
        twoSumResult = twoSum(target, nums);
        System.out.println(Arrays.toString(twoSumResult));

    }

    public static int[] twoSum(int target, int[] integerArray){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < integerArray.length; i++){
            if(map.containsKey(integerArray[i])){
                return new int[]{map.get(integerArray[i]), i};
            }
            map.put(target - integerArray[i], i);
        }
        return null;
    }
}
