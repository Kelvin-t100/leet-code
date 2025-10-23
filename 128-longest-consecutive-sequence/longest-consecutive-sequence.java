class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr);int t=0;
        
        int c=0,high=0;
    for(int i=0;i<arr.length-1;i++){
          if(arr[i]==arr[i+1])continue;
          if(arr[i]-arr[i+1]==-1){ c++;}
          else{//System.out.println("else work"+high+" "+i);
            if(high<=c){high=c;}
            c=0;
          }}
          if(high<c)high=c;
     return ++high;
    }
}