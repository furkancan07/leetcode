class Solution {
    public int lengthOfLastWord2(String s) {
       List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (sb.length() > 0) {   
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        if (sb.length() > 0) { 
            list.add(sb.toString());
        }

        return list.get(list.size() - 1).length();
    }
    public int lengthOfLastWord(String s){
        String[] array=s.split("\\s++");
        return array.length==0 ? 0 : array[array.length-1].length();
    } 
}
