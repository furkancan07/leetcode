class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0 || s.length()==1) return s.length();
        int[] count=new int[52];
        for(char c : s.toCharArray()){
            if(c>= 'a' && c<='z'){
                count[c-'a']++;
            }
            if(c>= 'A' && c<='Z'){
                count[26 + c-'A']++;
            }
        }
        int total=0;
        boolean result=false;
        for(int i : count){
            if(i%2==0){
             total+=i;
            }else{
                total+=i-1;
                result=true;
            }
        }
        return result ? total+1 : total;
    }
}