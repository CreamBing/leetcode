package com.creambing.offer;

import java.util.Calendar;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ48
 * Author:   creambing
 * Date:     2020-06-30 16:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ48 {

    public static int Add(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 ^ num2;
            int cap = (num1 & num2) << 1;
            num1 = tmp;
            num2 = cap;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(JZ48.Add(2, 2));
    }
}