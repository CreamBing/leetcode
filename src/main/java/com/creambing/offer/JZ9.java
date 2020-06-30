package com.creambing.offer;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ9
 * Author:   creambing
 * Date:     2020-06-30 17:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ9 {

    public static int JumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return 2*JumpFloorII(target-1);
    }

    public static void main(String[] args) {
        System.out.println(JZ9.JumpFloorII(4));
    }
}