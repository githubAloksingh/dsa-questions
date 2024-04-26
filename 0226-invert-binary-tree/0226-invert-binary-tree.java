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
    public TreeNode invertTree(TreeNode root) {
        if(root ==null){
            return root;
        }
        return newTree(root);
    
    }
    private TreeNode newTree(TreeNode node){
      if(node ==null){
          return null;
      }
        TreeNode temp=node.left;
        node.left = newTree(node.right);
        node.right = newTree(temp);
        return node;
        }
        
    }
