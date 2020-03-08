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


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
//        [
//  [2],
//  [3, 4],
//  [6, 5, 7],
//  [4, 1, 8, 3]
//]
        Solution solution = new Triangle().new Solution();
        List<List<Integer>> testMain = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(2);
        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);
        List<Integer> row3 = new ArrayList<>();
        row3.add(6);
        row3.add(5);
        row3.add(7);
        List<Integer> row4 = new ArrayList<>();
        row4.add(4);
        row4.add(1);
        row4.add(8);
        row4.add(3);
        testMain.add(row1);
        testMain.add(row2);
        testMain.add(row3);
        testMain.add(row4);
        solution.minimumTotal(testMain);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    //给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int n = triangle.size();
            int[][] dp = new int[n][n];

            List<Integer> lastRow = triangle.get(n - 1);
            //先将最后一行赋值
            for (int i = 0; i < lastRow.size(); i++) {
                dp[n - 1][i] = lastRow.get(i);
            }
            //为了方便循环，采用从下到上遍历，[0][0]为止
            //最后一行第一次已经取值完，故需要从 n-2开始
            //列遍历
            for (int i = n - 2; i >= 0; i--) {
                //获取行
                List<Integer> row = triangle.get(i);
                //每一步只能移动到上一行相邻节点
                for (int j = 0; j < i + 1; j++) {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + row.get(j);
                }
            }
            return dp[0][0];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}