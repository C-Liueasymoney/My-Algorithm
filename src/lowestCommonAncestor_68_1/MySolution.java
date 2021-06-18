package lowestCommonAncestor_68_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/6/3 2:29 下午
 */
public class MySolution {
    public TreeNode lowestCommonAncestorWay(TreeNode root, TreeNode p, TreeNode q){
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();
        TreeNode temp = root;
        while (root != null){
            pList.add(root);
            if (root.val == p.val){
                break;
            }
            if (p.val > root.val){
                root = root.right;
            }else {
                root = root.left;
            }
        }
        root = temp;
        while (root != null){
            qList.add(root);
            if (root.val == q.val)
                break;
            if (q.val > root.val)
                root = root.right;
            else
                root = root.left;
        }

        int pLength = pList.size() - 1;
        int qLength = qList.size() - 1;
        while (pLength >= 0 && qLength >= 0){
            if (pLength > qLength){
                if (pList.get(--pLength) == qList.get(qLength))
                    return qList.get(qLength);
            }else if (pLength < qLength){
                if (qList.get(--qLength) == pList.get(pLength))
                    return pList.get(pLength);
            }else{
                if (qList.get(qLength) == pList.get(pLength))
                    return qList.get(qLength);
                qLength--;
                pLength--;
            }
        }
        return null;
    }

}
