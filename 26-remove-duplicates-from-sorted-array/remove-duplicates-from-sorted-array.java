class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new LinkedHashSet<>();
        for(int i:nums){
            set.add(i);
        }
       ArrayList<Integer> set1=new ArrayList<>(set);
        for(int i=0;i<set.size();i++){
        nums[i]=set1.get(i);
      }
      return set.size();
    }
}