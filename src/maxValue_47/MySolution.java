package maxValue_47;

import org.junit.Test;

/**
 * @Description:
 * 递归方法开销太大导致超时
 * @Author: chong
 * @Data: 2021/5/26 1:40 下午
 */
public class MySolution {
    int res = 0;
    public int maxValueWay(int[][] grid){
        recur(grid, 0, 0, 0);
        return res;
    }

    public void recur(int[][] grid, int sum, int row, int col){
        sum += grid[row][col];
        if (sum > res)
            res = sum;
        if (row == grid.length - 1 && col == grid[0].length - 1)
            return;
        if (row + 1 < grid.length)
            recur(grid, sum, row + 1, col);
        if (col + 1 < grid[0].length)
            recur(grid, sum, row, col + 1);
    }

    @Test
    public void test(){
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int result = maxValueWay(grid);
        System.out.println(result);
    }
}
