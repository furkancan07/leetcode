class Solution {
    public class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isEnd=false;
    }
    TrieNode root=new TrieNode();
    public String longestCommonPrefix(String[] strs) {
        for(String str :strs){
            insert(str);
        }
        TrieNode current=root;
        StringBuilder sb=new StringBuilder();
        while(true){
            int pointer=0;
            int index=-1;
            for(int i=0;i<26;i++){
                if(current.children[i]!=null){
                    pointer++;
                    index=i;
                }
            }
            if(pointer!=1 || current.isEnd) break;
            sb.append((char)(index+'a'));
            current=current.children[index];
        }
        return sb.toString();
        
    }
    public void insert(String word){
        TrieNode current=root;
        for(char c : word.toCharArray()){
            int index=c-'a';
            if(current.children[index]==null) current.children[index]=new TrieNode();
            current=current.children[index];
        }
        current.isEnd=true;
    }
}