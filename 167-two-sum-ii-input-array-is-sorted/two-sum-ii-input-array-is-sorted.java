class Solution {
    public int[] twoSum(int[] n, int target) {
        int l=0,r=n.length-1;
        int arr[]=new int[2];
        while(l<r){
            // System.out.println(l+" "+r);
            if(n[l]+n[r]==target){
                arr[0]=l+1;arr[1]=r+1;
              break;
            }
            if(n[l]+n[r]>target){
                r--;
            }
            else
            l++;
        }
        return arr;
    }
    }
