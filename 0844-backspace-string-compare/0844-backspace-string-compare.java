class Solution {
    /*
       public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack=new ArrayDeque<>();
        String s1=convert(s,stack);
        stack.clear();
        String s2=convert(t,stack);
        System.out.println(s1+" "+ s2);
        return s1.equals(s2);

        
    }
    public String convert(String s,Deque<Character> stack){
        for(char c : s.toCharArray()){
            if(c!='#') stack.push(c);
            else if(!stack.isEmpty()) stack.pop();
        }
        StringBuilder s1=new StringBuilder();
        while(!stack.isEmpty()){
            s1.append(stack.pop());
        }
        return s1.toString();
    }
     */
   
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private String buildString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

