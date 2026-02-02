class Solution {
    public boolean isPowerOfThree(int n) {
      long i=1;
      while(i<n){
        i=i*3;
        System.out.println(i);
      }
      return (i==n)?true:false;
    }
}