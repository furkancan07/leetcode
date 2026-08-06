class Solution {
    // map ile bulma freq ile aynı algoritma
     public int findCenter(int[][] edges) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int[] edge : edges){
            for(int i : edge){
                map.put(i,map.getOrDefault(map.get(i),0)+1);
            }
        }
        int max=0;
        int result=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                result=entry.getKey();
            }
        }

            return result;
    }
    // freq ile bulma 
    public int findCenter2(int[][] edges) {
        int[] count=new int[100001];
        for(int[] edge : edges){
            for(int i : edge){
                count[i]++;
            }
        }
        int max=0;
        int result=0;
        for(int i=0;i<count.length;i++){
            if(count[i]==0) continue;
            else if(max<count[i]){
                max=count[i];
                result=i;
            }
            
            
        }
        return result;


        
    }
}