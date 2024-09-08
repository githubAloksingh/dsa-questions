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
    public boolean isBalanced(TreeNode root) {
        return solve(root);
    }
    private boolean solve(TreeNode root){
        if(root==null){
            return true;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(rh-lh)>1){
            return false;
        }
        return solve(root.left) && solve(root.right);
    }
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
          int left=height(root.left);
          int right=height(root.right);
          return 1+Math.max(left,right);
    }
    
}