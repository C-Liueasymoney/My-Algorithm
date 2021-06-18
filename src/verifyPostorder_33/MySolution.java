package verifyPostorder_33;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/24 11:42 上午
 */
public class MySolution {
    public boolean verifyPostorderWay(int[] postorder){
        return recur(postorder, 0, postorder.length - 1);
    }

    public boolean recur(int[] postorder, int i, int j){
        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j])
            p++;
        int m = p;
        while (postorder[p] > postorder[j])
            p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
