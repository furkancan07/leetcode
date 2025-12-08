class Solution {
    public String addBinary(String a, String b) {
       /* int s1=Integer.parseInt(a,2);
        int s2=Integer.parseInt(b,2);
        int num=s1+s2;
        return Integer.toBinaryString(num);*/


        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            sb.append(sum%2);
            carry=sum/2;
        }
        if(carry!=0) sb.append(carry);
        
        return sb.reverse().toString();
    }
}