//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

package com.creambing.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] twoSum(int[] nums, int target) {
            int[] index = new int[2];
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0, j = nums.length; i < j; i++) {
                if (hashMap.containsKey(nums[i])) {
                    index[0] = i;
                    index[1] = hashMap.get(nums[i]);
                    break;
                }
                hashMap.put(target - nums[i], i);
            }
            return index;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}