class Solution {
    public int numSquares(int n) {
       List<Integer> dir =new ArrayList<>();
       
        for (int i = 1; i * i <= 10000; i++) {
    dir.add(i * i);
        }
         int[] array=new int[n+1];
        Arrays.fill(array,n+1);
        array[0]=0;

        for(int d : dir){
            for(int i=d;i<=n;i++){
                array[i]=Math.min(array[i],array[i-d]+1);
            }
        }
        return array[n]>n ? -1 : array[n];
    }
}