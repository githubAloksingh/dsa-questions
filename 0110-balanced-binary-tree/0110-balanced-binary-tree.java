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
        return dfsHeight(root)!=-1;
    }
    private int dfsHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=dfsHeight(root.left);
        if(lh==-1) return -1;
        int rh = dfsHeight(root.right);
        if(rh==-1) return -1;
        if(Math.abs(rh-lh)>1) return -1;
        return 1+Math.max(lh,rh);
        
    }
}