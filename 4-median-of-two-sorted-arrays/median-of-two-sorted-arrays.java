class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:nums1){
           // if(!ans.contains(i))
            ans.add(i);
        }
        for(int i:nums2){
           // if(!ans.contains(i))
            ans.add(i);
        }
        Collections.sort(ans);
        int s=ans.size();
        //System.out.println(((float)(ans.get(s/2)+ans.get((s/2)-1))/2)+" "+ans.get((s/2)+1));
        double a=(s%2==0?(double)(ans.get((s/2)-1)+ans.get(s/2))/2:ans.get(s/2));
        return a;
    }
}