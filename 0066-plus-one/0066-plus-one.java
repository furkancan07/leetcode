class Solution {
    public int[] plusOne(int[] digits) {
        
       StringBuilder sb = new StringBuilder();
for (int d : digits) {
    sb.append(d);
}
String str = sb.toString();
        String result=sum(str,"1");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<result.length();i++){
            list.add(result.charAt(i)-'0');
        }
        

       
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public String sum(String s1,String s2){
       int i=s1.length()-1;
       int j=s2.length()-1;
       int carry=0;
       StringBuilder sb=new StringBuilder();
       while(i>=0 || j>=0 || carry!=0){
        int sum=carry;
        if(i>=0)  sum+=s1.charAt(i--)-'0';
        if(j>=0) sum+=s2.charAt(j--)-'0';
        sb.append(sum%10);
        carry=sum/10;
       }
       return sb.reverse().toString();
    }
}