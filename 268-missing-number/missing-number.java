class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;boolean c=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                ans=i;
                c=false;
                break;
            }
        }if(c)
        ans=nums.length;
        return ans;
    }
}