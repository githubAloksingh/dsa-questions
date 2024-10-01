/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     HashMap<TreeNode, TreeNode> parent = new HashMap<>();
    
    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            parent.put(root.left,root);
        }
        inOrder(root.left);
        if(root.right!=null){
            parent.put(root.right,root);
        }
        inOrder(root.right);
    }
    
    
    
    private void bfs(TreeNode target,int k , List<Integer> result){
        Queue<TreeNode>que = new LinkedList<>();
        que.offer(target);
        HashSet<Integer> visited = new HashSet<>();
        visited.add(target.val);
      int level=0;
        while(!que.isEmpty()){
            if(level==k) break;
            int n = que.size();
            for(int i=0;i<n;i++){
                TreeNode curr=que.poll();
                if(curr.left!=null && ! visited.contains(curr.left.val)){
                    que.offer(curr.left);
                    visited.add(curr.left.val);
                    
                }
                   if(curr.right!=null && !visited.contains(curr.right.val)){
                       que.offer(curr.right);
                    visited.add(curr.right.val);
                    
                }
                      if(parent.containsKey(curr) && !visited.contains(parent.get(curr).val)){
                          que.offer(parent.get(curr));
                          visited.add(parent.get(curr).val);
                      }
                
            
    }
            level++;
        }
        while(!que.isEmpty()){
            result.add(que.poll().val);
        }
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        inOrder(root);
        bfs(target,k,result);
        return result;
        
        
       
        
    }
}