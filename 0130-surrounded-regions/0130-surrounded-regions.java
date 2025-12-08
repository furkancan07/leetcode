class Solution {
    public void solve(char[][] board) {
        int m=board.length ;
        int n=board[0].length ;

        // kenardaki 0 ları t yapalım

        for(int i=0;i<m;i++){
            dfs(i,0,board);
            dfs(i,n-1,board);
        }
        for(int j=0;j<n;j++){
            dfs(0,j,board);
            dfs(m-1,j,board);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='T') board[i][j]='O';
            }
        }
        
    }
    public void dfs(int i,int j,char[][] board){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O') return ;
         
         
         board[i][j]='T';
        
        // YUKARI
        dfs(i-1,j,board);
        // AŞAĞI
        dfs(i+1,j,board);
        // SAĞ
        dfs(i,j+1,board);
        // SOL
        dfs(i,j-1,board);

       
    }
}