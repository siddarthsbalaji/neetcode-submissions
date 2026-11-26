/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private void findkth(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        findkth(root.left, arr);
        arr.add(root.val);
        findkth(root.right, arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        findkth(root, arr);
        return arr.get(k - 1);
    }
}
