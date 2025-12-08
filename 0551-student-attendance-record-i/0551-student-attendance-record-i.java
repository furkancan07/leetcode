class Solution {
    /**
     public boolean checkRecord(String s) {
        int countA=0;
        int maxL=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') countA++;

            if(s.charAt(i)=='L'){
                int len=dfs(s,i);
                maxL=Math.max(maxL,len);
                i+=len-1;
            }
        }
       return countA<2 && maxL<3 ;  
    }
    public int dfs(String s,int i){
        if(i>=s.length() || s.charAt(i)!='L') return 0;
        return 1+dfs(s,i+1);
    }
     */
    public boolean checkRecord(String s) {
        if(s.length()==0) return true;
        int countA=0;
        int maxL=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                countA++;
                if(countA>1) return false;
                maxL=0;
            }
            if(s.charAt(i)=='L'){
                maxL++;
                if(maxL>=3) return false;
            }else{
                maxL=0;
            }
        }
        
        return true;
        
    }
}