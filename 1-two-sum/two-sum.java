class Solution {
    public int[] twoSum(int[] arr, int tar) {
        int ans[]=new int[2];boolean c=false;
        for(int i=0;i<arr.length;i++){
            if(c)break;
            for(int j=0;j<arr.length;j++){
                if((arr[i]+arr[j]==tar)&&i!=j){
                   ans[0]=i;ans[1]=j;
                  c=true; break;
                }
            }
        }
        return ans;
    }
}