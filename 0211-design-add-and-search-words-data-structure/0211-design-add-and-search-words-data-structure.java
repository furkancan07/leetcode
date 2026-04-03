class WordDictionary {
    public class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
    }
    TrieNode root;

    public WordDictionary() {
        root=new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode current=root;
        for(char c : word.toCharArray()){
            int index=c-'a';
            if(current.children[index]==null) current.children[index] = new TrieNode();
            current=current.children[index];
        }
        current.isWord=true;
        
    }
    
    public boolean search(String word) {
        return dfs(root,word,0);
    }
    public boolean dfs(TrieNode root,String word,int index){
        if(root==null) return false;
        if(index==word.length()) return root.isWord;
        char c=word.charAt(index);
        
        
        if(c=='.'){
            for(int i=0;i<26;i++){
                if(root.children[i]!=null){
                    return dfs(root.children[i],word,index+1);
                }
            }
            return false;
        }else{
            return dfs(root.children[c-'a'],word,index+1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */