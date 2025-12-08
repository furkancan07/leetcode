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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        dfs(list,0,root);
        for(int i=0;i<list.size();i++){
            if(i%2!=0){
                Collections.reverse(list.get(i));
            }
        }
        return list;
        
    }
    // dfs ile norma hepsini diziye alayım 
    public void dfs(List<List<Integer>> list,int depth,TreeNode root){
        if(root==null) return ;
        if(depth==list.size()){
            list.add(new ArrayList<>());
        }
        list.get(depth).add(root.val);
        dfs(list,depth+1,root.left);
        dfs(list,depth+1,root.right);
    }
}