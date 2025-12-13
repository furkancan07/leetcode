
/*
Trie Ağacına kelimeleri ekledik hepsi amac prefixi bulmak countumuz 1 i geçerse demek ki bir kelime a ile balayıp bi kelime b ile başlamış hata veya isende gelmişse bunun dışında tüm charları almak gerek
 */
class Solution {
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isEnd=false;
    }
    TrieNode root=new TrieNode();
    public String longestCommonPrefix(String[] strs) {
        for(String  s :strs){
            insert(s);
        }
        TrieNode current=root;
        StringBuilder sb=new StringBuilder();
        while(true){
            int count=0;
            int nextIndex=-1;

            for(int i=0;i<26;i++){
                if(current.children[i]!=null){
                    count++;
                    nextIndex=i;
                }
            }
            if(count!=1 || current.isEnd) break;
            sb.append((char) (nextIndex + 'a'));
            current = current.children[nextIndex];
        }

       return sb.toString();

        
    }
    public void insert(String s){
        TrieNode current=root;
        for(char c : s.toCharArray()){
            int index=c-'a';
            if(current.children[index]==null) current.children[index]=new TrieNode();
            current=current.children[index];
        }
        current.isEnd=true;
    }
}