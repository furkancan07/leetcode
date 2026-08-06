class Solution {
    /*
    Sorunun istediği şu birbirine bağlı 2 düğüm aynı odada olamaz 
    örneğin ilk örnekte 0 -> 1,2 vbe 3 e giditor byu 3 üyü le aynı odada olamaz
    eğer olursa demek ki odalaraı ayıramıyoruz
    
     */
    
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        // 0 -> boyasız , 1->kırmızı ,-1 -> siyah olacak dbağlı düğümlere -1 ana düğümq 1 vereceğiz 
        int[] visited=new int[n];

        for(int i =0;i<n;i++){
            if(visited[i]!=0) continue;
            Queue<Integer> queue=new ArrayDeque<>();
            queue.offer(i);
            visited[i]=1;
            while(!queue.isEmpty()){
                int current=queue.poll();
                for(int node : graph[current]){
                    if(visited[node]==0){
                       visited[node]=-visited[current];
                       queue.offer(node);
                    }
                    else if(visited[node]==visited[current]) return false;
                }
            }
           
        }
        return true;

        
    }
   
}