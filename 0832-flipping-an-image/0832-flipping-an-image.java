class Solution {
    /*
       1 1 0
       1 0 1
       0 0 0 

       0 1 1 
       1 0 1 
       0 0 0

       1 0 0 
       0 1 0 
       1 1 1 


    
     */
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] result=new int[n][n];
        List<List<Integer>> list=new ArrayList<>(); 
        // satir ters cevir
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
            for(int j=n-1;j>=0;j--){
                  list.get(i).add(image[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(list.get(i).get(j)==1) result[i][j]=0;
                else result[i][j]=1;
            }
        }
        return result;
    }
}