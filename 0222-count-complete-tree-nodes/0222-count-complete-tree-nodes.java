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
    private int lh(TreeNode root){
        if(root==null) return 0;
        int lh=0;
        TreeNode temp=root;
        while(temp!=null){
            temp=temp.left;
            lh++;
        }
        return lh;
    }
     private int rh(TreeNode root){
        if(root==null) return 0;
        int rh=0;
        TreeNode temp=root;
        while(temp!=null){
            temp=temp.right;
            rh++;
        }
        return rh;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int l=lh(root);
        int r=rh(root);
        if(l==r) return (1 << l) - 1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}


