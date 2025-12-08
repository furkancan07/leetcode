class Solution {
    public int numPairsDivisibleBy602(int[] time) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(time,list,path,0,0);
        return list.size();
        
    }
    public void dfs(int[] time,List<List<Integer>> list,List<Integer> path,int index,int count){
      if(path.size() == 2 && count % 60 == 0){
        list.add(new ArrayList<>(path));
        return;
      }
      if(path.size()>2) return;
      for(int i=index;i<time.length;i++){
        path.add(time[i]);
        dfs(time,list,path,i+1,count+time[i]);
        path.remove(path.size()-1);
      }
    }
      public int numPairsDivisibleBy60(int[] time) {
        int result=0;
       /* Map<Integer,Integer> map=new HashMap<>(); // istenilen sayıdan kaç tane var onu alacaz
        for(int i : time){
            int rem=i%60;
            int com=(60-rem)%60;
            result+=map.getOrDefault(com,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }*/
        int[] count=new int[60];
        for(int i : time){
            int rem=i%60; 
            int com=(60-rem)%60; 
            result+=count[com];
            count[rem]++;
        }
        return result;
        /*
 
         */
    }
}