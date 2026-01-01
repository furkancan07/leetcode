class Solution {
    public int heightChecker(int[] heights) {
        int[] temp=heights.clone();
        sort(heights,0,heights.length-1);
        int result=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=temp[i]) result++;
        }
        return result;
        
    }
    public void sort(int[] array,int low,int high){
        if(low<high){
           int mid=partition(array,low,high);
           sort(array,low,mid-1);
           sort(array,mid+1,high);
        }
    }
    public  int partition(int[] dizi,int low,int high){
        int pivot=dizi[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(pivot>dizi[j]){
                i++;
                swap(dizi,i,j);
            }
        }
        swap(dizi,i+1,high);
        return i+1;
    }
     public void swap(int[] dizi,int i,int j){
        int temp=dizi[i];
        dizi[i]=dizi[j];
        dizi[j]=temp;
    }
}