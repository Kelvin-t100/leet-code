class Solution {
    public int[] sortedSquares(int[] n) {
        int l=0,r=n.length-1,i=r;
        int arr[]=new int[r+1];
        while(l<=r){
            if((n[l]*n[l])>(n[r]*n[r])){
                arr[i]=n[l]*n[l];l++;i--;
            }
            else{
            arr[i]=n[r]*n[r];
            r--;i--;}
        }
        return arr;
    }
}