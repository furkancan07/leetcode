class Solution {
    // ilk çözüm daha performanslı
    public boolean isAnagram(String s, String t) {
    /*    char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);*/
       if(s.length()!=t.length()) return false;

        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int i : count){
         if(i!=0) return false; 
        }
        return true;
    }
}