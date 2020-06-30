package com.creambing.offer;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ18
 * Author:   creambing
 * Date:     2020-06-30 16:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ18 {

    public void Mirror(JZ38.TreeNode root) {
        if(root!=null){
            JZ38.TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.right);
            Mirror(root.left);
        }

    }
}