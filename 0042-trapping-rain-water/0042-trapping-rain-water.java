class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftbefore = height[l];
        int rightbefore = height[r];
        int total = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                leftbefore = Math.max(leftbefore, height[l]); // önceki değerlerden maximumu al 
                total += leftbefore - height[l];

            } else {
                r--;
                rightbefore = Math.max(rightbefore, height[r]);
                total += rightbefore - height[r];

            }
        }
        return total;
    }
}