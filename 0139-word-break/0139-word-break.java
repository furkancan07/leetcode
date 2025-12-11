class Solution {
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
    }
     TrieNode root=new TrieNode();
     
    public boolean wordBreak(String s, List<String> wordDict) {
       
        
        for(String str : wordDict){
            TrieNode current=root;
            for(char c : str.toCharArray()){
                int idx=c-'a';
                if(current.children[idx]==null) current.children[idx]=new TrieNode();
                current=current.children[idx];
            }
             current.isWord=true;
             
        }

        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0;i<s.length();i++){
            if(!dp[i]) continue;
            TrieNode current=root;
            for(int j=i;j<s.length();j++){
                int index=s.charAt(j)-'a';
                if(current.children[index]==null) break;
                current=current.children[index];
                if(current.isWord){
                    dp[j+1]=true;
                }

            }
        }
        
          return dp[s.length()];
        
    }
    // time hatası
    public boolean backTracking(String s,int index){
        if(index==s.length()) return true;
       
        TrieNode current=root;
        for(int i=index;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(current.children[idx]==null) return false;
            current=current.children[idx];
            if(current.isWord){
                if(backTracking(s,i+1)){
                     
                     return true;
                } 
            }
        }
       
        return false;
    }
   
}