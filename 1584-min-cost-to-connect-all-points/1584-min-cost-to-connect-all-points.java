class Solution {
    class Edge{
        int x;
        int y;
        int cost;
        public Edge(int x,int y,int cost){
            this.x=x;
            this.y=y;
            this.cost=cost;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        if(n<=1) return 0;
        List<Edge> edges=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int cost=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);

                edges.add(new Edge(i,j,cost));
            }
        }

     Collections.sort(edges,(a,b)->a.cost-b.cost);

      int total=0;
      int edgeCount=0;
      int[] array=new int[n];
      for(int i=0;i<n;i++){
       array[i]=i;
      }

    for(Edge edge : edges){
        int r1=find(array,edge.x);
        int r2=find(array,edge.y);

        if(r1!=r2){
            array[r1]=r2;
            total+=edge.cost;
            edgeCount++;
            if(edgeCount==n-1) break;
        }
    }
      return total;

        
    }

      // find union

        public int find(int[] array,int x){
            if(array[x]==x){
                return x;
            }
            return find(array,array[x]);
        }

}