class Solution {
public String restoreString(String s, int[] indices) {
        char[] c=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            c[indices[i]]=s.charAt(i);
        }
        return new String(c);
        
    }

    public String restoreString2(String s, int[] indices) {
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