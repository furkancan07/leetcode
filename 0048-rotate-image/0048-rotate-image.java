class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
      
        int m=matrix.length;
        for(int i=0;i<m;i++){
           
            list.add(new ArrayList<>());
            for(int j=m-1;j>=0;j--){
                list.get(i).add(matrix[j][i]);
            }
            
        }

         for(int i=0;i<m;i++){
           
            for(int j=0;j<m;j++){
                matrix[i][j]=list.get(i).get(j);
            }
        }

        
       
        
    }
}