class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        int a=nums.length;
        for(int i=0;i<a;i++){
            if(nums[i]!=val){
                 nums[ans++]=nums[i];
        }}
        return ans;
    }
}