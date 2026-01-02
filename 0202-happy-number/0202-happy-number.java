class Solution {
    Set<Integer> set=new HashSet<>();
    /*
    7
    49
    16 + 81 
    97 ->81+49
    130
    1+9+0
    10
    1
     */
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(set.contains(n)) return false;
        set.add(n);
        int result=0;
        while(n!=0){
            int x=n%10;
            result+=x*x;
            n=n/10;
        }
        System.out.println(result);
        
        return isHappy(result);
        
    }
}