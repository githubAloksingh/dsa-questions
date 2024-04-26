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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left,root.right);
        }
    private boolean isMirror(TreeNode leftSubtree, TreeNode rightSubtree){
        if(leftSubtree==null &&rightSubtree==null) return true;
        if(leftSubtree==null ||rightSubtree==null) return false;
        if(leftSubtree.val!=rightSubtree.val) return false;
        return isMirror(leftSubtree.left, rightSubtree.right) && isMirror(leftSubtree.right,rightSubtree.left);
    }
}