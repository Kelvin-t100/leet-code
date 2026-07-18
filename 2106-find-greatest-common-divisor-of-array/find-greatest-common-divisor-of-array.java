class Solution {
    public int findGCD(int[] nums) {
        int lar=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            lar=(lar>i)?lar:i;
            min=(min>i)?i:min;
        }
       return fac(lar,min);
    }

    public int fac(int a,int b){
        if(b==0){
            return a;
        }
        System.out.println(b%a+" "+b+" "+a);
        return fac(b,a%b);
    }
}