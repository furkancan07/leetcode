class Solution {
       /*  
       // ÇÖZÜM 1 EN KÖTÜ
        public int hammingDistance(int x, int y) {
        String s1=convertString(x);
        String s2=convertString(y);
        int result=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) result++;
        }
        return result;
        
    }
    public String convertString(int x){
      StringBuilder sb = new StringBuilder();
    while (x != 0) {
        sb.append(x % 2);
        x = x / 2;
    }
    sb.reverse();

    
    while (sb.length() < 32) {
        sb.insert(0, '0');
    }

   
   

    return sb.toString();
    }*/
   /* // GÜZEL BİR ÇÖZÜM 
     public int hammingDistance(int x, int y) {
        int result=0;
        while(x>0 || y>0){
            int a=x&1;
            int b=y&1;
            if(a!=b) result++;
            x=x>>1;
            y=y>>1;
        }
        return result;
    }*/
    // ÇÖZÜM 3 -> XOR İLE 
     public int hammingDistance(int x, int y){
        int xor=x^y;
        int count=0;
        while(xor!=0){
           xor=xor&(xor-1);
           count++;
        }
        return count;
     }
}