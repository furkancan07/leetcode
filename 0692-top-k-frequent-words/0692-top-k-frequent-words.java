class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        PriorityQueue<String> heap=new PriorityQueue<>((a, b) -> {
    if(map.get(a).equals(map.get(b))){
        return b.compareTo(a); // eğer frekan eşitse ters alfabe
    }
    return map.get(a) - map.get(b); // frekansa 
});
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String i : map.keySet()){
            heap.offer(i);
            if(heap.size()>k){
                heap.poll();
            }
        }

        String[] result=new String[k];
       
        for(int i=k-1;i>=0;i--){
            result[i]=heap.poll();
        }
        
        return new ArrayList<>(Arrays.asList(result));
    }
}