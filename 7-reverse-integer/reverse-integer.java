class Solution {
    public int reverse(int x) {
        int ans=0,c=0;
        if(x<0){
        x*=-1;c=1;}
        while(x>0){
            int t=x%10;
            int ch=ans;
           ans=(ans*10)+t;
           if(!(ans/10==ch))return 0;
           x/=10;
        }if(c==1)
        ans*=-1;
        return ans;
    }
}