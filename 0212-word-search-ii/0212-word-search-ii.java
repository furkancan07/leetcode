class Solution {
    char[][] board;
    int[] globalCount;
    int[][] directions={{0,1},{1,0},{-1,0},{0,-1}};
    int m;
    int n;
    Set<String> set;
    class TrieNode{
        Map<Character,TrieNode> children=new HashMap<>();
        String word=null;
    }
    public List<String> findWords(char[][] board, String[] words) {
        this.board=board;
        this.set=new HashSet<>();
        this.m=board.length;
        this.n=board[0].length;
        this.globalCount=new int[128];

        for(int i=0;i<m;i++ ){
            for(int j=0;j<n;j++){
                globalCount[board[i][j]]++;
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
            if(--count[c]<0) return false;
         }
         return true;
    }
    public void insert(TrieNode root,String word){
        TrieNode current=root;
        for(char c : word.toCharArray()){
            current.children.putIfAbsent(c,new TrieNode());
            current=current.children.get(c);
        }
        current.word=word;
    }
    public void dfs(int i,int j,TrieNode node){
        if(i<0 || i>=m || j<0 || j>=n) return;
        char temp=board[i][j];
        
        if(temp=='.' || !node.children.containsKey(temp)) return;
        node=node.children.get(temp);
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