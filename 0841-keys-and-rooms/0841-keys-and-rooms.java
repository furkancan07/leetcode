class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];

        dfs(0,rooms,visited);

        for(boolean b : visited){
            if(b==false) return false;
        }
        return true;

        
    }
    public void dfs(int room,List<List<Integer>> rooms,boolean[] visited){
        if(visited[room]) return;
        visited[room]=true;
        for(int i : rooms.get(room)){
            dfs(i,rooms,visited);
        }
    }
}