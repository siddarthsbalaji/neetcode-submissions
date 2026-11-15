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
    int D = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return D;
    }
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        D=Math.max(D,height(root.left)+height(root.right));
        return 1+Math.max(height(root.left),height(root.right));
    }
}
