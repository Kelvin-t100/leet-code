class Solution {
    public String longestPalindrome(String s) {
        String t="",a="";
        int v=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
            int temp=palindrome(s,i,j);
            // System.out.println(v+ " "+i+" "+j);
            if(temp>v){
            t=s.substring(i,j+1);
            System.out.println(t);
            a=t;   
            v=temp;          
            }}
        }
        return a;
    }
    public int palindrome(String s,int l,int r){
      int l1=l,r1=r;
      while(l<r){
       
        if(s.charAt(l)!=s.charAt(r))return 0; 
        l++;r--;
      }
        
            return (r1-l1);
    }
}