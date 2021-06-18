package treeToDoublyList_36;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/29 9:19 下午
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
