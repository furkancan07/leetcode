class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target=image[sr][sc];
        if(target!=color){
        result(image,target,color,sr,sc);
        }
        
        return image;
    }
    public void result(int[][] image,int target,int color,int i,int j){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]!=target) return;
        image[i][j]=color;
        // aşağı 
        result(image,target,color,i+1,j);
        // yukaro
        result(image,target,color,i-1,j);
        // sol
        result(image,target,color,i,j-1);
        // sağ
        result(image,target,color,i,j+1);
    }
}