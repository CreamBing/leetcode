//给定字符串 s 和 t ，判断 s 是否为 t 的子序列。 
//
// 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。 
//
// 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。 
//
// 示例 1: 
//s = "abc", t = "ahbgdc" 
//
// 返回 true. 
//
// 示例 2: 
//s = "axc", t = "ahbgdc" 
//
// 返回 false. 
//
// 后续挑战 : 
//
// 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？ 
//
// 致谢: 
//
// 特别感谢 @pbrother 添加此问题并且创建所有测试用例。 
// Related Topics 贪心算法 二分查找 动态规划

package com.creambing.leetcode.editor.cn.dp;

public class IsSubsequence {
    public static void main(String[] args) {
        Solution solution = new IsSubsequence().new Solution();
        String s = "abc", t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));

        String s1 = "gdc", t1 = "gahbgdc";
        System.out.println(solution.isSubsequence(s1, t1));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    //贪心算法
    class Solution {
        public boolean isSubsequence(String s, String t) {
            char[] chars = s.toCharArray();
            int index = -1;
            for (char temp : chars) {
                index = t.indexOf(temp, index + 1);
                if (index == -1) {
                    return false;
                }
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    public boolean isSubsequence(String s, String t) {
        int sl = s.length(), tl = t.length();
        if (sl > tl) {
            return false;
        }
        if (sl == 0) {
            return true;
        }
        //状态：dp[i][j]为s的从头开始到i的子字符串是否为t从头开始到j的子字符串的子序列
        boolean[][] dp = new boolean[sl + 1][tl + 1];
        //初始化
        for (int j = 0; j < tl; j++) {
            dp[0][j] = true;
        }
        //dp
        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= tl; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[sl][tl];
    }
}