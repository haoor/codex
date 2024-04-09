package leetcode;

import java.util.HashMap;

public class T1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        int[] result = t1.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(result[0] + "," + result[1]);

        result = t1.twoSum(new int[] { 3, 2, 4 }, 6);
        System.out.println(result[0] + "," + result[1]);

        result = t1.twoSum(new int[] { 3, 3 }, 6);
        System.out.println(result[0] + "," + result[1]);
        

        result = t1.twoSum2(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(result[0] + "," + result[1]);

        result = t1.twoSum2(new int[] { 3, 2, 4 }, 6);
        System.out.println(result[0] + "," + result[1]);

        result = t1.twoSum2(new int[] { 3, 3 }, 6);
        System.out.println(result[0] + "," + result[1]);

    }

    /**
     * 简单方式 直接双循环遍历
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    /**
     * 扩展 低于O(n2)复杂度
     * 利用Hash
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (map.containsKey(target - temp)) {
                return new int[] { map.get(target - temp), i };
            } else {
                map.put(temp, i);
            }
        }
        return new int[] { -1, -1 };
    }

}