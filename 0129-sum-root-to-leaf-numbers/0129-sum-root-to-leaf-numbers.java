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
     int total=0;
    public int sumNumbers(TreeNode root) {
       
        dfs(root,0);
        return total;
        
    }
    public void dfs(TreeNode root,int val){
        if(root==null) return;
        val=val*10+root.val;
        if(root!=null && root.left==null && root.right==null){
            total+=val;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }
    // backtrackin
     public int sumNumbers2(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs2(root,list,path);
        int result=0;
        for(int i : list){
            result+=i;
        }
        return result;
    }
    public void dfs2(TreeNode root, List<Integer> list,List<Integer> path){
        if(root==null) return;
        path.add(root.val);
        if(root!=null && root.left==null && root.right==null){
            int result=0;
            for(int i=0;i<path.size();i++){
               result=result*10+path.get(i);
            }
            list.add(result);
        }
        dfs2(root.left,list,path);
        dfs2(root.right,list,path);
        path.remove(path.size()-1);
    }
}