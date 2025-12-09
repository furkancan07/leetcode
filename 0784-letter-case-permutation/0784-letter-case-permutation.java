class Solution {
    public List<String> letterCasePermutation(String s) {
      List<String> list = new ArrayList<>();
      StringBuilder sb = new StringBuilder();
      dfs(list,sb,s,0);
      return list;

    }
    public void dfs(List<String> list, StringBuilder sb, String s, int index) {
        if(sb.length() == s.length()) {
            list.add(sb.toString());
            return;
        }
        char c = s.charAt(index);

        if(Character.isDigit(c)) {
            sb.append(c);
            dfs(list,sb,s,index+1);
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(Character.toLowerCase(c));
            dfs(list,sb,s,index+1);
            sb.deleteCharAt(sb.length()-1);
            
            sb.append(Character.toUpperCase(c));
            dfs(list,sb,s,index+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}