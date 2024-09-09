;/**
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> que =new LinkedList<>();
        if(root==null){
            return ans;
        }
        que.offer(root);
        while(!que.isEmpty()){
            int levelSize = que.size();
            List<Integer> subList= new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode curr= que.poll();
                subList.add(curr.val);
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null){
                    que.offer(curr.right);
                }
                
            }
            ans.add(subList);
            }
        return ans;
        
        
    }
}