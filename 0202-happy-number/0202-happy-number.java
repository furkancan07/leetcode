class Solution {
    Set<Integer> set=new HashSet<>();
    public boolean isHappy(int n) {
        if(n==0) return false;
        if(n==1) return true;
       // set.add(n);
        int result=0;
        while(n!=0){
            int mod=n%10;
            result+=mod*mod;
            n=n/10;
        }  
        if(!set.add(result)) return false;
        return isHappy(result);
    }
}