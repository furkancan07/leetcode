class Solution {
    public boolean isValidSudoku2(char[][] board) {
          // satir kontrol  i,j j,i
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!set.add(board[i][j])) return false;
                
            }
        }

        // sutun kontrol
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(!set.add(board[j][i])) return false;
                
            }
        }
        // 3*3 kontrol
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                // 3*3 matrisi kontrol etme
                Set<Character> set=new HashSet<>();
                for(int a=i;a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        if(board[a][b]=='.') continue;
                        if(!set.add(board[a][b])) return false;
                        
                    }

                }
            }
        }

       return  true;
    }

    public boolean isValidSudoku(char[][] board) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){  
                char c=board[i][j];
                if(c=='.') continue;
                    if(!set.add(c+"satir"+i) || !set.add(c+"sutun"+j) || !set.add(c+"box"+i/3+"-"+j/3)) return false;
                }
            
        }
        return true;
    }
    
}