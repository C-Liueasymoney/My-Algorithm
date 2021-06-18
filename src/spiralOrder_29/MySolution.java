package spiralOrder_29;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/22 9:24 下午
 */
public class MySolution {

    @Test
    public void test(){
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] test = spiralOrderWay(arr2);
        System.out.println(Arrays.toString(test));
    }


    public int[] spiralOrderWay(int[][] matrix){
        if (matrix.length == 0) return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m * n];
        int num = 0, x = 0;

        while (num < res.length){
            for (int i = x; i < n - x; i++){
                if (num < res.length) res[num++] = matrix[x][i];
            }
            for (int i = x + 1; i < m - x; i++){
                if (num < res.length) res[num++] = matrix[i][n - 1 - x];
            }
            for (int i = n - 2 - x; i >= x; i--){
                if (num < res.length) res[num++] = matrix[m - 1 - x][i];
            }
            for (int i = m - 2 - x; i >= x + 1; i--){
                if (num < res.length) res[num++] = matrix[i][x];
            }

            x++;
        }
        return res;
    }
}
