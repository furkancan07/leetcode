class Solution {
    public String longestPalindrome(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
         for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            if(isPalindromic(sub) && sub.length()>result.length()){
                result=sub;
            }
         }
        }
        return result;
        
    }
    public boolean isPalindromic(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}