class Solution {
    public List<String> letterCombinations(String digits) {
        
        Map<Character,List<Character>> map=new HashMap<>();

        map.put('2',Arrays.asList('a','b','c'));
        map.put('3',Arrays.asList('d','e','f'));
        map.put('4',Arrays.asList('g','h','i'));
        map.put('5',Arrays.asList('j','k','l'));
            
        map.put('6',Arrays.asList('m','n','o'));
        map.put('7',Arrays.asList('p','q','r','s'));
        map.put('8',Arrays.asList('t','u','v'));
        map.put('9',Arrays.asList('w','x','y','z'));

     

        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(list,sb,digits,0,map);
        return list;
    }
    public void dfs(List<String> list,StringBuilder sb,String digits,int index,Map<Character,List<Character>> map){
        if(sb.length()==digits.length()){
            list.add(sb.toString());
            return;
        }
        if(sb.length()>digits.length()) return;
        if(index>=digits.length()) return ; 
        char c =digits.charAt(index);
        List<Character> nums=map.get(c);
        for(char a : nums){
            sb.append(a);
            dfs(list,sb,digits,index+1,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}