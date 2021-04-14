package minArray_11;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/13 6:03 下午
 */
public class MySolution {

    @Test
    public void test(){
        int[] a = {3,4,5,1,2};
        int[] b = {2,2,2,0,1};
        int[] c = {5, 1, 3};
        int[] d = {1, 0, 1, 1, 1};
        System.out.println(minArrayWay(a));
        System.out.println(minArrayWay(b));
        System.out.println(minArrayWay(c));
        System.out.println(minArrayWay(d));
    }

    //开始没有考虑到旋转0个数字的情况
    public int minArrayWay(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;
        int middle = 0;
        //添加旋转0个数字的判断
        if (numbers[left] < numbers[right])
            return numbers[left];
        while (left < right - 1){
            middle = (right + left) / 2;
            //考虑左右和中间点都相等时，只能使用顺序查找
            if (numbers[left] == numbers[right] || numbers[left] == numbers[middle]){
                return orderFind(numbers);
            }else if (numbers[middle] > left){
                left = middle;
            }else if (numbers[middle] < right){
                right = middle;
            }
        }
        return numbers[right];
    }

    public int orderFind(int[] number){
        int res = number[0];
        for (int i = 1; i < number.length; i++){
            if (number[i] < res){
                res = number[i];
            }
        }
        return res;
    }
}
