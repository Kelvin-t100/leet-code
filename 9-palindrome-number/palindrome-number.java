class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t+=s.charAt(i);
        }
        return (s.equals(t)?true:false);
    }
}