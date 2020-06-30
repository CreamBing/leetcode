package com.creambing.offer;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ31
 * Author:   creambing
 * Date:     2020-06-30 14:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ31 {
    public static int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0)
            return 0;
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long diviver = i * 10;
            count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(JZ31.NumberOf1Between1AndN_Solution(11));
    }
}