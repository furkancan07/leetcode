class Solution {
    public String reversePrefix(String s, int k) {
       String result=s.substring(0,k);
       return reverse(result).append(s.substring(k)).toString();
        
    }
    public StringBuilder reverse(String s){
    StringBuilder sb = new StringBuilder(s);
    int l = 0;
    int r = sb.length() - 1;

    while (l < r) {
        char temp = sb.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, temp);

        l++;
        r--;
    }
    return sb;
    }
}