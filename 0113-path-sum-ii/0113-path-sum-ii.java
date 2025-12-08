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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(root,result,path,targetSum,0);
        return result;
         
    }
    // 5 
    public void dfs(TreeNode root,List<List<Integer>> result,List<Integer> path ,int target,int count){
        if(root==null) return ;
        count+=root.val;
        path.add(root.val);
        if(root!=null && root.left==null && root.right==null && count==target){
            result.add(new ArrayList<>(path));
        }
        
        dfs(root.left,result,path,target,count);
        dfs(root.right,result,path,target,count);
        path.remove(path.size()-1);
        
    }
}