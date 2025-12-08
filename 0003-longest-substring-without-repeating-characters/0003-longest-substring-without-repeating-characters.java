/*
Set
abcadefbef

abc a
int l=0
for i : s

while(tekrar edilen kelimeye)
set.remove(l)
l++

set add

bcade ->5

 */


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            int length=i-l+1;
            max=Math.max(max,length);

        }
        return max;
        
    }
}