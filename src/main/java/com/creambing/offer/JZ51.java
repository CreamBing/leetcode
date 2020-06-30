package com.creambing.offer;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ51
 * Author:   creambing
 * Date:     2020-06-30 15:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ51 {

    public static int[] multiply2(int[] A) {
        int size = A.length;
        int[] B = new int[size];
        for(int i=0;i<size;i++){
            int sum = 1;
            for(int j=0;j<size;j++){
                if(j==i){
                    continue;
                }
                sum*=A[j];
            }
            B[i] = sum;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5};
        Arrays.stream(JZ51.multiply2(A)).forEach(System.out::println);

    }
}