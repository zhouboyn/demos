package algorithms;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-06
 **/
public class BulidBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static public TreeNode buildBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        TreeNode root = null;
        for(int num: nums) {
            root = put(root, num);
        }
        return root;
    }

    static TreeNode put(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val > root.val) {
            root.right = put(root.right, val);
        } else if (val < root.val) {
            root.left = put(root.left, val);
        }
        return root;
    }

    public static void main(String[] args) {

        int[] nums = new int[] {2,1,3,4,5};
        TreeNode root = buildBST(nums);

        System.out.println("dome");
    }
}
