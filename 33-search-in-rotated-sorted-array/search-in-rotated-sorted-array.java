class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        for(int in:nums){
            if(in!=target)i++;
            else return i;
        }return -1;
    } 
}