class Solution {
    /**
    28 /26 -> 1  AB
    53/26 -> 2 BA
    53%26->1 

    28%26 -> 2 
    
     */
    public static String convertToTitle(int columnNumber) {
      StringBuilder sb=new StringBuilder();
      while(columnNumber>0){
          columnNumber--;
          int mod=columnNumber%26;
          sb.append((char)('A'+mod));
          columnNumber/=26;
      }

         return sb.reverse().toString();
    }

}