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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(list,root);
        return balance(list,0,list.size()-1);
    }
    public TreeNode balance(List<Integer> list,int start,int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=balance(list,start,mid-1);
        node.right=balance(list,mid+1,end);
        return node;  
    }
    public void dfs(List<Integer> list,TreeNode root){
      if(root==null) return;
     
      dfs(list,root.left);
    list.add(root.val);
      dfs(list,root.right);
    }
}