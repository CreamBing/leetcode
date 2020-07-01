package com.creambing.offer;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ67
 * Author:   creambing
 * Date:     2020-07-01 09:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ67 {

    public static int cutRope(int target) {
        //贪心算法 n>5之后尽量切出 3 然后是2 3(n-3)>=2(n-2)
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int time3of = target / 3;
        if (target - time3of * 3 == 1) {
            time3of--;
        }
        int time2of = (target - time3of * 3) / 2;
        return (int) (Math.pow(3, time3of) * Math.pow(2, time2of));
    }

    //动态规划
    public static int cutRope1(int target) {
        int[] dp = new int[target+1];
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for (int j = 4; j <= target; j++) {
            int max = 0;
            for (int i = 1; i <= j / 2; i++) {
                int val = dp[i] * dp[j - i];
                if (val > max) {
                    max = val;
                }
            }
            dp[j] = max;
        }
        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(JZ67.cutRope(8));
        System.out.println(JZ67.cutRope1(15));
    }
}