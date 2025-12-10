class Solution {
    public List<String> letterCombinations(String digits) {
        
        Map<Character,String> map=new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
            
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

     

        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(list,sb,digits,0,map);
        return list;
    }
    public void dfs(List<String> list,StringBuilder sb,String digits,int index,Map<Character,String> map){
        if(sb.length()==digits.length()){
            list.add(sb.toString());
            return;
        }
        if(sb.length()>digits.length()) return;
        if(index>=digits.length()) return ; 
        char c =digits.charAt(index);
        String nums=map.get(c);
        for(char a : nums.toCharArray()){
            sb.append(a);
            dfs(list,sb,digits,index+1,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}