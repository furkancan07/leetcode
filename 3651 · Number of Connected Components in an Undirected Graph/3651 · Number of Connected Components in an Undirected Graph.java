public class Solution {
    /**
     * @param n: the number of vertices
     * @param edges: the edges of undirected graph
     * @return: the number of connected components
     */
    public int countComponents(int n, int[][] edges) {
        // write your code here
        int[] parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] edge : edges){
            union(edge[0],edge[1],parent);
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(find(i,parent));
        }
        return set.size();
    }
    public int find(int x,int[] parent){
        if(x!=parent[x]) parent[x]=find(parent[x],parent);
        return parent[x];
    }
    public void union(int x,int y,int[] parent){
        int rx=find(x,parent);
        int ry=find(y,parent);
        if(rx!=ry){
            parent[rx]=ry;
        }
    }
}