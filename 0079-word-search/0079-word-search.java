// dfs
// count dizisi
// matrisimde a dan 3 tane worde 4 tane var 

//  tahtadaki tüm harfler ne kadar geçiyo kontrol ettik
// bize verilen kelimede eğer tahtada kullanılan harften daha fazla o harf geçmise direk false
// index tabanlı ilerledik index== kelime uznluğuna eşit ise true 
// backtracking
class Solution {
    int m;
    int n;
    char[][] board;
    String word;
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.m=board.length;
        this.n=board[0].length;
        this.word=word;

        // frekansları 
        int[] count=new int[128];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                count[board[i][j]]++;
            }
        }

        for(char c : word.toCharArray()){
            if(count[c]==0){
                return false;
            }
        }

        //
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i,j,0)) return true;
                }
            }
        }


        return false; 
    }

    public boolean dfs(int i,int j,int index){
        if(index==word.length()) return true;

        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(index)) return false;

        char temp=board[i][j];
        board[i][j]='.';

        for(int[] dir : directions){
            int ni=dir[0]+i;
            int nj=dir[1]+j;

            if(dfs(ni,nj,index+1)) return true;
        } 

        board[i][j]=temp;
        return false;
    }
}