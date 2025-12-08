class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result=new ArrayList<>();
        if(intervals.length==0) return intervals;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        result.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
          int[] a=intervals[i];
          int[] b=result.get(result.size()-1);

          if(b[1]>=a[0]){
            b[1]=Math.max(b[1],a[1]);
          }else{
            result.add(a);
          }
        }
        
        return result.toArray(new int[result.size()][]);
        

    }
}