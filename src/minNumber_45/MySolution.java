package minNumber_45;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/24 2:23 下午
 */
public class MySolution {
    public String minNumberWay(int[] nums){
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, strs.length - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs){
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public void quickSort(String[] str, int low, int high){
        if (low >= high) return;
        int i = low;
        int j = high;
        String pivot = str[i];
        while (i < j){
            while (i < j){
                if ((str[j] + pivot).compareTo(pivot + str[j]) >= 0) {
                    j--;
                }else {
                    str[i] = str[j];
                    break;
                }
            }

            while (i < j){
                if ((str[i] + pivot).compareTo(pivot + str[i]) <= 0){
                    i++;
                }else {
                    str[j] = str[i];
                    break;
                }
            }
        }
        str[i] = pivot;

        quickSort(str, low, i - 1);
        quickSort(str, i + 1, high);
    }

    @Test
    public void test(){
        String s = minNumberWay(new int[]{3,30,34,5,9});
        System.out.println(s);
    }
}
