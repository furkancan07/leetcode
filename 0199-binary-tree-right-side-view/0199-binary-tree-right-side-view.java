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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list,0);
        return list;
    }
    public void dfs(TreeNode root,List<Integer> list,int depth){
        if(root==null) return ;
        if(depth==list.size()){
            list.add(root.val);
        } 
        dfs(root.right,list,depth+1);
        dfs(root.left,list,depth+1);
    }
    /*
    soruyu şu şekide anladım ilk başta dengeli hale getir ve sağdaki elemanları döndür
     public List<Integer> rightSideView(TreeNode root) {
       List<Integer> list=new ArrayList<>();
       dfs(root,list);
       Collections.sort(list);
       TreeNode result=balanced(list,0,list.size()-1);
       list.clear();
       dfs(result,list);
       return list; 
    }
    public void postOrder(TreeNode root,List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        postOrder(root.right,list);
        postOrder(root.left,list);
    }
    public TreeNode balanced(List<Integer> list,int start,int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.right=balanced(list,mid+1,end);
        node.left=balanced(list,start,mid-1);
        return node;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        dfs(root.right,list);
    }
     */
}