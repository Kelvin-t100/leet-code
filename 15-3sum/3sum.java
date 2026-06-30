class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<num.length-2;i++){
            if(num[i]>0)
                return ans;
            
            while(i>0&&i<num.length-1&&num[i]==num[i-1]){
                i++;
            }
            int l=i+1,r=num.length-1;
            while(l<r){
                
                int sum=num[i]+num[l]+num[r];
                if(sum==0){
                ans.add(Arrays.asList(num[i],num[l],num[r]));
                l++;r--;
                while(l<r && num[l]==num[l-1]){
                    l++;
                }
                while(l<r && num[r]==num[r+1]){
                    r--;
                }
                }
                if(sum>0)   r--;
                if(sum<0)   l++;

                }
            }
            return ans;
    
        }
    }