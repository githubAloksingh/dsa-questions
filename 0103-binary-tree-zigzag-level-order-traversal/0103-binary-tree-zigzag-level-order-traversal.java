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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean ltor=true;
        List<List<Integer>> ans =new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return ans;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize=queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<queueSize;i++){
                TreeNode node= queue.poll();
                if(ltor){
                    level.add(node.val);
                }
                else{
                    level.add(0,node.val);
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        
            ans.add(level);
            ltor=!ltor;
        }
        return ans;
                
                
                
        
        
    }
}