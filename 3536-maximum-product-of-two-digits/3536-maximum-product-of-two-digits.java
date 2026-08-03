class Solution {
     public int maxProduct(int n) {
        if(n<100) return (n%10)*(n/10);
        int temp1=0;
        int temp2=0;
        while(n>0){
          int mod=n%10;
          if(temp1<mod){
            temp2=temp1;
            temp1=mod;
          }else if(temp2<mod){
            temp2=mod;
          }
          n=n/10;
        }
        return temp1*temp2;
        
    }
    public int maxProduct2(int n) {
        int result=1;
        List<Integer> list=new ArrayList<>();
        while(n>0){
            int mod=n%10;
            list.add(mod);
            n=n/10;
        }
        list.sort((a,b)->b-a);
        return list.get(0)*list.get(1);
    }
}