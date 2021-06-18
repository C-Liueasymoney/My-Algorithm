package search_53_1;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/29 8:59 上午
 */
public class OfficialSolution {
    public int searchWay(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
//        搜索右边界
        while (left <= right){
            int middle = (left + right) / 2;
            if (nums[middle] <= target)
                left = middle + 1;
            else if (nums[middle] > target)
                right = middle - 1;
        }
        int rightIndex = left;
//        判断数组中有无target
        if (right >= 0 && nums[right] != target)
            return 0;
//        搜索左边界
        left = 0;
        right = nums.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            if (nums[middle] < target)
                left = middle + 1;
            else
                right = middle - 1;
        }
        int leftIndex = right;
        return rightIndex - leftIndex - 1;
    }
}
