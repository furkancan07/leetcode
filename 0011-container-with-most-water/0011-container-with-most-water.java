class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
         int length=j-i;
         int min=Math.min(height[i],height[j]);
         max=Math.max(max,length*min);
         if(height[i]<height[j]) i++;
         else j--;
        }
        return max;
        
    }
}