class Solution {
 public static String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        int[] count=new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        int first=0;
        int last=s.length()-1;
        char[] chars=new char[s.length()];
        for(int i=0;i<26;i++){
            while(count[i]>0 && count[i]>=2){
                char temp=(char)(i+'a');

                    chars[first++]=temp;
                    chars[last--]=temp;
                    count[i]-=2;
            }
        }
        for(int i=0;i<26;i++){
            while(count[i]>0){
                char temp=(char)(i+'a');
                chars[last--]=temp;
                count[i]--;
            }
        }
        return new String(chars);


    }
}