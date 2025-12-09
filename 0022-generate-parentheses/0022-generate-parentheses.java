class Solution {

    /* n kadar olacaksa (-> ne kadar )-> n kadar uzunluğumuz 2n
       açılan kısıma open diyelim ( bunu koyacağız n kadar olması lazım şartımız open<n
       ) kapanan kısmımız ise yine nkadar olması gerek ama open ile doğrusal gitmesi lazım
       o yüzden close<open olacaş şartımız
       gerisi backtracking
    */
    public List<String> generateParenthesis(int n) {
       List<String> list=new ArrayList<>();
       StringBuilder sb=new StringBuilder();
       dfs(list,sb,0,0,n);
       return list;
    }
    public void dfs(List<String> list, StringBuilder sb,int open,int close,int n){
        if(sb.length()==2*n){
            list.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append("(");
            dfs(list,sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(")");
            dfs(list,sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}