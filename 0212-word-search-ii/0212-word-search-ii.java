class Solution {
    char[][] board;
    int[] globalCount;
    int[][] directions={{0,1},{1,0},{-1,0},{0,-1}};
    int m;
    int n;
    Set<String> set;
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        String word=null;
    }
    public List<String> findWords(char[][] board, String[] words) {
        this.board=board;
        this.set=new HashSet<>();
        this.m=board.length;
        this.n=board[0].length;
        this.globalCount=new int[26];

        for(int i=0;i<m;i++ ){
            for(int j=0;j<n;j++){
                globalCount[board[i][j]-'a']++;
            }
        }
        TrieNode root=new TrieNode();
        for(String word : words){
            if(control(word)){
                insert(root,word);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(i,j,root);
            }
        }
        return new ArrayList(set);
    }
     public boolean control(String word){
        int[] count=globalCount.clone();
        for(char c : word.toCharArray()){
            if(count[c-'a']==0) return false;
         }
         return true;
    }
    public void insert(TrieNode root,String word){
        TrieNode current=root;
        for(char c : word.toCharArray()){
            int index=c-'a';
            if(current.children[index]==null) current.children[index]=new TrieNode();
            current=current.children[index];
        }
        current.word=word;
    }
    public void dfs(int i,int j,TrieNode node){
        if(i<0 || i>=m || j<0 || j>=n) return;
        char temp=board[i][j];
        
        if(temp=='.' || node.children[temp-'a']==null) return;
        node=node.children[temp-'a'];
        if(node.word!=null){
            set.add(node.word);
            node.word=null;
        }

        board[i][j]='.';
        

        for(int[] dir  : directions){
            dfs(i+dir[0],j+dir[1],node);
        }

        board[i][j]=temp;

        
    }
   
}