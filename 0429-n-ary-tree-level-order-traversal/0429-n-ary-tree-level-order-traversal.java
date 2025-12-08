/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        dfs(root,list,0);
        return list;
    }
    public void dfs(Node root,List<List<Integer>> list,int depth){
        if(root==null) return;
        if(list.size()==depth){
            list.add(new ArrayList<>());
        }
        list.get(depth).add(root.val);
        for(Node node  :root.children){
            dfs(node,list,depth+1);
        }

    }
}