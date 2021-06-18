package isSubStructure_26;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/21 9:19 下午
 */
public class MySolution {
    public boolean isSubStructureWaY(TreeNode A, TreeNode B){
        boolean res = false;
        if (A != null && B != null){
            if (A.val == B.val)
                res = testTreeAHasTreeB(A, B);
            if (!res)
                res = isSubStructureWaY(A.left, B);
            if (!res)
                res = isSubStructureWaY(A.right, B);
        }
        return res;
    }

    public boolean testTreeAHasTreeB(TreeNode A, TreeNode B){
        if (B == null)
            return true;
        if (A == null)
            return false;
        if (A.val != B.val)
            return false;
        return testTreeAHasTreeB(A.left, B.left) && testTreeAHasTreeB(A.right, B.right);
    }
}
