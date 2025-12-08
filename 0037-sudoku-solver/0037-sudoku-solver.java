class Solution {
    // backtracking
    public void solveSudoku(char[][] board) {
        solver(board);
    }
    public boolean solver(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1' ;c<='9';c++){
                        if(isValid(i,j,board,c)){
                        board[i][j]=c;
                        if(solver(board)){
                            return true;
                        }else{
                            board[i][j]='.';
                        }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    // satir // sütün // 3*3 kontrol
    public boolean isValid(int row,int col,char[][] board,char c){
        for(int i=0;i<9;i++){
        if(board[row][i]==c || board[i][col]==c) return false;
        int newRow=3*(row/3)+i/3; // 4 
        int newCol=3*(col/3)+i%3;  // 7
        if(board[newRow][newCol]==c) return false;
        }
        return true;
       
    }
}