package com.creambing.offer;

import java.util.Stack;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ5
 * Author:   creambing
 * Date:     2020-06-30 17:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ5 {

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public static int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        JZ5.push(1);
        JZ5.push(2);
        JZ5.push(3);
        System.out.println(JZ5.pop());
        System.out.println(JZ5.pop());
        JZ5.push(4);
        System.out.println(JZ5.pop());
        JZ5.push(5);
        System.out.println(JZ5.pop());
        System.out.println(JZ5.pop());
    }
}