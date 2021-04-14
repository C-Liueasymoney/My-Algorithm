package findRepeatNum_03;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/9 4:01 下午
 */
public class OfficialSolution {
    //原地置换
    public int sortWay(int[] nums){
        for (int i = 0; i < nums.length; i++){
            while (nums[i] != i){
                if (nums[i] == nums[nums[i]])
                    return nums[i];
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}
