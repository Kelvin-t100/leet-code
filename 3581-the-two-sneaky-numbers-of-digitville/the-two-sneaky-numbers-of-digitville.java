class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> dupes=new ArrayList<>();
        for(int i:nums){
            if(ans.contains(i)){
               dupes.add(i);
            }else
            ans.add(i);
        }
        int arr[]=new int[dupes.size()];int in=0;
        for(int i:dupes){
            arr[in]=i;in++;
        }
         return arr;
    }
}