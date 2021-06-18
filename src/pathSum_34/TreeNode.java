package pathSum_34;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/27 9:33 下午
 */
public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
