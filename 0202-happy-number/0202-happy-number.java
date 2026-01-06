class Solution {
    Set<Integer> set=new HashSet<>();
    public boolean isHappy(int n) {
    if(n==1) return true;
    set.add(n);
    
    int result=0;
    while(n!=0){
        int a=n%10; // 9  1
        result+=a*a;// 82 
        n=n/10;// 1
    }
    System.out.println(result);
    if(set.contains(result)) return false;
    return isHappy(result);
        
    }
}