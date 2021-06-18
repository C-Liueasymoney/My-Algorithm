package movingCount_13;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/14 10:37 上午
 */
public class MySolution {

    @Test
    public void test(){
        int i = movingCountWay(2, 3, 1);
        System.out.println(i);
    }

    public int movingCountWay(int m, int n, int k){
        if (m <= 0 || n <= 0 || k < 0) return 0;

        boolean[] visited = new boolean[m * n];
        for (int i = 0; i < visited.length; i++){
            visited[i] = false;
        }
        int count = recur(m, n, 0, 0, k, visited);
        return count;
    }

    private int recur(int rows, int cols, int row, int col, int k, boolean[] visited){
        int count = 0;
        if (check(rows, cols, row, col, k, visited)){
            count = 1 + recur(rows, cols, row - 1, col, k, visited) +
                    recur(rows, cols, row + 1, col, k, visited) +
                    recur(rows, cols, row, col - 1, k, visited) +
                    recur(rows, cols, row, col + 1, k, visited);
        }
        return count;
    }

    private boolean check(int rows, int cols, int row, int col, int k, boolean[] visited){
        if (row >= 0 && col >= 0 && row < rows && col < cols && (getSum(row) + getSum(col)) <= k && !visited[row * cols + col]){
            return true;
        }
        return false;
    }

    private int getSum(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
