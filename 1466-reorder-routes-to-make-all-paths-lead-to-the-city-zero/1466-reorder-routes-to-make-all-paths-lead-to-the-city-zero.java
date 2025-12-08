class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph=new ArrayList<>();
        // her eleman hangi yola gidecek
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        Set<String> set=new HashSet<>();
        
        for(int[] dir : connections){
            int from=dir[0];
            int to=dir[1];
            
            graph.get(from).add(to);
            graph.get(to).add(from);
            
            set.add(from+"-"+to);
        }
        Deque<Integer> bfs=new ArrayDeque<>();
        bfs.offer(0);
        boolean[] visited=new boolean[n];
        visited[0]=true;
        int result=0;
        while(!bfs.isEmpty()){
            int  city=bfs.poll();
            
            for(int i : graph.get(city)){
                if(!visited[i]){
                    if(set.contains(city+"-"+i)){
                        result++;
                    }
                    visited[i]=true;
                    bfs.offer(i);
                }
            }
        }
        return result;
    }
}