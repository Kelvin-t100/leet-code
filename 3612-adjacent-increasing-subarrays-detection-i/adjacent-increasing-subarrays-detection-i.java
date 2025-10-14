class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        boolean ans=true;if(k==1)return ans;
        int arr[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            arr[i]=nums.get(i);
        }
        for(int i=0;i<arr.length&&(i+(2*k))-1<arr.length;i++){
            int window[]=new int[k];
            for(int j=i,w=0;w<k;j++,w++){
                window[w]=arr[j];
            }
            System.out.println("checking"+" "+(-2<-1));
            int c=1;
            for(int j=0;j<k-1;j++){
                if(window[j]<window[j+1])c++;
                }boolean lin=(c==k)?true:false;
            if(lin){int check=1;
            System.out.println(i+"I");
            for(int q:window)System.out.println(q);
                for(int j=i+k,w=0;w<k-1&&j<arr.length;j++,w++){
                   if(arr[j]<arr[j+1])check++;
                }
                System.out.println(check+"check");
                if(check==k)return true;
            }
            }return false;
        }
    }
