class Solution {
    // tek 3  011 tüm tek sayıların en sağı 1
    // çift sayinn en sağı her zamman 0
    // & en sağfakini

    public int[] countBits(int n) {
        int[] array=new int[n+1];
        for(int i=0;i<=n;i++){
            array[i]=find(i);
        }
        return array;
        
    }
    public int find(int n){
        if(n==0) return 0;
        if((n&n-1)==1) return 1;
    int count=0;
    while(n!=0){
    n=n&(n-1);
    count++;
       }
       return count;
    }
    
}