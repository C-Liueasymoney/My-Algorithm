package findNumberIn2DArray_04;

import org.junit.Test;

import java.rmi.MarshalException;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/9 11:02 下午
 */
public class MySolution {

    @Test
    public void finWayTest(){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findWay(matrix, 6));
    }

    //书上方法的Java实现，从矩阵的右上角查找，如果和target相等返回true，如果比target大排除此列，如果比target小排除此行
    public boolean findWay(int[][] matrix, int target){
        if (matrix.length == 0){
            return false;
        }
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int i = 0;
        int j = col;

        while ((i <= row) && (j >= 0)){
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else if(matrix[i][j] < target)
                i++;
        }
        return false;
    }


}
