class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer>demo=new HashSet<>();
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j])
              demo.add(nums1[i]); } }
       ArrayList<Integer> ans=new ArrayList<>(demo);
       int arr[]=new int[ans.size()];
  for(int i=0;i<ans.size();i++){
arr[i]=ans.get(i);
  }
return arr; } }