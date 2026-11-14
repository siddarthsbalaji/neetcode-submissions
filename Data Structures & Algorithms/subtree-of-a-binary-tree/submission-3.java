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
    private boolean issametree(TreeNode A, TreeNode B){
        if((A==null)&&(B==null)){
            return true;
        }
        if((A==null)||(B==null)){
            return false;
        }
        if(A.val!=B.val){
            return false;
        }
        return ((issametree(A.left,B.left))&&(issametree(A.right,B.right)));
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if((root==null)&&(subRoot==null)){
            return true;
        }
        if((root==null)||(subRoot==null)){
            return false;
        }
        if(root.val==subRoot.val){
            if(issametree(root,subRoot)){
                return true;
            }
        }
        return ((isSubtree(root.left,subRoot))||(isSubtree(root.right,subRoot)));
    }
}
