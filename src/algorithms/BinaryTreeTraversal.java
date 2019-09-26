package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-07
 **/
public class BinaryTreeTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    /**
     * 前序遍历 根左右 斜刀切的形状
     *     1
     *   2  3
     * 4 5 6 7
     * 遍历顺序为1 2 4 5 3 6 7
     *
     * 非递归算法 先将右子树压栈，再将左子树压栈，栈中弹出的节点作为根节点处理
     */

    List<Integer> preTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            result.add(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

        return result;
    }

    /**
     * 后续遍历比较简单，在前序遍历的基础上，先压左边，再压右边，变成了根-右-左
     * 然后再Collection.reverse(result)就好了
     */


    /**
     * 中序遍历 左-根-右
     */
    List<Integer> midTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            while(stack.peek() != null) {
                stack.push(stack.peek().left);
            }
            //弹出null
            stack.pop();
            //这里要能push进去null，不然会死循环
            if (!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                result.add(temp.val);
                stack.push(temp.right);
            }
        }

        return result;
    }

    /**
     * 层次遍历 bfs
     */
    List<List<Integer>> levelTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                //链表弹出也用pop
                TreeNode temp = queue.pop();
                if (temp != null) {
                    list.add(temp.val);
                    queue.add(temp.left);
                    queue.add(temp.right);
                }
            }
            if (list.size() != 0) {
                result.add(list);
            }
        }

        return result;
    }
}
