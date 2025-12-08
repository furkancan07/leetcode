class Solution {
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