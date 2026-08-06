class Solution {
       public String multiply(String num1,String num2){
        if(num1.equals("0") || num2.equals("0")) return "0";

        int j=num2.length()-1;
       
        List<String> list=new ArrayList<>();

        while(j>=0){
        
        int result=1;
        if(j>=0) result*=num2.charAt(j--)-'0';

        list.add( multiplyWithNum1(num1,result));
    }
        return helper(list);
    }

    private String multiplyWithNum1(String num1, int result) {
        int j=num1.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(j>=0 || carry!=0){
            int sum=carry;//0
            if(j>=0) sum+=(num1.charAt(j--)-'0')*result; // 72
            sb.append(sum%10);
            carry=sum/10;
        }
        return sb.reverse().toString();
    }

  
    public String helper(List<String> list){
        if(list.isEmpty()){
            return "0";
        }
        for(int i=1;i<list.size();i++){
            list.set(i,getStrings(list.get(i),i));
        }
        String result=list.get(0);
        for(int i=1;i<list.size();i++){
          result= addStrings(result,list.get(i));
        }
        return result;


    }
    public String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0) sum+=num1.charAt(i--)-'0';
            if(j>=0) sum+=num2.charAt(j--)-'0';

            int target=sum%10;
            carry=sum/10;
            str.append(target);
        }

        return str.reverse().toString();

    }
    public String getStrings(String str,int index){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<index;i++){
            sb.append('0');
        }
        return sb.toString();

    }
}