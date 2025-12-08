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
       public int deepestLeavesSum(TreeNode root) {
       int maxDepth=maxDepth(root);
       return sumAtDepth(root,0,maxDepth);
    }

    int sumAtDepth(TreeNode root,int depth,int maxDepth){
        if(root==null) return 0;
        if(depth==maxDepth){
            return root.val;
        }
        
        return sumAtDepth(root.left,depth+1,maxDepth)+
        sumAtDepth(root.right,depth+1,maxDepth);
    }

    public int maxDepth(TreeNode root){
        if(root==null) return -1;
        return 1+ Math.max(maxDepth(root.right),maxDepth(root.left));
    }
  /*  public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> bfs=new LinkedList<>();
        bfs.offer(root);
        int result=0;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            result=0;
            for(int i=0;i<size;i++){
                TreeNode node=bfs.poll();
                result+=node.val;
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null) bfs.offer(node.right);
            }
        }
        return result;
        
    }*/
}