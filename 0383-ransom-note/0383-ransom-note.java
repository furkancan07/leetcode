class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals(magazine)) return true;
        int[] count=new int[26];

       for(char c : ransomNote.toCharArray()){
        count[c-'a']++;
       }
       for(char c : magazine.toCharArray()){
        if(count[c-'a']>0){
            count[c-'a']--;
        }
       
        
       }
       for(int i : count){
        if(i!=0) return false;
       }
       return true;
       
    }
}