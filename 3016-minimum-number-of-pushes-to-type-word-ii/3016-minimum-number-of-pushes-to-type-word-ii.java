class Solution {
    public int minimumPushes(String word) {
        int[] count=new int[26];
        for(char c:word.toCharArray()){
            count[c-'a']++;
        }
        int result=0;
        int pushed=1;
        int keyUsed=0;
        Arrays.sort(count);
        int index=25;
        while (index>=0 && count[index]>0){
            result+=count[index]*pushed;
            keyUsed++;
            if(keyUsed==8){
                keyUsed=0;
                pushed++;
            }
            index--;
        }
        return result;
    }
}