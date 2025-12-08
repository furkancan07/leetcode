class Solution {
     public boolean areOccurrencesEqual(String s) {
        int[] count=new int[26];
        
        for(char c : s.toCharArray()){
            count[c-'a']++;
         
        }
        int freg=0;
        for(int c : count){
            if(c>0){
                if(freg==0) freg=c;
                if(c!=freg) return false;
            }
        }
        return true;
  }
  public boolean areOccurrencesEqual2(String s) {
        int[] count=new int[26];
        Set<Character> set=new HashSet<>();
        for(char c : s.toCharArray()){
            count[c-'a']++;
            set.add(c);
        }
        List<Character> list=new ArrayList<>(set);
        for(int i=0;i<list.size()-1;i++){
            if(count[list.get(i)-'a']!=count[list.get(i+1)-'a']){return false;}

        }
        return true;
  }
}