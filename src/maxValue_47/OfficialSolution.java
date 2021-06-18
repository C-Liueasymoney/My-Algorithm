package maxValue_47;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/26 1:58 下午
 */
public class OfficialSolution {
    public int maxValueWay(int[][] grid){
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (i == 0 && j == 0)
                    dp[i][j] = grid[i][j];
                else if (i == 0 && j != 0){
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                }else if (i != 0 && j == 0){
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                }else {
                    dp[i][j] = Integer.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }

    @Test
    public void test(){
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int result = maxValueWay(grid);
        System.out.println(result);
    }
}
