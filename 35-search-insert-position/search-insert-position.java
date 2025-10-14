class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length&&nums[i]<target;i++){
            ans++;
            if(nums[i]==target)
            return i;
       }return ans;
    }
}