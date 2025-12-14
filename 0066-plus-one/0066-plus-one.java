class Solution {
    public int[] plusOne(int[] digits) {
       StringBuilder sb = new StringBuilder();
        for (int d : digits) {
           sb.append(d);
           }
        
        sb=sum(sb.toString());
        int[] res=new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            res[i]=sb.charAt(i)-'0';
        }

        return res;
    }
    public StringBuilder sum(String s1){
       int i=s1.length()-1;
       
       int carry=1;
       StringBuilder sb=new StringBuilder();
       while(i>=0 || carry!=0){
        int sum=carry;
        if(i>=0)  sum+=s1.charAt(i--)-'0';
        sb.append(sum%10);
        carry=sum/10;
       }
       return sb.reverse();
    }
}