class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> map=new HashMap<>();
     for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
     }
     PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
     /*
     [1,1,1,2,2,3], k = 2

      1 1 
      */
     for(int i : map.keySet()){
         heap.offer(i);
         if(heap.size()>k){
            heap.poll(); 
         }
     }
     int[] result=new int[k];

     
     for(int i=0;i<k;i++){
        result[i]=heap.poll();
     }
     
      return result;
    }
}