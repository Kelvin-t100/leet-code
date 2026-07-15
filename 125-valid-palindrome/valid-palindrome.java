class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0,r=s.length()-1;
        while(l<r){
            while(!((s.charAt(l)>='a' && s.charAt(l)<='z')||(s.charAt(l)>='0'&&s.charAt(l)<='9'))&&l<r){
                l++;
            }
            while(!((s.charAt(r)>='a' && s.charAt(r)<='z')||(s.charAt(r)>='0'&&s.charAt(r)<='9'))&&r>l){
                r--;
            }
            if(s.charAt(l)!=s.charAt(r)){System.out.println(l+" "+r);
            return false;}
            l++;r--;
        }
        return true;
    }
}