class Solution {
    public int majorityElement(int[] arr) {
     int c=0,ele=0,maj=0;
        for(int i:arr){
            if(c==0)
            ele=i;
 c+=(ele==i) ? 1:-1;
        }
        return ele;
    }
}