class Solution {
    public int smallestNumber(int n) {
        for(int i=2;;i*=2){
            if(i>n){
                return i-1;
            }
        }
    }
}