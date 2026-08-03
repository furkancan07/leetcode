class Solution {
    public int maxProduct(int n) {
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