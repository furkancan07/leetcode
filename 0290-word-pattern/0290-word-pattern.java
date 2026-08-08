class Solution {
        public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        String[] arr=s.split(" ");
        if(arr.length!=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            map.putIfAbsent(pattern.charAt(i),set.contains(arr[i])?"":arr[i]);
            set.add(arr[i]);
            if(!map.get(pattern.charAt(i)).equals(arr[i])) return false;
        }
        return true;

    }
}