class Solution {
    public int makeConnected(int n, int[][] connections) {
        int[] parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }

         for(int[] edge : connections){
            union(edge[0],edge[1],parent);
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(find(i,parent));
        }
        System.out.println(set.toString());
        return connections.length<n-1 ? -1 : set.size()-1;
        
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