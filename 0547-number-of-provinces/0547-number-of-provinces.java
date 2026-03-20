class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(visited,n,isConnected,i);
                count++;
            }
        }
        return count;        
    }
    public void dfs(boolean[] visited,int n,int[][] isConnected,int i){
        visited[i]=true;
        for(int j=0;j<n;j++){
            if(!visited[j] && isConnected[i][j]==1){
                dfs(visited,n,isConnected,j);
            }
        }
    }
}