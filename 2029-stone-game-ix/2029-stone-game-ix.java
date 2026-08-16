class Solution {
    // aga burada mod frekansı ile daha iyi çözülür gibi
    public boolean stoneGameIX(int[] stones) {
        int[] count=new int[3];
        for(int i : stones){
            count[i%3]++;
        }
        // şimdi eğer 3 e tam bolunenler çift adedse modu 1 ve 2 yi toplayınca otomatikmen 3 e bölünüyor alice her türlü kazanır bunun içimde 2 moda bolunen var mı diye bakalım
        if(count[0]%2==0) return count[1]>0 && count[2]>0;
        // eğer 3 e bolunenlertin sayısı çift değilse alicenin kazanması için bu sefer farkalrı 3 ten fazla olması lazım,
        return Math.abs(count[1]-count[2])>2;
        
    }
}