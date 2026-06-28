class Solution {

    public int maxArea(int[] height) {
        int ans=0,tem=0,l=0,r=height.length-1;
        while(l<r){
            int h=height[l]>height[r]?height[r]:height[l];
            tem=h*(r-l);
            ans=Math.max(tem,ans);
            if(height[l]>height[r]){
                r--;
            }else
            l++;
        }return ans;
    }
}