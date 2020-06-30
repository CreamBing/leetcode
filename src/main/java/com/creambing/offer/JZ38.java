package com.creambing.offer;

import javax.swing.tree.TreeNode;
import java.util.Map;

/**
 * Copyright (C), 2015-2020, 优地科技有限公司
 * FileName: JZ38
 * Author:   creambing
 * Date:     2020-06-30 16:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JZ38 {

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(1);
        root.left = left;
        System.out.println(JZ38.TreeDepth(root));

    }
}