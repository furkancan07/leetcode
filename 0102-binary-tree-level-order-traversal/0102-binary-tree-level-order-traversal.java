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
        dfs(root,0,list);
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
}