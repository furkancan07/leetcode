class Solution {
    public String restoreString(String s, int[] indices) {
          Map<Integer,Character> map=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<indices.length;i++){
            sb.append(map.get(i));
        }
        return sb.toString();
        
    }
}