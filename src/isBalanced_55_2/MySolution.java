package isBalanced_55_2;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/29 11:17 上午
 */
public class MySolution {
    public boolean isBalancedWay(TreeNode root) {
        return recur(root) != -1;
    }

    public int recur(TreeNode root){
//        当节点为空时，此节点的深度为0
        if (root == null)
            return 0;
//        创建left和right分别保存左右子树的深度
        int left = recur(root.leftNode);
//        如果出现了左右子树深度大于1的情况，就会返回-1，此时不用再看其他直接剪枝向上返回-1
        if (left == -1)
            return -1;
        int right = recur(root.rightNode);
        if (right == -1)
            return -1;
//        查看左右子树的深度差是不是小于2，如果到了2就说明不是平衡二叉树，返回-1
//        如果没到2，说明还是平衡二叉树，向上返回此子树的深度，也就是当前节点中左右子树最大深度再加上当前节点的1
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
