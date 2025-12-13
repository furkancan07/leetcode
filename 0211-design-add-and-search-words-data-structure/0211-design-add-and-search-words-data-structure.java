class WordDictionary {
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
    }

    TrieNode root;

    public WordDictionary() {
        root=new TrieNode(); 
    }
    
    public void addWord(String word) {
        TrieNode temp=root;
        for(char c : word.toCharArray()){
            int index=c-'a';
            if(temp.children[index]==null) temp.children[index]=new TrieNode();
            temp=temp.children[index];
        }
        temp.isWord=true;
        
    }
    
    public boolean search(String word) {
        return dfs(word,root,0);
    }
    public boolean dfs(String word,TrieNode node,int index){
        if(node==null) return false;
        if(index==word.length()) return node.isWord;
        char c =word.charAt(index);
        if(c=='.'){
            for(int i=0;i<26;i++){
                if(node.children[i]!=null){
                    if(dfs(word,node.children[i],index+1)) return true;
                }
            }
            return false;
        }else{
            return dfs(word,node.children[c-'a'],index+1);
        } 
        
     } 
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */