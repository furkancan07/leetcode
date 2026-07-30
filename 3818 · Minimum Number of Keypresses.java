public class Solution {
    /**
     * @param s: A string
     * @return: Minimum number of keypresses
     */
     int index;
     int[] count;
     int pushed;
     int keyUsed;
     int result;
    public int minimumKeypresses(String s) {
        this.index=25;
        this.pushed=1;
        this.keyUsed=0;
        this.result=0;
        this.count=new int[26];
        freqq(s);
        Arrays.sort(count);
        returnToResult();
        // write your code here
        return result;
    }
    public void freqq(String s){
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
    }
    public void returnToResult(){
        while(index>=0 && count[index]>0){
            result+=count[index]*pushed;
            keyUsed++;
            if(keyUsed==9){
                keyUsed=0;
                pushed++;
            }
            index--;
            
        }
    }
}
