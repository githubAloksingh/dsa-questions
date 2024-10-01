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
    
    private TreeNode  solve(int[] preorder, int[] inorder,int start,int end,int[] idx){
        if(start>end){
            return null;
        }
        int rootVal=preorder[idx[0]];
        int i=start;
           idx[0]++;
        for(;i<=end;i++){
            if(inorder[i]==rootVal){
                break;
            }
         
        }
            TreeNode root = new TreeNode(rootVal);
            root.left=solve(preorder, inorder, start, i-1,idx);
            root.right=solve(preorder, inorder, i+1, end,idx);
            return root;
            
        }
        
    
    
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int[] idx={0};
        return solve(preorder, inorder, 0, n-1,idx);
        
    }
}