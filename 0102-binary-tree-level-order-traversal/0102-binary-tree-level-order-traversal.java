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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        int depth=0;
         dfs(root,0,list);
       // bfs(list,0,queue);
     
        return list;
        
    }
    public  void dfs(TreeNode root,int depth,List<List<Integer>> result){
        if(root==null) return;
        if(depth==result.size()){
            result.add(new ArrayList<>());
        }
        result.get(depth).add(root.val);
        // sol
        dfs(root.left,depth+1,result);
        //sağ 
        dfs(root.right,depth+1,result);
    }

    public void bfs(List<List<Integer>> list,int depth,Queue<TreeNode> queue){
          while(!queue.isEmpty()){
            int size=queue.size();
            list.add(new ArrayList<>());
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list.get(depth).add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            depth++;
        }
    }
   
}