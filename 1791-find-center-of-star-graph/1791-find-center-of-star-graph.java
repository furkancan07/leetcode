class Solution {
    public int findCenter(int[][] edges) {
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