class Solution {
    // bds
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];

        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            int current=queue.poll();
            for(int i : rooms.get(current)){
                if(!visited[i]){
                    visited[i]=true;
                    queue.offer(i);
                }
            }
        }
          for(boolean b : visited){
            if(b==false) return false;
        }
        return true;
    }
    public boolean canVisitAllRoomsForDfs(List<List<Integer>> rooms) {
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