class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] count=new int[26];
        int[] count2=new int[26];
 
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }    
        for(char c : t.toCharArray()){
            count2[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
             if(count[s.charAt(i)-'a']!=count2[t.charAt(i)-'a']) return false;
        }

 
        return true;
        
    }
}