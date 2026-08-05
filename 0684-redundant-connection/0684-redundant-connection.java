class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent=new int[edges.length+1];
        for(int i =0;i<=edges.length;i++){
            parent[i]=i;
        }
        for(int[] edge : edges){
           int x=edge[0]; // 1
           int y=edge[1]; // 2 
        int rootX=find(x,parent); // 1
        int rootY=find(y,parent); // 1
        if(rootX==rootY){
            return new int[]{x,y};
        }else parent[rootX]=rootY;
        }
        return new int[]{};
        
    }
    public int find(int x, int[] parent){
        if(x!=parent[x]){
            parent[x]=find(parent[x],parent);
        }
        return parent[x];
    }
    
}