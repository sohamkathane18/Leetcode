class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int h=height[left]<height[right]?height[left]:height[right];
            int d= right-left;
            int tempArea=h*d;
            max=max>tempArea?max:tempArea;
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}