class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left =0;
        int right = height.length-1;

        while(left<=right){
            int width = right - left;
            int capacity = width * Math.min(height[left],height[right]);
            max=Math.max(max,capacity);
            if(height[left]<height[right]){
                left=left+1;
            }
            else{
                right = right - 1;
            }
        }
        return max;
    }
}