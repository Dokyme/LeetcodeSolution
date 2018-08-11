class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxArea=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int area=(j-i)*h;
            maxArea=Math.max(maxArea,area);
            while(i<j&&h>=height[i]){
                i++;
            }
            while(i<j&&h>=height[j]){
                j--;
            }
        }
        return maxArea;
    }
}