class Solution {
    public int minimumPushes(String word) {
       int[] count=new int[26];
       for(char c : word.toCharArray()){
        ++count[c-'a'];
       }
       int result=0;
       int keyUsed=0;
       int push=1;
       Arrays.sort(count); 
       int index=25;
       while(index>=0 && count[index]>0){
        result+=count[index]*push;
        keyUsed++;
        if(keyUsed==8){
            keyUsed=0;
            push++;
        }
        index--;
       }
       return result;
        
    }
}