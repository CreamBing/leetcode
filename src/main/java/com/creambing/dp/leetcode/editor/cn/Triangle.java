//给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。 
//
// 例如，给定三角形： 
//
// [
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
// 
//
// 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。 
//
// 说明： 
//
// 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。 
// Related Topics 数组 动态规划

package com.creambing.dp.leetcode.editor.cn;

import java.util.*;

public class Triangle{
    public static void main( String[] args ){
        Solution solution = new Triangle().new Solution();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));
        System.out.println(solution.minimumTotal(triangle));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        //表示第ij个位置上最短的路径和
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        if(n==1){
            return dp[0][0];
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<n;i++){
            List<Integer> col = triangle.get(i);
            for(int j=0,m=col.size();j<m;j++){
                if(j==0){
                    dp[i][j] = dp[i-1][0]+col.get(0);
                }else if(j==m-1){
                    dp[i][j] = dp[i-1][m-2]+col.get(m-1);
                }else {
                    dp[i][j] = Math.min(dp[i-1][j-1],dp[i-1][j])+col.get(j);
                }
                if(i==n-1){
                    result.add(dp[i][j]);
                }
            }
        }
        result.sort(Comparator.comparingInt(a -> a));
        return result.get(0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}