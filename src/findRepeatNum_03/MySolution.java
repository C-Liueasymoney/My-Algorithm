package findRepeatNum_03;

import com.sun.source.tree.IfTree;
import sortMethod.QuickSort;

import java.util.HashMap;
import java.util.Properties;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/8 9:19 下午
 */
public class MySolution {
//    方式一： 排序
    public int sortWay(int[] nums){
      int[] arr = QuickSort.quickSort(nums);
      for (int i = 1; i < arr.length; i++){
          if (arr[i] == arr[i - 1]){
              return arr[i];
          }
      }
      return 0;
    }


    //方式二： 哈希表
    public int sortWay2(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i], i);
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        System.out.println(mySolution.sortWay2(new int[]{1, 43, 62, 3 ,4, 43, 67 ,8 ,94,3 ,2}));
    }
}
