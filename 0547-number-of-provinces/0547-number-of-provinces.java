class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                count++;
            }
        }
        return count;
    }
    public void dfs(int[][] isConnected,boolean[] visited,int i){
        //100 010 001
        //110 110 001
        visited[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(!visited[j] && isConnected[i][j]==1){
                dfs(isConnected,visited,j);
            }
        }
    }
}