class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
             char c=s.charAt(i);
             map.put(c,map.getOrDefault(c,0)+1);
             while(map.get(c)>2){
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                l++;
             }
             int length=i-l+1;
             max=Math.max(max,length);


        }
        return max;

        
    }
}