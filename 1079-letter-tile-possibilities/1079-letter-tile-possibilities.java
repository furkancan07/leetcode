class Solution {
   public int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        String sortedTiles = new String(chars);
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        boolean[] visited=new boolean[tiles.length()];
        dfs(sortedTiles,list,sb,visited);
        return list.size()-1;

    }
    public void dfs(String tiles,List<String> list,StringBuilder sb, boolean[] visited){

        list.add(sb.toString());

        for(int i=0;i<tiles.length();i++){
            if(visited[i]) continue;
            if(i>0 && tiles.charAt(i)==tiles.charAt(i-1) && !visited[i-1]) continue;

            sb.append(tiles.charAt(i));
            visited[i]=true;
            dfs(tiles,list,sb,visited);
            sb.deleteCharAt(sb.length()-1);
            visited[i]=false;
        }
    }
}